package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String binary;

        System.out.print("Input angka biner: ");
        binary = input.nextLine();

            if (binary.length() > 8) {
                System.out.println("Digit kelebihan!");
            } else {
                int decimal = Integer.parseInt(binary, 2);
                System.out.println("Angka desimal dari biner " + binary + " adalah: " + decimal);
            }
        }
    }
}