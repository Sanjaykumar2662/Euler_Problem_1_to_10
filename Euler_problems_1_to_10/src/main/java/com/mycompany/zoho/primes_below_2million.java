package com.mycompany.zoho;

public class primes_below_2million {

    public static void main(String[] args) {
        long count = 0;
        long i;
        for (i = 2; i < 2000000; i++) {
            int flag = 0;
            for (long j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                count = count + i;
            }

        }
        System.out.println("The value of count is :" + count);
    }

}
