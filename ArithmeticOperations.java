import java.util.Scanner;

public class ArithmeticOperations {

    int a, b;

    void add() {
        System.out.println("Addition = " + (a + b));
    }

    void subtract() {
        System.out.println("Subtraction = " + (a - b));
    }

    void multiply() {
        System.out.println("Multiplication = " + (a * b));
    }

    void divide() {
        System.out.println("Division = " + (a / b));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Creating object
        ArithmeticOperations obj = new ArithmeticOperations();

        System.out.print("Enter first number: ");
        obj.a = sc.nextInt();

        System.out.print("Enter second number: ");
        obj.b = sc.nextInt();

        obj.add();
        obj.subtract();
        obj.multiply();
        obj.divide();

        sc.close();
    }
}
