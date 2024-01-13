class Pen{
    //BLUEPRINT 

    // TYPE AND COLOR HERE ARE THE PROPERTIES 
    String color;
    String type; // ballpen or gel pen 

    //Functions that are defined in the class are called methods 
   public void write (){ // this is a function 
    System.out.println("writing something");  
   }   

   // let's print the color and type of pen 
   public void printColor(){
    System.out.println(this.color);
   }

   public void printType(){
    System.out.println(this.type);
   }
}

class Student{
    // Name of the classes are always in capital letter and name of the functions are always in small letter 
    String name;
    String age;

    public void printName(){
        System.out.println(this.name);
    }

    public void printAge(){
        System.out.println(this.age);
    }

    Student(){
        System.out.println("Prisha shah");
    }
}

// now we'll make objects of the class, which we'll make it in the main class 
public class ObjectsAndClass {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        // instant varibales of a class is basically objects 
        // made an object of the class 
    //  class variable = keyword constructor paranthesis {as it is a special function}
       // name of the class and the constructor is supposed to be same 
        pen1.color = "blue" ;
        pen1.type = "gel" ;
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "green";
        pen2.type = "ball" ;
        pen2.write();
    
        pen1.printType();
        pen2.printType();
        pen1.printColor();
        pen2.printColor();

        Student s1 = new Student();
        s1.name = "PRISHA";
        s1.age = "18";
        s1.printName();
        s1.printAge();

    }
}