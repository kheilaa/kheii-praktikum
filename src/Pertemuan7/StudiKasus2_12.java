package Pertemuan7;

import java.util.Scanner;

public class StudiKasus2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa;
        String jenisKegiatan;
        int dokumen;
        int juara;
        int pendanaan;

        System.out.print("Nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/Lainnya) : ");
        jenisKegiatan = sc.nextLine();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA")
                || jenisKegiatan.equalsIgnoreCase("BAKORMA")
                || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen yang diupload : ");
            dokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            juara = sc.nextInt();

            if (juara >= 1 && juara <= 3) {
                if (dokumen == 4) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan.");
                    System.out.println("Alasan : Juara 1/2/3 dan dokumen lengkap.");
                } else {
                    System.out.println("Status : Dana penghargaan tidak diberikan.");
                    System.out.println("Alasan : Dokumen tidak lengkap (kurang "
                            + (4 - dokumen) + " dokumen).");
                }
            }
        }
    }
}
