import java.util.Scanner;

public class ArrayHandler {
    public static void main(String[] args) {
        
        int[] myArray = {10, 20, 30, 40, 50};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index to display (0-4): ");
        int index = scanner.nextInt();

        try {
            System.out.println("The element at index " + index + " is: " + myArray[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index. Please enter a number between 0 and 4.");
        }

        scanner.close();
    }
}