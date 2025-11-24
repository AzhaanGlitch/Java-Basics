import java.util.Scanner;

public class AgeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scanner.nextInt();
        scanner.close();

        if (age < 13) {
            System.out.println("Child");
        } else if (age < 18) {
            System.out.println("Teen");
        } else if (age <= 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }
    }
}