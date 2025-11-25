class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class Marks extends Student {
    int mark1;
    int mark2;
    int mark3;

    Marks(String name, int rollNo, int m1, int m2, int m3) {
        super(name, rollNo);
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    void calculateAndPrint() {
        int total = mark1 + mark2 + mark3;
        double percentage = (double) total / 3;

        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Mark 3: " + mark3);
        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage: %.2f%%%n", percentage);
    }
}

public class Result {
    public static void main(String[] args) {
        Marks studentResult = new Marks("Azhaan", 101, 88, 92, 95);
        studentResult.calculateAndPrint();
    }
}