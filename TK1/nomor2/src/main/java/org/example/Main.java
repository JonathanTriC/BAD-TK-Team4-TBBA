package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##"); // format dua angka di belakang koma

        // Meminta user untuk memasukkan jumlah bilangan (minimal 3)
        int jumlahBilangan;
        do {
            System.out.print("Masukkan jumlah bilangan (minimal 3): ");
            jumlahBilangan = input.nextInt();
        } while (jumlahBilangan < 3);

        // Membuat array dengan ukuran sesuai jumlah bilangan yang dimasukkan
        int[] bilangan = new int[jumlahBilangan];

        // Meminta user untuk memasukkan nilai bilangan ke dalam array
        System.out.println("Masukkan " + jumlahBilangan + " bilangan:");
        for (int i = 0; i < jumlahBilangan; i++) {
            System.out.print("Bilangan ke-" + (i+1) + ": ");
            bilangan[i] = input.nextInt();
        }

        // Mencari bilangan terkecil dan terbesar
        int terkecil = bilangan[0];
        int terbesar = bilangan[0];
        for (int i = 1; i < bilangan.length; i++) {
            if (bilangan[i] < terkecil) {
                terkecil = bilangan[i];
            }
            if (bilangan[i] > terbesar) {
                terbesar = bilangan[i];
            }
        }
        System.out.println("Bilangan terkecil: " + terkecil);
        System.out.println("Bilangan terbesar: " + terbesar);

        // Mencari rata-rata
        int total = 0;
        for (int i = 0; i < bilangan.length; i++) {
            total += bilangan[i];
        }
        double rata = (double) total / bilangan.length;
        System.out.println("Nilai rata-rata: " + df.format(rata)); // membatasi nilai rata-rata hanya menjadi dua angka di belakang koma
    }
}