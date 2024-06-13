package Coreconcepts.Array.src.main.java;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n :");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu thu "+(i+1)+":");
            a[i] = sc.nextInt();
        }

        System.out.println("Mang a:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]+" ");
        }



        System.out.print("Mang sau khi dc sap xep : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println("\nNhap vao vi tri chen (tu 0  den "+n+"):");
        int p = sc.nextInt();


        System.out.print("Nhap vao x : ");
        float x = sc.nextFloat();

        float[] newArr = new float[n+1];
        for (int i = 0; i < p; i++) {
            newArr[i] = a[i];
        }

        newArr[p] = x;

        for (int i = p; i < n; i++) {
            newArr[i+1] = a[i];
        }

        System.out.println("Mang a:");
        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i]+" ");
        }
    }
    public static void Sapxep(int[] a) {
        int n = a.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
}
