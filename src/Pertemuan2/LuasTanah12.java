package Pertemuan2;

public class LuasTanah12 {
    public static void main(String[] args) {
    double lebar_tanah = 30;
    double panjang_tanah = 100;
    double diameter_kolam = 5;
    double sisi_taman = 2;
    double luas_tanah = lebar_tanah * panjang_tanah;
    double jari_jari = diameter_kolam / 2;
    double luas_kolam = Math.PI * jari_jari * jari_jari;
    double luas_taman = sisi_taman * sisi_taman;
    double luas_tidak_digunakan = luas_tanah - luas_kolam - luas_taman;
    System.out.println("Luas tanah: " + luas_tanah);
    System.out.println("Luas kolam: " + luas_kolam);
    System.out.println("Luas taman: " + luas_taman);
    System.out.println("Luas tanah yang tidak digunakan: " + luas_tidak_digunakan);
    
    }
}