package com.mycompany.zoho;

class Even_fibonaci {

    public static void main(String[] args) {
        int n, a = 0, b = 2, c = 0;
        n = 4000000;
        System.out.print("Fibonacci Series Upto " + n + ": ");
        while (c <= n) {
            if (c % 2 == 0 && c < n) {
                System.out.print(c + ",");
            }
            c = a + b;
            a = b;
            b = c;
        }
    }
}
