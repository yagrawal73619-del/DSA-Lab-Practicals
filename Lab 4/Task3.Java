class Task3 {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int min = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[min]) {
                min = i;
            }
        }

        int temp = a[0];
        a[0] = a[min];
        a[min] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}