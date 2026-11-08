// Name: Yash Agarwal
// Roll Number: 2410303565
// Assignment: 12
// Task: 1

class Main {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("factorial: " + factorial(5));
    }
}