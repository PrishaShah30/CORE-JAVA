class pen {
    String color;
    String type;

    public void print() {
        System.out.println(this.color);
    }

    public void write() {
        System.out.println(this.type);
    }
}

class Student {
    String name;
    int age;

    public void printName() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Constructor for the Student class
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OOPS {
    public static void main(String args[]) {
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ball";

        pen1.print();
        pen1.write(); // Corrected method name

        Student s = new Student("Prisha", 22); // Provide constructor parameters

        s.printName();
    }
}
