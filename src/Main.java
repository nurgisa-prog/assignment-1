public class Main {

    public static void main(String[] args) {

        // Task 1
        System.out.println("Task 1:");
        printDigits(5481);

        // Task 2
        System.out.println("\nTask 2:");
        int[] arr1 = {3, 2, 4, 1};
        System.out.println("Average: " + average(arr1, arr1.length));

        // Task 3
        System.out.println("\nTask 3:");
        int n1 = 7;
        int n2 = 10;
        System.out.println(n1 + " -> " + (isPrime(n1, 2) ? "Prime" : "Composite"));
        System.out.println(n2 + " -> " + (isPrime(n2, 2) ? "Prime" : "Composite"));

        // Task 4
        System.out.println("\nTask 4:");
        System.out.println("Factorial of 5: " + factorial(5));

        // Task 5
        System.out.println("\nTask 5:");
        System.out.println(fib(5));

        // Task 6
        System.out.println("\nTask 6:");
        System.out.println(power(2, 10));

        // Task 7
        System.out.println("\nTask 7:");
        int[] arr2 = {1, 4, 6, 2};
        reversePrint(arr2, arr2.length - 1);

        // Task 8
        System.out.println("\n\nTask 8:");
        System.out.println(checkDigits("123456"));
        System.out.println(checkDigits("123a12"));

        // Task 9
        System.out.println("\nTask 9:");
        System.out.println(countChars("hello"));
        System.out.println(countChars("recursion"));

        // Task 10
        System.out.println("\nTask 10:");
        System.out.println(gcd(32, 48));
        System.out.println(gcd(10, 7));
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
        return (double) sum(arr, n) / n;
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

    // Task 5
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    // Task 6
    static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7
    static void reversePrint(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reversePrint(arr, index - 1);
    }

    // Task 8
    static String checkDigits(String s) {
        if (s.length() == 0) return "Yes";
        if (!Character.isDigit(s.charAt(0))) return "No";
        return checkDigits(s.substring(1));
    }

    // Task 9
    static int countChars(String s) {
        if (s.equals("")) return 0;
        return 1 + countChars(s.substring(1));
    }

    // Task 10
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}