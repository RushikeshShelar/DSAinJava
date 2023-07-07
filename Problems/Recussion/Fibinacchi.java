public class Fibinacchi {
    public static void main(String[] args) {
        int num = 20;
        System.out.println(fibo(num));
        
    }
    
    static int fibo(int n){
        if(n < 0) return -1;
        else{
            if(n == 0) return 0;
            else if(n == 1) return 1;
            else return fibo(n-1) + fibo(n-2);
        }

    }
}
