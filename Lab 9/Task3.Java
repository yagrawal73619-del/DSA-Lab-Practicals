// Name: Yash Agarwal
// Roll Number: 2410303565
// Assignment: 9
// Task: 3


class Counter {
    int count;

    Counter() {
        count = 0;
    }

    void increment() {
        count++;
    }
}

class Task3 {
    public static void main(String[] args) {
        Counter c = new Counter();

        c.increment();
        c.increment();
        c.increment();

        System.out.println("Count: " + c.count);
    }
}