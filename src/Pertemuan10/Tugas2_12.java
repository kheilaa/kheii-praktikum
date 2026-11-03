// tugas2 5 + (12 mod 4) = 5
package Pertemuan10;

import java.util.Scanner;

public class Tugas2_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.print("Masukkan nilai n = ");
            int n = sc.nextInt();

            int total = 0;

            if (n < 3) {
                System.out.println("Nilai n minimal 3.");
            } else {
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        int hasil = i * j;
                        System.out.printf("%4d", hasil);
                        total += hasil;
                    }
                    System.out.println();
                }
                System.out.println("Jumlah seluruh angka: " + total);
        }
        sc.close();
    }
}
