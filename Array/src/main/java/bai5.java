package Coreconcepts.Array.src.main.java;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n : ");
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap vao phan tu a["+i+"]: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Nhap vao m: ");
        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            System.out.println("Nhap vao phan tu b["+i+"]: ");
            b[i] = sc.nextInt();
        }

        System.out.println("Mang a : ");
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]+" ");
        }

        System.out.println("Mang b : ");
        for (int i = 0; i < m; i++) {
            System.out.print(b[i]+" ");
        }

        System.out.println("Nhap vao p: ");
        int p = sc.nextInt();

        int[] result = new int[n+m];

        for (int i = 0; i < p; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < m; i++) {
            result[p+i] = b[i];
        }

        for (int i = p; i < n; i++) {
            result[i+m] = a[i];
        }

        System.out.println("Mang moi sau khi chen b vao vi tri "+p+" vao mang a : ");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t ");
        }
    }
}
