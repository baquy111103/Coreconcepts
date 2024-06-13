package Coreconcepts.Basic.src.main.java;

import java.util.Scanner;

public class bai3 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap vao a : ");
        int a = in.nextInt();
        System.out.println("Nhap vao b : ");
        int b = in.nextInt();

        int UCLN = find(a, b);
        System.out.println("Uoc chung lon nhat cua " + a + " va " + b + " la : " + UCLN);

        int BCNN = (a*b)/UCLN;
        System.out.println("Boi chung nho nhat cua " +a+"va "+b+" la : "+BCNN);

    }
    public static int find(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}
