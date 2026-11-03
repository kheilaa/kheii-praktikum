// tugas3 2 + (12 mod 3) = 2

package Pertemuan10;

import java.util.Scanner;

public class Tugas3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1.");
        } else {
            int totalBarangSemua = 0;
            int tokoTerbanyak = 1;
            int barangTerbanyak = -1;

            for (int i = 1; i <= jumlahToko; i++) {
                System.out.print("Masukkan jumlah pelanggan Toko " + i + ":");
                int jumlahPelanggan = sc.nextInt();

                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif.");
                    i--;
                    continue;
                }
                int totalBarangToko = 0;

                for (int j = 1; j <= jumlahPelanggan; j++) {
                    System.out.print("Jumlah barang pelanggan " + j + ": ");
                    int jumlahBarang = sc.nextInt();

                    if (jumlahBarang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif.");
                        j--;
                        continue;
                    }
                    totalBarangToko += jumlahBarang;
                }
                System.out.println("Toko " + i + " - pelanggan; " + jumlahPelanggan + ", total barang: " + totalBarangToko);
                totalBarangSemua += totalBarangToko;

                if (totalBarangToko > barangTerbanyak) {
                    barangTerbanyak = totalBarangToko;
                    tokoTerbanyak = i;
                }
            }
            System.out.println("Total barang seluruh toko: " + totalBarangSemua);
            System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        }
    }
}
