package Pertemuan3;

import java.util.Scanner;

public class MenghitungCicilanLaptop12 {
    public static void main(String[] args) {
        Scanner khei = new Scanner(System.in);

        double hargaLaptop;
        double uangMuka;
        double bulanMencicil;
        double bunga;
        double hargaSisa;
        double besarCicilan;
        double cicilan;

        System.out.println("Masukkan Harga Laptop");
        hargaLaptop = khei.nextDouble();
        System.out.println("Masukkan Uang Muka");
        uangMuka = khei.nextDouble();
        System.out.println("Masukkan Bulan Mencicil");
        bulanMencicil = khei.nextDouble();
        hargaSisa = hargaLaptop - uangMuka;
        besarCicilan = hargaSisa / bulanMencicil;
        bunga = 0.02 * hargaSisa;
        cicilan = besarCicilan + bunga;

        System.out.println("Besar cicilan per bulan adalah Rp. " + cicilan);
    }
}