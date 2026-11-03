//p=12
// uji 1 = 3 + (12 mod 5)= 5
// uji 2 = 9 + (12 mod 5)= 11
// pertanyaan 1 & 2 = 4 + (12 mod 4)= 4
// pertanyaan 3 = 10 + (12 mod 6) = 10

package Pertemuan10;

import java.util.Scanner;

public class Star12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
