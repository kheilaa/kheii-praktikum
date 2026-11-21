// B = 20 + (12 mod 60)
// = 32
// {32, 32+15, 32-8, 32+30, 32-20, 32+5}
// = 32, 47, 24, 62, 12, 37

package Pertemuan12;

import java.util.Arrays;

public class SortNilai12 {
    public static void main(String[] args) {
        
         int[] nilai = {32, 47, 24, 62, 12, 37};
        for (int i = 0; i < nilai.length - 1 ; i++) {
            for (int j = 0; j < nilai.length - 1; j++) {
                if (nilai[j] > nilai[j + 1]) {
                    int temp = nilai[j];
                    nilai[j] = nilai[j + 1];
                    nilai[j + 1] = temp;
                }
            }
        }
    System.out.println(Arrays.toString(nilai));
    }
}
