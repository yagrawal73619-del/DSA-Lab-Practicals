// Name: Yash Agarwal
// Roll Number: 2410303565
// Assignment: 10
// Task: 2


class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
}

class Task2 {
    public static void main(String[] args) {
        Student s = new Student("Neha");

        System.out.println("Name: " + s.name);
    }
}