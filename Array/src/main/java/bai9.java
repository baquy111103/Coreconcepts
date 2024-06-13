package Coreconcepts.Array.src.main.java;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int n = sc.nextInt();
        System.out.print("Nhap vao m: ");
        int m = sc.nextInt();

        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhap vao phan tu a["+i+"]["+j+"]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Mang 2 chieu A : \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        int[] tempArray = new int[n*m];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tempArray[index++] = a[i][j];
            }
        }
        SapXep(tempArray);

        index =0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = tempArray[index++];
            }
        }
        System.out.println("Mang 2 chieu A sau khi sap xep:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void SapXep(int[] a) {
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
