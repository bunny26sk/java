interface Animal {
    void sound();
}

// Parent class
class AnimalParent {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class - Inheritance
class Dog extends AnimalParent implements Animal {

    // Polymorphism - Method Overriding
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class OOPDemo {

    public static void main(String[] args) {

        // Creating object
        Dog obj = new Dog();

        // Inheritance
        obj.eat();

        // Interface and Polymorphism
        obj.sound();

        // Exception Handling
        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result = " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: Cannot divide by zero");
        }

        System.out.println("Program executed successfully");
    }
}
