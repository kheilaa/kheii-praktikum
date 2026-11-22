package Pertemuan12;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;
        int tertinggi, terendah;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
            total += nilai[i];
        }
        tertinggi = nilai[0];
        terendah = nilai[0];

        for (int i = 0; i < jumlah; i++) {
            if (nilai[i] > terendah) {
                tertinggi = nilai[i];
            }
        }
        double rata2 = (double) total / jumlah;

        System.out.println("\n===== HASIL PENGELOLAAN NILAI =====");
        System.err.println("Total nilai: " + total);
        System.out.println("Rata rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);

        System.out.println("\nDaftar Nilai Mahasiswa: ");
        for (int i = 0; i < jumlah; i++) {
            String status = (nilai[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i] + " (" + status + ")");
        }
    }
    
}
