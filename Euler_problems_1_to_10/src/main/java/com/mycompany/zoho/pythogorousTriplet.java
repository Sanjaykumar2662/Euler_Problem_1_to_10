package com.mycompany.zoho;

public class pythogorousTriplet {

    public static void main(String[] args) {
        one:
        for (int i = 1; i < 1000; i++) {
            two:
            for(int j=i+1;j<1000;j++){
                three:
                for(int k=j+1;k<1000;k++){
                    if((j*j)+(i*i)==(k*k)){
                        if(j+i+k==1000){
                        System.out.println(j+"+"+i+"+"+k+" is 1000");
                        break one;
                        }
                    }
                }
            }
        }
    }
}
