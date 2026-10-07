package Pertemuan7;

import java.util.Scanner;

public class StudiKasus1_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPercup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup : ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar : ");
        uangBayar = sc.nextInt();

        totalHarga = jumlahCup * hargaPercup;
        diskon = 0;

        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
            totalBayar = totalHarga - diskon;
        } else {
            totalBayar = totalHarga - diskon;
        }
 
        System.out.println("Total harga Rp " + totalHarga);
        System.out.println("Diskon Rp " + diskon);
        System.out.println("Total bayar Rp " + totalBayar);

        if (uangBayar >= totalBayar) {
            kembalian = uangBayar - totalBayar;
            System.out.println("kembalian: " + kembalian);
        } else {
            kurang = totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
    }
}
        