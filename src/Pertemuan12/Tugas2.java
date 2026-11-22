package Pertemuan12;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate ice"
        };
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("===== MENU KAFE KAMPUS =====");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i] + " - Rp" + harga[i]);
        }
        System.out.print("\nMasukkan jumlah item yang dipesan: ");
        int jumlah = input.nextInt();
        input.nextInt();

        String[] pesanan = new String[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            boolean ditemukan = false;

            while (!ditemukan) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                String cari = input.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(cari)) {
                        pesanan[i] = menu[j];
                        total += harga[j];
                        ditemukan = true;

                        System.out.println("Menu ditemukan: Rp" + harga[j]);
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Menu tidak tersedia, silahkan pilih lagi!");
                }
            }
        }
        System.out.println("\n====== DAFTAR PESANAN =====");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + pesanan[i]);
        }
        System.out.println("Total biaya: Rp" + total);
    }
}
