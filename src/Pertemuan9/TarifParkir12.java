// tarif mobil = 2500 + (12 mod 6) * 250 = 2500/jam
// tarif motor = 1500 + (12 mod 6) * 250 = 1500/jam

package Pertemuan9;

import java.util.Scanner;

public class TarifParkir12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, jam;
        int total = 0;
        int tarif;

        while (true) {
            System.out.print("Jenis kendaraan (1=Mobil, 2=Motor, 0=Selesai): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                break;
            }
            if (jenis == 1) {
                tarif = 2500;
            } else if (jenis == 2) {
                tarif = 1500;
            } else {
                System.out.println("Jenis kendaraan tidak valid!");
                continue;
            }
            System.out.print("Lama parkir (jam): ");
            jam = sc.nextInt();

            if (jam < 0) {
                System.out.println("Lama parkir tidak valid!");
                continue;
            }
            int bayar = tarif * jam;
            total += bayar;

            System.out.println("Biaya parkir: Rp" + bayar);
        }
        System.out.println("Total pembayaran parkir: Rp" + total);
    }
}
