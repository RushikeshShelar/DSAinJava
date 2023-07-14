// Set bits = Bits that are set to 1
// Reset bits = Bits that are set to 0

public class SetBits {
    public static void main(String[] args) {
        int num = 31;
        System.out.println(Integer.toBinaryString(num));

        System.out.println(bitsCount(num));

    }

    static int bitsCount(int n){
        int count = 0;

        while(n > 0){
            count++;
            n = n & (n -1);
        }
        return count;
    }
    
}
