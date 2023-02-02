package com.mycompany.zoho;
public class PrimeFactors {

    public static void main(String[] args) {
        pfactor(600851475143L);
    }

    public static void pfactor(long n) {
        for (long i = (int) Math.sqrt(n) ; i >= 1; i--) {
            if (n % i == 0) {
                if (isprime(i)) {
                    System.out.println(" " + i);
                    return;
                }
            }
        }
    }

    public static boolean isprime(long i) {
        int flag = 0;
        for (long j = (i / 2); j > 2; j--) {
            if (i % j == 0) {
                flag = 1;
                break;
            }

        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }

    }
}
