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
}

public class oops {

    //This is the main method where th e program starts executing by JVM
    public static void main(String[] args){

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

        

    }
}
