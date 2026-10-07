package Pertemuan6;

import java.util.Scanner;

public class DiskonTokoBuku12 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int diskon;
        String kamus, novel;

        System.out.print("Masukkan jenis buku (kamus/novel): ");
        String jenisBuku = sc.nextLine();
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jumlahBuku > 2) {
                diskon = 12;
            } else {
                diskon = 10;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku > 3) {
                diskon = 7;
            } else {
                diskon = 6;
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 3;
            } else {
                diskon = 0;
            }
        }
        System.out.println("Diskon yang didapat: " + diskon + "%");
    }
}
