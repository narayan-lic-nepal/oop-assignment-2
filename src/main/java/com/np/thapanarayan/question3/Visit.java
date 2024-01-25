package com.np.thapanarayan.question3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Visit {

    private static final Map<Integer, Customer> customers = new HashMap<>();
    private static final Map<String, Double> productDb = new HashMap<>();
    private static final Map<String, Double> serviceDb = new HashMap<>();
    private static final Map<Membership, Discount> discountDb = new HashMap<>();

    static {
        customers.put(1, new Customer(1, "Ram", Membership.PREMIUM));
        customers.put(2, new Customer(2, "Hari", Membership.GOLD));
        customers.put(3, new Customer(3, "Shyam", Membership.SILVER));
        customers.put(4, new Customer(4, "Bhim", Membership.NONE));
        customers.put(5, new Customer(5, "Sita", Membership.GOLD));


        productDb.put("shampoo", 450d);
        productDb.put("hair oil", 250d);
        productDb.put("comb", 100d);
        productDb.put("saving-cream", 400d);
        productDb.put("hair-gel", 300d);

        serviceDb.put("haircut", 150d);
        serviceDb.put("saving", 100d);
        serviceDb.put("facial", 250d);
        serviceDb.put("hair-color", 150d);
        serviceDb.put("body-massage", 200d);

        discountDb.put(Membership.PREMIUM, new Discount(20d));
        discountDb.put(Membership.GOLD, new Discount(15d));
        discountDb.put(Membership.SILVER, new Discount(10d));
        discountDb.put(Membership.NONE, new Discount(0d));

    }

   public Map< Integer, Customer> getCustomers() {
        return customers;
   }

   public Map<String, Double> getProducts() {
        return productDb;
   }

   public Map<String, Double> getServices() {
        return serviceDb;
   }

   public Discount getServiceDiscountRate(Membership membershipType) {
        return discountDb.get(membershipType);
   }


    
}
