package Pertemuan3;

import java.util.Scanner;

public class BiayaCetakDokumen12 {
    public static void main(String[] args) {
        Scanner khei = new Scanner(System.in);

        int banyakLembar;
        int biayaCetak=500;
        int biayaJilid=50000;
        int totalBiaya;

        System.out.println("Masukkan banyak lembar");
        banyakLembar=khei.nextInt();
        totalBiaya=(banyakLembar*biayaCetak) + biayaJilid;
        System.out.println("Total biaya cetak dokumen Rp. " + totalBiaya);

    }
}
