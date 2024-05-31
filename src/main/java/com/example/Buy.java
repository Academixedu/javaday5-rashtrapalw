package com.example;

public class Buy {
     public static void main(String[] args) {
        int a,b,c;
        a=2;
        b=11;
        c=sum(a, b);
        System.out.println("value of c :"+c);
        String name="rashtrapal";
        greetMethod(name);
     }
     public static void greetMethod(String name){
      System.out.println(" your name is "+name);

        
     }

     public static int sum(int a,int b){
      int sum=a+b;
      return sum;
     }
    
}
