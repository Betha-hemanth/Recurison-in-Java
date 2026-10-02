public class palindrome {

    static void main(String[] args) {

        int n = 12321;

        if (isPalindrome(n)) {
            System.out.println(n + " is a palindrome");
        } else {
            System.out.println(n + " is not a palindrome");
        }
    }

    static int reverse(int n, int rev) {

        if (n == 0) {
            return rev;
        }

        int rem = n % 10;
        rev = rev * 10 + rem;

        return reverse(n / 10, rev);
    }

    static boolean isPalindrome(int n) {

        return n == reverse(n, 0);
    }
}