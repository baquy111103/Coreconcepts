package Coreconcepts.Array.src.main.java;

import java.util.Scanner;

public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao m : ");
        int m = sc.nextInt();
        System.out.print("Nhap vao n : ");
        int n = sc.nextInt();
        System.out.print("Nhap vao k : ");
        int k = sc.nextInt();


        int[][] a = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap vao phan tu thu a["+i+"]["+j+"] : ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Mang A voi "+m+" cot "+n+" dong :\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int[][] b = new int[n][k];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("Nhap vao phan tu thu b["+i+"]["+j+"] : ");
                b[i][j] = sc.nextInt();
            }
        }
        System.out.print("Mang b voi "+n+" cot "+k+" dong :\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }


        //Tich 2 ma tran so nguyen A va B
        int[][] c = new int[m][k];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j] = 0;
                for (int l = 0; l < n; l++) {
                    c[i][j] += a[i][l]*b[l][j];
                }
            }
        }

        System.out.println("Ma tran C (ket qua cua A x B):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }

}
