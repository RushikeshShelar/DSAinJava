public class BinarySearchSQRT {
    public static void main(String[] args) {
        int num = 40;
        int p = 3;
        System.out.printf("%.3f",squareRoot(num, p));
    }

    static double squareRoot(int n, int p) {
        int start = 0;
        int end = n;

        double root = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int sq = mid * mid;
            if (sq == n) {
                return mid;
            }

            if (sq > n) {
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += inc;
            }
            root -= inc;
            inc /= 10;
        }
        return root;
    }

}
