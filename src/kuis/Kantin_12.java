import java.util.Scanner;

public class Kantin_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int seporsiNasiCampur=8500;
        int modal=1201250;
        int jumlahKaryawan=4;
        int pendapatan;
        int laba;
        double bagianPetugas;
        int sisaKas;

        pendapatan=sc.nextInt();
        laba=modal-pendapatan;
        bagianPetugas=laba/jumlahKaryawan;
        sisaKas=laba - bagianPetugas;

        System.out.println("Jumlah pendapatan adalah" + pendapatan);
        System.out.println("hasil laba adalah" + laba);
        System.out.println("bagian petugas adalah" + bagianPetugas);
        System.out.println("sisa kas adalah" + sisaKas);
        
    }
}