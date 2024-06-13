package Coreconcepts.Basic.src.main.java;

public class bai9 {
    public static void main(String[] args) {
        // Liệt kê các số thỏa mãn điều kiện từ 7 đến 9 chữ số
        findSpecialPalindromicNumbers();
    }

    // Hàm kiểm tra số thuận nghịch
    public static boolean isPalindromic(int n) {
        int original = n;
        int reversed = 0;
        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }

    // Hàm kiểm tra các chữ số chỉ bao gồm 0, 6, 8
    public static boolean hasOnly068Digits(int n) {
        while (n != 0) {
            int digit = n % 10;
            if (digit != 0 && digit != 6 && digit != 8) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    // Hàm kiểm tra tổng các chữ số có chia hết cho 10 hay không
    public static boolean isSumOfDigitsDivisibleBy10(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 10 == 0;
    }

    // Hàm liệt kê các số thỏa mãn điều kiện từ 7 đến 9 chữ số
    public static void findSpecialPalindromicNumbers() {
        for (int i = 1000000; i <= 999999999; i++) {
            if (isPalindromic(i) && hasOnly068Digits(i) && isSumOfDigitsDivisibleBy10(i)) {
                System.out.println(i);
            }
        }
    }
}
