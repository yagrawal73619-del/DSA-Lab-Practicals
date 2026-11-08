// Name: Yash Agarwal
// Roll Number: 2410303565
// Assignment: 10
// Task: 3



class Person {
    String name;

    void greet() {
        System.out.println("Hello, " + name);
    }
}

class Teacher extends Person {
}

class Task3 {
    public static void main(String[] args) {
        Teacher t = new Teacher();

        t.name = "Kiran";
        t.greet();
    }
}