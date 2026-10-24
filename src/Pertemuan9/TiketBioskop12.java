// Harga tiket = 40.000 + (12 mod 6) * 2.000= Rp40.000
// diskon pertama = lebih dari (3 + (12 mod 3)) tiket = lebih dari 3 tiket
// presentase diskon pertama 8 + (12  mod 5) = 10%
// diskon kedua = lebih dari (8 + (12 mod 4)) tiket = lebih dari 8 tiket
// presentase diskon kedua = 15 + (12 mod 4)) = 15%

package Pertemuan9;

import java.util.Scanner;

public class TiketBioskop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahTiket;
        int totalTiket = 0;
        double totalPenjualan = 0;
        double harga, diskon;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid");
                continue;
            }
            harga = jumlahTiket * 40000;
            diskon = 0;

            if (jumlahTiket > 8) {
                diskon = harga * 15 / 100;
            } else if (jumlahTiket > 3) {
                diskon = harga * 10 / 100;
            }
            harga = harga - diskon;
            totalTiket += jumlahTiket;
            totalPenjualan += harga;

            System.out.println("Diskon: Rp" + diskon);
            System.out.println("Total harga: Rp" + harga);
        }
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);
    }
}
