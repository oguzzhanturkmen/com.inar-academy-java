import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeNumbers {
    public static void main(String[] args) {
        try {
            // Create a BufferedWriter to write to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("primes.txt"));

            // Write the first 100 prime numbers to the file
            for (int i = 2, count = 0; count < 100; i++) {
                if (isPrime(i)) {
                    writer.write(i + "\n");
                    count++;
                }
            }

            // Close the writer
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // This method checks if the specified number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}