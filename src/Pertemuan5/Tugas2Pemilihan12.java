package Pertemuan5;

import java.util.Scanner;

public class Tugas2Pemilihan12 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah SKS: ");

        int sks = sc.nextInt();

        if (sks <= 24) {
            System.out.println("Jumlah SKS diterima");
        } else {
            System.out.println("Jumlah SKS melebihi batas maksimal 24 SKS");

        }
        }
}
