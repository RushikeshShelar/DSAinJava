//Seive of Eratostheness
//In mathematics, the sieve of Eratosthenes is an ancient algorithm for finding all prime numbers up to any given limit.

public class Soe {
    public static void main(String[] args) {
        int n= 40;
        boolean[] primes = new boolean[n + 1];
        seive(n, primes);
    }
    static void seive(int n, boolean[] primes){
        for (int i = 2; i * i <= n; i++) {
            if(!primes[i]){
                for(int j = i * 2; j <= n; j += i){
                    primes[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if(!primes[i]){
                System.out.print(i + " ");
            }
        }

    }
}
