package com.mycompany.zoho;

public class Dif_of_sum_Sqr_of_N {

    public static void main(String[] args) {

        diff(100);
    }

    public static void diff(int n) {
        long sq_of_sum = (n * (n + 1)) / 2;
        long sq = sq_of_sum * sq_of_sum;
        long soq = (n * (n + 1) * ((2 * n) + 1)) / 6;

        long diff = sq - soq;
        System.out.println(diff);
    }

}
