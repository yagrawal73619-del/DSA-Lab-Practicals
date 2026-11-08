// Name: Yash Agarwal
// Roll Number: 2410303565
// Assignment: 10
// Task: 1



class Animal {
    void sound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
}

class Task1 {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.sound();
    }
}