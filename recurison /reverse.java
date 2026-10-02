public class reverse {

    static void main(String[] args) {
        revs(1025, 0);
    }

    static void revs(int n, int rev) {

        if (n == 0) {
            System.out.println(rev);
            return;
        }

        int rem = n % 10;
        rev = rev * 10 + rem;

        revs(n / 10, rev);
    }
}