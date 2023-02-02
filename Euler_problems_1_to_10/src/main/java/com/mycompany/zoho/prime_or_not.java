package com.mycompany.zoho;

public class prime_or_not {

    public static void main(String[] args) {
        int n = 2;
        int flag = 0;
        if (n == 0 || n == 1) {
            System.out.println("Prime 0 or 1");
        } else {
            for (int j = 2; j <= (int) Math.sqrt(n); j++) {
                if (n % j == 0) {
                    flag = 1;
                    System.out.println("Not a prime");
                    break;
                }
            }
            if (flag == 0) {
                System.out.println("Prime");
            }

        }

    }

}
