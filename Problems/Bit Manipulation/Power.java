// Code to find a raised to b in Log n time

public class Power {
    public static void main(String[] args) {
        int base = 2;
        int power = 7;

        int ans = 1; //Initially

        while(power > 0){
            if((power & 1) == 1){
                ans *= base;
            }

            base *= base;
            power = power >> 1;
        }

        System.out.println(ans); //It gives base ^ power
    }
    
}
