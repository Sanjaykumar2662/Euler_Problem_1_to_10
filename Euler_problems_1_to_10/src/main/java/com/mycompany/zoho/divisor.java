package com.mycompany.zoho;

 class numery{
    int sum=0;
     public int finder(){
         for(int i=1;i<1000;i++){
            if(i%3==0||i%5==0){
              sum=sum+i;  
            }   
     }
         return sum;
}
 
}
public class divisor {

    public static void main(String[] args) {
       numery obj = new numery();
       int b = obj.finder();
        System.out.println("The sum of all numbers < 1000 are "+b);
    }
}
    