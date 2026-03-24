public class Main {

    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1:");
        printDigits(5481);

        // Task 2
        System.out.println("\nTask 2:");
        int[] arr = {3, 2, 4, 1};
        System.out.println("Average: " + average(arr, arr.length));

        // Task 3
        System.out.println("\nTask 3:");
        int n1 = 7;
        int n2 = 10;
        System.out.println(n1 + " -> " + (isPrime(n1, 2) ? "Prime" : "Composite"));
        System.out.println(n2 + " -> " + (isPrime(n2, 2) ? "Prime" : "Composite"));

        // Task 4
        System.out.println("\nTask 4:");
        System.out.println("Factorial of 5: " + factorial(5));
    }

    // Task 1
    static void printDigits(int n) {
        if (n < 10) {
            System.out.println(n);
            return;
        }
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    // Task 2
    static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    static double average(int[] arr, int n) {
        if (n == 0) return 0;
        return  (double) sum(arr, n) / n;
    }

    // Task 3
    static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    // Task 4
    static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }
}