package com.mycompany.zoho;

public class Smallest_multiple {

    public static void main(String[] args) {
        int a = 1, b = 1, rem;
        while (b < 20){
        rem = a % b;
        if (rem != 0){
            a++;
            b = 1;
        }
        b++;
        }
        System.out.println("The smallest number is "+a);
    }
}

//    public static boolean ismul(int i) {
//        int j = 1;
//        int flag = 0;
//        while (j <= 10) {
//            if (i % j == 0) {
//                j++;
//                
//            } else {
//                flag = 1;
//                
//            }
//        }
//        if (flag == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//}
