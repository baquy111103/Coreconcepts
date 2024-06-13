package Coreconcepts.Basic.src.main.java;

public class bai10 {
    public static void main(String[] args) {
        // Liệt kê các số nguyên có 7 chữ số thỏa mãn điều kiện
        findSpecialPrimeNumbers();
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // Hàm kiểm tra tất cả các chữ số có phải là số nguyên tố
    public static boolean hasOnlyPrimeDigits(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (!isDigitPrime(digit)) return false;
            n /= 10;
        }
        return true;
    }

    // Hàm kiểm tra một chữ số có phải là số nguyên tố
    public static boolean isDigitPrime(int digit) {
        return digit == 2 || digit == 3 || digit == 5 || digit == 7;
    }

    // Hàm đảo ngược số
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return reversed;
    }

    // Hàm liệt kê các số thỏa mãn điều kiện
    public static void findSpecialPrimeNumbers() {
        for (int i = 1000000; i <= 9999999; i++) {
            if (isPrime(i) && hasOnlyPrimeDigits(i)) {
                int reversed = reverseNumber(i);
                if (isPrime(reversed)) {
                    System.out.println(i);
                }
            }
        }
    }
}
