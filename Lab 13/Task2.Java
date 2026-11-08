// Name: Yash Agarwal
// Roll Number: 2410303565
// Assignment: 13
// Task: 2

class Main {
    static int max(int[] a, int i) {
        if (i == a.length - 1) {
            return a[i];
        }

        return Math.max(a[i], max(a, i + 1));
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};

        System.out.println("Maximum: " + max(a, 0));
    }
}