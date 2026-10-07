package Pertemuan6;

import java.util.Scanner;

public class Tugas2SeleksiAsisten12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Apakah mahasiswa aktif? (true/false): ");
        boolean aktif = sc.nextBoolean();
        System.out.print("Apakah mendapat sanksi akademik? (true/false): ");
        boolean sanksi = sc.nextBoolean();
        System.out.print("Masukkan nilai Dasar Pemrograman: ");
        int nilaiDasarpemrograman = sc.nextInt();
        System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
        boolean sertifikat = sc.nextBoolean();
        if (aktif && !sanksi) {
            if (nilaiDasarpemrograman >= 76 || sertifikat) {
                System.out.print("Masukkan nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();
                if (nilaiWawancara >= 71) {
                    System.out.println("Mahasiswa diterima sebagai asisten praktikum.");
                } else {
                    System.out.println("Mahasiswa gagal pada tahap wawancara.");
                    System.out.println("Alasan: nilai wawancara kurang dari 71.");
                }
            } else {
                System.out.println("Mahasiswa gagal pada tahap seleksi nilai Dasar Pemrograman.");
                System.out.println("Alasan: nilai Dasar Pemrograman kurang dari 76 dan tidak memiliki sertifikat kompetensi.");
            }
        } else {
            System.out.println("Mahasiswa gagal pada tahap seleksi awal.");
            if (!aktif && sanksi) {
                System.out.println("Alasan: mahasiswa tidak berstatus aktif dan sedang mendapat sanksi akademik.");
            } else if (!aktif) {
                System.out.println("Alasan: mahasiswa tidak berstatus aktif.");
            } else {
                System.out.println("Alasan: mahasiswa sedang mendapat sanksi akademik.");
            }
        }
    }
}