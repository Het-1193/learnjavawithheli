//package learnjavawithheli.oops;

//this is a class named Pen
// by convention the names of the class start from capital letter and of function/method small letter

class Pen {
    String color;//this is a variable of type string
    String type;//oe this is the property of the class Pen

    //this is a method of class Pen
    public void write(){
        System.out.println("Writing something");
    }

    public void whatcolor(){
        System.out.println("The color of this Pen is : " + this.color); //thsi keyword is used to refer to the current object of the class
    }

}

class Student {
    String name;
    int age;

    public void printinfo(){
        System.out.println("The name of the Student is : " + this.name);
        System.out.println("The age of the Student is : " + this.age);
    }
    
    //constructors
        //name of constructor and class should be same
        //they dont return anything. and have no return type
        //can be called only once when the object is created
        //they are of 3 types
        
        //there is default constructor which is provided by the compiler if we dont create any constructor in the class


        //non parameterized constructor
    /*
    Student() {
        System.out.println("Constructor called");
    }*/

    //parameterized constructor with parameters
    /*
    Student(String name, int age) { //for this to work you need to pass the values right when you create the object of the class studnet
        this.name = name;
        this.age = age;
    }
    */

    Student() {
    // needed to create a default constructor because if we create a parameterized constructor then the default constructor is not provided by the compiler
    }

    //copy constructor - used to create a copy of an object
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }


}

public class oops {

    //This is the main method where th e program starts executing by JVM
    public static void main(String[] args){
        /*
        Pen Pen1 = new Pen(); //creating an object of class Pen
        Pen1.color = "blue"; //assigning value to the property of the class Pen
        Pen1.type = "gel"; //assigning value to the property of the class Pen

        System.out.println("The color of this Pen is : " + Pen1.color); //accessing the property of the class Pen
        System.out.println("The type of this Pen is : " + Pen1.type); //accessing the property of the class Pen

        Pen1.write(); //calling the method of class Pen
        Pen1.whatcolor(); //calling the method of class Pen

        Student stud1 = new Student();
        stud1.name = "Heli"; //assigning value to the property of the class Student
        stud1.age = 20; //assigning value to the property of the class Student

        stud1.printinfo(); //calling the method of class Student
        */

        //Student S1= new Student("Heli", 20); //this allocates space in memory for the object S1 of class Student
        //S1.name = "Heli"; //this is for in case of non parameterized constructor. if we use parameterized constructor then we can pass the values while creating the object of the class
        //S1.age = 20;

        //S1.printinfo();

        Student S1 = new Student();
        S1.name = "Heli";
        S1.age = 20;

        Student S2 = new Student(S1); //this is how we create a copy of an object using copy constructor
        S2.printinfo();


        
        
        
        

    }
}
