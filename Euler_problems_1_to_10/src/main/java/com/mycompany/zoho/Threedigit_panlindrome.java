package com.mycompany.zoho;

public class Threedigit_panlindrome {

    public static boolean isPalin(int n) {
        int rep = n;
        int rem = 0;
        int sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        if (sum == rep) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        for (int i = 999; i > 100; i--) {
            for (int j = 999; j > 100; j--) {
                int mul = j * i;
                if (isPalin(mul)) {
                    System.out.printf("%d * %d = %d", i, j, mul);
                    return;
                }
            }
        }
    }
}
