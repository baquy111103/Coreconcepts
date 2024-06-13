package Coreconcepts.Basic.src.main.java;

public class bai7 {
    public static void main(String[] args) {
        findSpecialPrimeNumbers();
    }


    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }


    public static boolean hasOnlyOddDigits(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) return false; // Nếu chữ số chẵn, trả về false
            n /= 10;
        }
        return true;
    }


    public static void findSpecialPrimeNumbers() {
        for (int i = 100000; i <= 999999; i++) { // Các số có 6 chữ số
            if (isPrime(i) && hasOnlyOddDigits(i)) {
                System.out.println(i);
            }
        }
    }
}
