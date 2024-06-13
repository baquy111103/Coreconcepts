package Coreconcepts.Array.src.main.java;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao n: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Nhap vao phan tu a["+i+"]["+j+"]: ");
                a[i][j] = sc.nextInt();
            }
        }
        System.out.print("Ma tran Vuong A : \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }


        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i][i];
        }
        System.out.print("\nTổng các phần tử trên đường chéo chính: " + sum);

        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += a[i][n-i-1];
        }
        System.out.print("\nTổng các phần tử trên đường chéo chính: " + sum1);

        int sum3 = sum+sum1;
        System.out.print("Tong 2 duong cheo cua ma tran : "+sum3);


    }
}
