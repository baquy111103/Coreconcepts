package Coreconcepts.Array.src.main.java;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n : ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu "+(i+1));
            a[i] = sc.nextInt();
        }
        System.out.println("Mang a : ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }

        if(Ktradoixung(a)){
            System.out.println("Mang doi xung");
        }
        else{
            System.out.println("Mang k doi xung");
        }
    }
    public static boolean Ktradoixung(int[] a){
        int n = a.length;
        for (int i = 0; i < n/2; i++) {
            if(a[i] != a[n-i-1]){
                return false;
            }
        }
        return true;
    }
}
