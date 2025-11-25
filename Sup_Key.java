class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Parent Name: " + name + ", Parent Age: " + age);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.name = name;
        this.grade = grade;
    }

    @Override
    void display() {
        System.out.println("Child Name: " + name + ", Grade: " + grade);
        super.display();
    }
}

class Sup_Key {
    public static void main(String[] args) {
        Student student = new Student("Azhaan", 20, "S");
        student.display();
    }
}