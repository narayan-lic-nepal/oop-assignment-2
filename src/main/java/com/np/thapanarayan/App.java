package com.np.thapanarayan;

import com.np.thapanarayan.question3.Customer;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        calculateAreaOfTriangle();
        calculateAreaOfCircle();
        calculatePerimeterOfCircle();

    }

    static void calculateAreaOfTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base of triangle");
        int base = scanner.nextInt();
        System.out.println("Enter height of triangle");
        int height = scanner.nextInt();

        double area =  base * height / 2.0;
        System.out.println("Area of triangle : " + area);
        scanner.close();
    }

    static void calculateAreaOfCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of Circle");
        int radius = scanner.nextInt();

        int area = 22/7 * radius ^ 2;
        System.out.println("Area of Circle : " + area);
        scanner.close();
    }

    static void calculatePerimeterOfCircle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of Circle");
        int radius = scanner.nextInt();

        int perimeter = 2 * 22/7 * radius ;
        System.out.println("Perimeter of Circle : " + perimeter);
        scanner.close();
    }
}
