//It gives the Xor of all nos From 0 till a
public class Xor {
    public static void main(String[] args) {
        int a = 13;
        // this Logic id Observed by Performing multiple Test Cases Input and Observation.
        if(a % 4 == 0){
            System.out.println(a);
        }else if(a % 4 == 1){
            System.out.println(1);
        }else if(a % 4 == 2){
            System.out.println(a + 1);
        }else{
            System.out.println(0);
        }
    }
}
