package com.mycompany.zoho;

public class n_th_Prime_number {

    public static void main(String[] args) {
        int start = 2;
        int count = 1;

        
        while (true) {
            if (isprime(++start)) {
                count++;
            }
            if (count == 10001) {
                break;
            }
        }
        System.out.println("The prime is " + start);
    }

    public static boolean isprime(int n) {
        int flag = 0;

        for (int j = 2; j <= (int) Math.sqrt(n); j++) {
            if (n % j == 0) {
                flag = 1;
            }
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }  
    }
}
