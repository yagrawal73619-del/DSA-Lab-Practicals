// Name: Yash Agarwal
// Roll Number: 2410303565
// Assignment: 11
// Task: 2

class Shape {
    int area() {
        return 0;
    }
}

class Rectangle extends Shape {
    int length, breadth;

    int area() {
        return length * breadth;
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.length = 4;
        r.breadth = 5;

        System.out.println("Area: " + r.area());
    }
}