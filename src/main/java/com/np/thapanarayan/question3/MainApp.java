package com.np.thapanarayan.question3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReference;

public class MainApp {

    public static Visit visit = new Visit();
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int selection = -1;
        do {
            selection = menu();
            if(selection == 1) {
                displayCustomers();
            } else if (selection == 2) {
                displayProducts();
            } else if ( selection == 3) {
                displayService();
            } else if (selection == 4) {
                visitCustomer();
            }
        } while (selection != 0);
    }


    public static int menu() {
        int selection;
        System.out.println("Choose from these choices");
        System.out.println("-------------------------");
        System.out.println("1 - List Members");
        System.out.println("2 - List Products");
        System.out.println("3 - List Service");
        System.out.println("4 - Visit");
        System.out.println("0 - Quit");
        System.out.println();
        selection = input.nextInt();
        return selection;
    }

    public static void displayCustomers() {
       Map<Integer, Customer> customerList =  visit.getCustomers();
        System.out.println("Product Details");
        System.out.println("------------------------------------");
       customerList.forEach( (key, customer) -> {
           System.out.println("Id : " + customer.getId() + ", Name :" + customer.getName() + ", Membership: " + customer.getMembershipType());
       });
        System.out.println();
    }

    public static void displayProducts() {
        Map<String, Double> products =  visit.getProducts();
        System.out.println("Product Details");
        System.out.println("------------------------------------");
        products.forEach((key, value) -> System.out.println("Name: " + key + ", Price : " + value));
        System.out.println();
    }

    public static void displayService() {
        Map<String, Double> products =  visit.getServices();
        System.out.println("Services Details");
        System.out.println("------------------------------------");
        products.forEach((key, value) -> System.out.println("Name: " + key + ", Price : " + value));
        System.out.println();
    }

    public static void visitCustomer() {
        List<String> purchaseList = new ArrayList<>();
        List<String> serviceList = new ArrayList<>();
        int customerId = -1;
        String nextService = "";
        do {
            System.out.println("Enter customer ID (number) : ");
            customerId  = input.nextInt();
            if (!visit.getCustomers().containsKey(customerId)) {
                System.out.println("Invalid Customer Id");
            }
        } while (!visit.getCustomers().containsKey(customerId));
        do {
            System.out.println("Enter service taken: ('none' for no-service)");
            nextService = input.next();
            if(!nextService.equalsIgnoreCase("none")){
                serviceList.add(nextService);
                System.out.println("take more (y/n)");
                nextService = input.next();
            }
        } while (!(nextService.equalsIgnoreCase("none") || nextService.equalsIgnoreCase("n")));

        do {
            System.out.println("Enter product purchased: ('none' for no-purchase)");
            nextService = input.next();
            if(!nextService.equalsIgnoreCase("none")) {
                purchaseList.add(nextService);
                System.out.println("take more (y/n)");
                nextService = input.next();
            }
        } while (!(nextService.equalsIgnoreCase("none") || nextService.equalsIgnoreCase("n")));

        calculateTotalAmount(customerId, purchaseList, serviceList);
    }

    public static void calculateTotalAmount(int customerId, List<String> purchaseList, List<String> serviceList) {
         Customer customer = visit.getCustomers().get(customerId);
         Discount discount = visit.getServiceDiscountRate(customer.getMembershipType());
         System.out.println("Membership Type: " + customer.getMembershipType());
         System.out.println("Discount Rate: " + discount.getRate());
         AtomicReference<Double> totalCost = new AtomicReference<>( 0d);
         if(!purchaseList.isEmpty() || !serviceList.isEmpty() ) {
             System.out.println("Item: \t\t Price: \t Discount price: \t Discounted Price:");
         }
         purchaseList.forEach(s -> {
             Double price = visit.getProducts().get(s);
             double discountPrice = price * discount.getRate() /100;
             double discountedPrice = price - discountPrice;
             System.out.println(s + "\t\t" + price  + "\t\t" + discountPrice + "\t\t\t\t" + discountedPrice);
             totalCost.updateAndGet(v ->(v + discountedPrice));
         });
         serviceList.forEach(s -> {
             Double price = visit.getServices().get(s);
             double discountPrice = price * discount.getRate()/100;
             double discountedPrice = price - discountPrice;
             System.out.println(s + "\t\t" + price  + "\t\t" + discountPrice + "\t\t\t\t" + discountedPrice);
             totalCost.updateAndGet(v ->(v + discountedPrice));
         });

        if(!purchaseList.isEmpty() || !serviceList.isEmpty() ) {
            System.out.println("Total Cost: " + totalCost.get());
        } else {
            System.out.println("No service - purchase made");
        }
        System.out.println("Thank you for visit \n\n");

    }
}
