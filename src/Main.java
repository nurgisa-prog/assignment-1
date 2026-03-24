public class Main {

    // Task 5: Fibonacci
    static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    // Task 6: Power
    static int power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    // Task 7: Reverse output
    static void reversePrint(int[] arr, int index) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reversePrint(arr, index - 1);
    }

    public static void main(String[] args) {

        // Task 5
        int n = 5;
        System.out.println("Task 5: " + fib(n));

        // Task 6
        int a = 2;
        int p = 10;
        System.out.println("Task 6: " + power(a, p));

        // Task 7
        int[] arr = {1, 4, 6, 2};
        System.out.print("Task 7: ");
        reversePrint(arr, arr.length - 1);
    }
}