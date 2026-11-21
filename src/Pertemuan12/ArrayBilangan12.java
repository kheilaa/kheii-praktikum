// 12 ; 20 ; -6 ; 32

package Pertemuan12;

import java.util.Arrays;

public class ArrayBilangan12 {
    public static void main(String[] args) {
        
        int[] bil = {12, 20, -6, 32};

        for (int i = 0; i < bil.length; i++) {
            System.out.println("bill[" + i + "] = " + bil[i]);     
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }
        System.out.println(Arrays.toString(bil));
    }
}
