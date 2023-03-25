package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Selamat Datang di Program Perekrutan Karyawan");
        System.out.println("=============================================");
        System.out.println("Pelamar akan diarahkan untuk memasukkan nama, umur dan posisi yang akan dilamar.");
        System.out.println("Untuk menentukan apakah pelamar memenuhi kriteria sesuai posisi yang dilamar atau tidak atau tidak.");
        System.out.print("Silahkan masukkan nama anda : ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur anda : ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan posisi yang dilamar (Staff/Officer/Supervisor/Manager): ");
        String posisi = input.nextLine();

        System.out.print("\n");
        System.out.println("Berikut adalah hasilnya : ");
        if (posisi.equalsIgnoreCase("Staff")) {
            if (umur <= 25) {
                System.out.println(nama + " memenuhi kriteria umur untuk posisi Staff");
            } else {
                System.out.println("Umur " + nama + " untuk posisi Staff melebihi batas");
            }
        } else if (posisi.equalsIgnoreCase("Officer")) {
            if (umur <= 30) {
                System.out.println(nama + " memenuhi kriteria umur untuk posisi Officer");
            } else {
                System.out.println("Umur " + nama + " untuk posisi Officer melebihi batas");
            }
        } else if (posisi.equalsIgnoreCase("Supervisor")) {
            if (umur <= 35) {
                System.out.println(nama + " memenuhi kriteria umur untuk posisi Supervisor");
            } else {
                System.out.println("Umur " + nama + " untuk posisi Supervisor melebihi batas");
            }
        } else if (posisi.equalsIgnoreCase("Manager")) {
            if (umur <= 40) {
                System.out.println(nama + " memenuhi kriteria umur untuk posisi Manager");
            } else {
                System.out.println("Umur " + nama + " untuk posisi Manager melebihi batas");
            }
        } else {
            System.out.println("Posisi yang dimasukkan tidak valid");
        }
        input.close();
    }
}