package Pertemuan2;

import java.util.Scanner;

public class LuasTanahDinamis12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double lebar_tanah, panjang_tanah;
        double diameter_kolam, sisi_taman;
        double luas_tanah, luas_kolam, luas_taman;
        double luas_tidak_digunakan;
        System.out.print("Masukkan lebar tanah: ");
        lebar_tanah = input.nextDouble();
        System.out.print("Masukkan panjang tanah: ");
        panjang_tanah = input.nextDouble();
        System.out.print("Masukkan diameter kolam: ");
        diameter_kolam = input.nextDouble();
        System.out.print("Masukkan sisi taman: ");
        sisi_taman = input.nextDouble();
        luas_tanah = lebar_tanah * panjang_tanah;
        double jari_jari = diameter_kolam / 2;
        luas_kolam = Math.PI * jari_jari * jari_jari;
        luas_taman = sisi_taman * sisi_taman;
        luas_tidak_digunakan = luas_tanah - luas_kolam - luas_taman;
        System.out.println("Luas tanah: " + luas_tanah);
        System.out.println("Luas kolam: " + luas_kolam);
        System.out.println("Luas taman: " + luas_taman);
        System.out.println("Luas tanah yang tidak digunakan: " + luas_tidak_digunakan); 

    }
}
