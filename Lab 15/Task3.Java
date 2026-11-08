// Name: Yash Agarwal
// Roll Number: 2410303565
// Assignment: 15
// Task: 3

class Main {
    static void arrange(char[] a, boolean[] used, char[] result, int index) {
        if (index == a.length) {
            System.out.println(result);
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[index] = a[i];

                arrange(a, used, result, index + 1);

                used[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        char[] a = {'x', 'y'};
        boolean[] used = new boolean[a.length];
        char[] result = new char[a.length];

        arrange(a, used, result, 0);
    }
}