package Pertemuan2;
import java.util.Scanner;

public class GajiDinamis12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gaji_pokok, jumlah_anak;
        double tunjangan_anak, potongan_pensiun, gaji_bersih;
        System.out.print("Masukkan gaji pokok anda: ");
        gaji_pokok = input.nextInt();
        System.out.print("Masukkan tunjangan anak per bulan: ");
        tunjangan_anak = input.nextDouble();
        System.out.print("Masukkan jumlah anak anda: ");
        jumlah_anak = input.nextInt();
        tunjangan_anak = tunjangan_anak * jumlah_anak;
        potongan_pensiun = gaji_pokok * 0.10;
        gaji_bersih = gaji_pokok + tunjangan_anak - potongan_pensiun;
        System.out.println("Tunjangan anak adalah " + tunjangan_anak);
        System.out.println("Potongan pensiun adalah " + potongan_pensiun);
        System.out.println("Gaji bersih anda adalah " + gaji_bersih);

    }
}