// Fibonacchi of a no. using direct formula

public class FibonacchiFormula {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(fibo(num));
    }

    static long fibo(int n){
        double sq5 = Math.sqrt(5);
        double var1 = 1 / sq5;
        double var2 = (1 + sq5) / 2;
        double var3 = (1 - sq5) / 2;
        long ans =(int)(var1 * (Math.pow(var2, n) - Math.pow(var3, n)));
        return ans;

    }
    
}
