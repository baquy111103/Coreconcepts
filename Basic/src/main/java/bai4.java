package Coreconcepts.Basic.src.main.java;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao dau a : ");
        int a = in.nextInt();
        System.out.println("Nhap vao dau b : ");
        int b = in.nextInt();

        printPrime(a,b);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void printPrime(int a, int b) {
        int prevPrime = -1;

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                if (prevPrime != -1 && (i - prevPrime) == 2) {
                    System.out.println("Cặp số nguyên tố: (" + prevPrime + ", " + i + ")");
                }
                prevPrime = i;
            }
        }
    }
}
