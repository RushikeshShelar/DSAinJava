//This Gives Xor of all the No. int the Range A to B

public class XorInRange {
    public static void main(String[] args) {
        int a = 3;
        int b = 9;
        int result = xor(b) ^ xor(a - 1);
        System.out.println(result);
    }

    static int xor(int a) {
        if (a % 4 == 0) {
            return a;
        }
        if (a % 4 == 1) {
            return 1;
        }
        if (a % 4 == 2) {
            return a + 1;
        }
        return 0;
    }
}
