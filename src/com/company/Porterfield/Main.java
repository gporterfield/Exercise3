package com.company.Porterfield;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        double temp1 = 0;
        double temp2;

        do {
            temp1 = getTemp1();

            if (temp1 != -460) {
                temp2 = convert(temp1);
                display(temp2);
            }

        } while (temp1 != -460);
    }

    static double getTemp1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit(-460 to exit): ");
        double temp1 = input.nextDouble();
        return temp1;
    }

    static double convert(double temp1) {
        double temp2 = (temp1 - 32.0) * (5.0 / 9.0);
        return temp2;
    }

    static void display(double temp2) {
        System.out.println("The Degree in Celsius is: " + temp2 + ". ");
    }
}


