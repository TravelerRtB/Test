package com.company;

public class PrintStuff {
    public static void main() {
        {
            int i = -1;
            System.out.println(i);
        }
        int j;
        for (j = 0; j < 10; j++) {
            System.out.println(j);
        }
        {
            int k;
            for (k = 0; k < 10; k++) {
                System.out.println(k);
            }
        }
        System.out.println(j);
    }
}
