package Coreconcepts.Array.src.main.java;

import java.util.Scanner;

public class bai4 {
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
        System.out.println("Nhap vao X : ");
        int X =sc.nextInt();

        int Fclose = Find(a,n,X);
        int index = FindIndex(a,n,Fclose);

        System.out.println("Vi tri so nguyen to gan nhat voi "+X+" trong mang la : "+index);


    }
    public static boolean ktra(int num){
        if(num <=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static int Find(int[] a,int n,int X) {
        int close = a[0];
        for(int i=1;i<n;i++){
            if(ktra(a[i])){
                if(Math.abs(a[i]-X)<Math.abs(close-X)){
                    close = a[i];
                }
            }
        }
        return close;
    }
    public static int FindIndex(int[] a,int n,int num){
        for(int i=0;i<n;i++){
            if(a[i]==num){
                return i;
            }
        }
        return -1;
    }
}
