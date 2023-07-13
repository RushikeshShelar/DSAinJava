// Amazon INdia Question
// Return a Num as Follows
// if a Number = n , Convert it into binary and then return the sum of all bits multipoles by the powers of 5 starting from 1 and Increasing by 1 after each iteration
// Eg n = 4
// 4 in binary = 100
// so ans = 1 *5^3 + 0 * 5^2 + 0 * 5^1



class MagicNumber{
    public static void main(String[] args) {
        int num = 6;
        int base = 5;
        System.out.println(magic(num, base));
        
    }
    static int magic(int n, int base){
        int ans = 0;
        int i = 1;
        while(n > 0){
            int lsb = n & 1;
            n = n >> 1;
            ans += lsb * Math.pow(base,i);
            i++;
        }
        return ans;
    }
}