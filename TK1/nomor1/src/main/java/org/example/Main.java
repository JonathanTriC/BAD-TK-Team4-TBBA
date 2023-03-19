package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di program String Manipulation");
        System.out.println("=============================================");
        System.out.println("1. Program yang pertama yaitu, mengubah huruf kecil menjadi besar, begitupun sebaliknya");
        System.out.print("Silahkan Masukkan String A: ");
        String stringA = input.nextLine();
        System.out.print("Kemudian Masukkan String B: ");
        String stringB = input.nextLine();

        number1(stringA, stringB);
        number2(stringA, stringB);
        number3(stringA, stringB);
        number4(stringA, stringB);
    }

    // Nomor 1
    public static void number1(String stringA, String stringB) {
        System.out.println("String A setelah diubah: " + swappedStr(stringA));
        System.out.println("String B setelah diubah: " + swappedStr(stringB));
    }

    public static String swappedStr(String str) {
        StringBuilder swappedStr = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                swappedStr.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                swappedStr.append(Character.toUpperCase(c));
            } else {
                swappedStr.append(c);
            }
        }
        return swappedStr.toString();
    }

    // Nomor 2
    public static void number2(String stringA, String stringB) {
        System.out.print("\n");
        System.out.println("2. Program yang kedua yaitu, menghitung jumlah huruf");

        System.out.println("Jumlah huruf String A: " + countChar(stringA));
        System.out.println("Jumlah huruf String B: " + countChar(stringB));
    }

    public static Integer countChar(String str) {
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ')
                count++;
        }
        return count;
    }

    // Nomor 3
    public static void number3(String stringA, String stringB) {
        String gabungan = stringA + ", " + stringB;
        System.out.print("\n");
        System.out.println("3. Program yang ketiga, yaitu menggabungkan kedua inputan string");
        System.out.println("Hasil penggabungan: " + gabungan);
    }

    // Nomor 4
    public static void number4(String stringA, String stringB) {
        System.out.print("\n");
        System.out.println("4. Program yang keempat yaitu, membalik susunan huruf");

        System.out.println("String A setelah dibalik:" + reverseString(stringA));
        System.out.println("String B setelah dibalik:" + reverseString(stringB));
    }

    public static String reverseString(String str){
        StringBuilder reverseStr =new StringBuilder(str);
        reverseStr.reverse();
        return reverseStr.toString();
    }
}