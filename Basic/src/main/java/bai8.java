package Coreconcepts.Basic.src.main.java;

public class bai8 {
    public static void main(String[] args) {
        // Liệt kê tất cả các số thuận nghịch có sáu chữ số
        findPalindromicNumbers();
        // Liệt kê các số thuận nghịch có sáu chữ số mà tổng chữ số chia hết cho 10
        //findPalindromicNumbersDivisibleBy10();
    }

    // Hàm liệt kê tất cả các số thuận nghịch có sáu chữ số
    public static void findPalindromicNumbers() {
        for (int i = 100; i <= 999; i++) { // Duyệt qua tất cả các số có 3 chữ số
            int palindromicNumber = createPalindromicNumber(i);
            System.out.println(palindromicNumber);
        }
    }

    // Hàm tạo số thuận nghịch từ số có 3 chữ số
    public static int createPalindromicNumber(int n) {
        int firstPart = n;
        int secondPart = reverseNumber(n);
        return firstPart * 1000 + secondPart;
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
    /*b
    // Hàm liệt kê các số thuận nghịch có sáu chữ số mà tổng chữ số chia hết cho 10
    public static void findPalindromicNumbersDivisibleBy10() {
        for (int i = 100; i <= 999; i++) { // Duyệt qua tất cả các số có 3 chữ số
            int palindromicNumber = createPalindromicNumber(i);
            if (isSumOfDigitsDivisibleBy10(palindromicNumber)) {
                System.out.println(palindromicNumber);
            }
        }
    }

    // Hàm tạo số thuận nghịch từ số có 3 chữ số
    public static int createPalindromicNumber(int n) {
        int firstPart = n;
        int secondPart = reverseNumber(n);
        return firstPart * 1000 + secondPart;
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

    // Hàm kiểm tra tổng các chữ số có chia hết cho 10 hay không
    public static boolean isSumOfDigitsDivisibleBy10(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum % 10 == 0;
    }
     */
}
