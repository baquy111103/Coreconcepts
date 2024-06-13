package Coreconcepts.Array.src.main.java;

import java.util.Scanner;

public class bai2 {
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
        Sapxep(a);
        System.out.println("\nMang a sau khi sap xep : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
    public static void Sapxep(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j=0; j<n-i-1; j++) {
                if(a[j]>a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
