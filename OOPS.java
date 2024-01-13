// is the pen class with no static void nothing 
class pen{ // data
    String color; 
    String type;

    public void print(){ //members
        System.out.println(this.color);
    }

    public void write(){ //members
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}
public class OOPS {
    public static void main(String args[]){
    pen pen1 = new pen();
    // made an object here 
    pen1.color = "blue";
    pen1.type = "gel";

    pen pen2 = new pen();
    pen2.color ="black";
    pen2.type = "ball";
    
    pen1.print();
    pen2.write();

    Student s = new Student();
    s.name = "Prisha";
    s.age = 22;

    s.printName();
    }
}
