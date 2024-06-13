package Coreconcepts.Basic.src.main.java;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = in.nextInt();

        if(n<2){
            System.out.println("So phai lon hon 2 !");
            return;
        }
        System.out.println("Phan tich "+n+" la : ");
        phantich(n);
    }

    public static void phantich(int n){
        while(n%2==0){
            System.out.println(2+"");
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                System.out.println(i+"");
                n/=i;
            }
        }
    }
}
