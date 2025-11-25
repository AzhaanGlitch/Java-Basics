import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        int age = scanner.nextInt();
        long contactNumber = scanner.nextLong();
        float height = scanner.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Height: " + height);

        scanner.close();
    }
}