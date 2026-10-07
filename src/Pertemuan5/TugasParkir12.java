package Pertemuan5;

import java.util.Scanner;

public class TugasParkir12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lamaParkir, totalBiaya;
        int tarifDasar = 2000;
        int tarifTambahan = 1000;

        System.out.print("Lama parkir (jam): ");
        lamaParkir = sc.nextInt();

        if (lamaParkir <= 2) {
            totalBiaya = tarifDasar;
        } else {
            totalBiaya = tarifDasar + (lamaParkir - 2) * tarifTambahan;
        }

        System.out.println("Maka total biaya parkir: Rp " + totalBiaya);
    }
}