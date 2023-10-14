public class Problem02 {

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean productOfTwoPrimes(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 6;
        int number3 = 23;

        System.out.println("Is " + number1 + " prime? " + isPrime(number1));
        System.out.println("Is " + number2 + " a product of two primes? " + productOfTwoPrimes(number2));
        System.out.println("Is " + number3 + " a product of two primes? " + productOfTwoPrimes(number3));
    }
}
