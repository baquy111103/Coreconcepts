package Coreconcepts.Basic.src.main.java;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao n : ");
        int n = sc.nextInt();

        int sum=0;

//a
    /*  if (n%2==0){
            for(int i=1;i<=n;i++){
                if(i%2==0) {
                    sum += i;
                }
            }
            System.out.println("Tong cac so chan tu 1 den "+n+" la :" +sum);
        }
        if(n%2==1){
            for(int i=1;i<=n;i++){
                if(i%2==1){
                    sum +=i;
                }
            }
            System.out.println("Tong cac so le tu 1 den "+n+" la :" +sum);
        }
    */
//b
        double sum1=0.0;
        for(int i=1;i<=n;i++){
            sum1+=1.0/i;
        }
        System.out.println("Tong cac phan so tu 1 den 1/"+n+" la : "+sum1);
    }
}
