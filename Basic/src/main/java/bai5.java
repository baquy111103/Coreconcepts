package Coreconcepts.Basic.src.main.java;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number : ");
        int n = in.nextInt();

        int sum = Sum(n);
        System.out.println("Tong cac chu so cua "+n+" la : "+sum);
    }
    public static int Sum(int n){
        int sum = 0;
        n = Math.abs(n);
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
