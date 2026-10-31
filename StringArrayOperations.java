import java.util.Scanner;

public class StringArrayOperations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // String operations
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("\nString Operations");
        System.out.println("-----------------");

        System.out.println("Original String : " + str);
        System.out.println("String Length   : " + str.length());
        System.out.println("Uppercase       : " + str.toUpperCase());
        System.out.println("Lowercase       : " + str.toLowerCase());

        // Reverse string
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed String : " + reverse);

        // Array operations
        System.out.print("\nEnter the number of array elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("\nArray Operations");
        System.out.println("----------------");

        System.out.print("Array Elements : ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum of Array   : " + sum);

        sc.close();
    }
}
