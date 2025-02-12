public public class First10Primes {
    public static void main(String[] args) {
        int count = 0, num = 2; 
        
        while (count < 10) { 
            if (isPrime(num)) { 
                System.out.print(num + " "); 
                count++; 
            }
            num++; 
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

