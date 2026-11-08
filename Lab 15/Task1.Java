// Name: Yash Agarwal
// Roll Number: 2410303565
// Assignment: 15
// Task: 1

import java.util.ArrayList;

class Main {
    static void printSubsets(int[] a, int i, ArrayList<Integer> subset) {
        if (i == a.length) {
            System.out.print("{");

            for (int j = 0; j < subset.size(); j++) {
                System.out.print(subset.get(j));

                if (j < subset.size() - 1) {
                    System.out.print(",");
                }
            }

            System.out.println("}");
            return;
        }

        // First skip the current element
        printSubsets(a, i + 1, subset);

        // Then include the current element
        subset.add(a[i]);
        printSubsets(a, i + 1, subset);

        // Backtracking
        subset.remove(subset.size() - 1);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        printSubsets(a, 0, new ArrayList<Integer>());
    }
}