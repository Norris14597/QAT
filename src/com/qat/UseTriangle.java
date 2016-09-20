package com.qat;
import java.util.Scanner;

public class UseTriangle {

    public static void main(String[] args) {
        String inputString = "";
        boolean cont = false;
        double a = -1, b = -1, c = -1;
        boolean f = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the 3 sides of the triangle as doubles:");
        while (!f) {
            inputString = input.next();
            try {
                a = Double.parseDouble(inputString);
                f = true;
            } catch (NumberFormatException e) {
                System.out.println("The number you entered did not resemble a double.\nPlease try again:");
            }
        }
        do {
            System.out.println("Great, please enter the second side:");
            f = false;
            while (!f) {
                inputString = input.next();
                try {
                    b = Double.parseDouble(inputString);
                    f = true;
                } catch (NumberFormatException e) {
                    System.out.println("The number you entered did not resemble a double.\nPlease try again:");
                }
            }
            System.out.println("Great, please enter the third side:");

            f = false;
            while (!f) {
                inputString = input.next();
                try {
                    c = Double.parseDouble(inputString);
                    f = true;
                } catch (NumberFormatException e) {
                    System.out.println("The number you entered did not resemble a double.\nPlease try again:");
                }
            }

            try {
                Triangle t = new Triangle(a, b, c);
                if (t.isEquilateral())
                    System.out.println("The triangle formed by your input is equilateral");
                if (t.isIsosceles())
                    System.out.println("The triangle formed by your input is isosceles");
                if (t.isScalene())
                    System.out.println("The triangle formed by your input is scalene");
            } catch (IllegalArgumentException e) {
                System.out.println("The numbers you entered did not resemble a triangle.");
            }
            System.out.println("If you would like to continue please enter another side as a double:");
            inputString = input.next();
            try {
                a = Double.parseDouble(inputString);
                cont = true;
            } catch (NumberFormatException e) {
                cont = false;
            }
        } while (cont);
    }
}
