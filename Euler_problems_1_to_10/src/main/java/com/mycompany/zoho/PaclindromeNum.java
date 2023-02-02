package com.mycompany.zoho;

public class PaclindromeNum {

    public static void main(String[] args) {
        int n = 5665;
        int rep = n;
        int rem = 0;
        int sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        if (sum == rep) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

}
