public class NewtonSQRT {
    public static void main(String[] args) {
        int num = 40;
        System.out.println(root(num));
        
    }
    static double root(int n){
        double x = n;
        double root;
        while(true){
            root = 0.5 * (x + (n/x));
            if(Math.abs(root - x) < 0.000001){
                break;
            }
            x = root;
        }
        return root;
    }
}
