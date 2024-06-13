package Coreconcepts.Basic.src.main.java;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao n: ");
        int n = in.nextInt();
        int sum=0;
        if(n<=0){
            System.out.println("Nhap so n lon hon 0!!");
            return;
        }
        System.out.println("Uoc cua "+n+" la : ");
        for(int i=1;i<=n;i++){
            if(n%i==0) {
                System.out.println(i);
                sum++;
            }
        }
        System.out.println("So luong uoc cua "+n+" la : "+sum);
    }
}
