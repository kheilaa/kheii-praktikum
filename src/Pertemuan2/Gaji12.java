package Pertemuan2;

public class Gaji12 {
    public static void main(String[] args) {
        double gaji_pokok = 5000000;
        double tunjangan_anak = 100000;
        int jumlah_anak = 4;
        double potongan_pensiun = gaji_pokok * 0.10;
        double gaji_bersih = gaji_pokok + (tunjangan_anak * jumlah_anak) - potongan_pensiun;
        System.out.println("Gaji pokok: " + gaji_pokok);
        System.out.println("Tunjangan anak: " + (tunjangan_anak * jumlah_anak));
        System.out.println("Potongan pensiun: " + potongan_pensiun);
        System.out.println("Gaji bersih: " + gaji_bersih);  

    }
}
