package javaprogramming;

/*
defining the package so that the it knows what we are refering to;
and there are no name conflicts cuz there can be classes with same names in different folders
it makes like a proper organized folder structure
*/

import java.util.Arrays; //importing the Arrays class from the java.util package to use its methods

//most things follow the came things as in C programming

/*
defining the public class
it should be named same as the file name
there is only one public class in a file
it is accessible anywhere unlike smiple class which is accessible only in its package
it contains the main method, variables/properties, methods/functions,
*/

/*Making first class */
public class Main{

   /* defining the main method which is the entery point that JVM looks for to begin execution */
    public static void main(String[] args){//main method = PSVM P-Access modifier, S-Static, V-Void(return type), M-Main(method name), String[] args (Parameter)
        //static keyword:  indicates that a particular member (variable, method, block, or nested class) belongs to the class itself rather than to individual instances (objects) of that class
        /*Printing in java */
        System.out.print("Hello World"); //SOP used to print
        System.out.println("Hello Hetvi"); //SOPln used to print and leave a line after it
        System.out.print("Hello Hetvi");

        /*variable in java */
        String name = "Hetvi"; //String variable
        int age = 20; //Integer variable
        
        String god = name; //String variable can be assigned to another string variable
        String everything = god; //String variable can be assigned to another string variable
    
        /*Different data types in java */ 
        
        /*Primitive data types in java */
        //have fixed size and are stored in stack memory
        byte num=30;
        short num2=30000;
        int phone=123456789;
        long phone2=12345678900L; //long data type should be suffixed with L
        float pi=3.14f; //float data type should be suffixed with f
        double pi2=3.14; //double data type can be suffixed with d but it is optional
        char letter='A'; //char data type should in single quotes
        boolean isJavaFun=true; //boolean data type can be true or false

        //printing multiple variables in a single line
        //conactination of variables is done using + operator
        System.out.println("Name: "+name+" Age: "+age+" Phone: "+phone+" Pi: "+pi+" Letter: "+letter+" Is Java Fun: "+isJavaFun);

        /*Non-primitive data types in java */

        //string in java

        //have variable size and are stored in heap memory
        //new keyword is used to create a new object in heap memory
        String who= new String("Aman"); // a new boject is created in heap memory and the reference is stored in stack memory
        String where="India";//no new object is created in heap memory and the reference is stored in stack memory
        
        //string functions in java
        System.out.println("length of name: "+name.length()); // length function : returns the length of the string
        System.out.println(name.charAt(0)); //char at fucntion : returns the character at the specified index
        System.out.println(name.indexOf("t")); //index of function : returns the index of the specified character
        System.out.println(name.substring(0,3)); //substring function : returns the substring from the specified index to the specified index
        System.out.println(name.toUpperCase()); //to upper case function : returns the string in upper case
        System.out.println(name.toLowerCase()); //to lower case function : returns the string in lower case
        System.out.println(name.replace("h","H")); //replace function : replaces the specified character with the specified character

        //array in java
        
        int[] arr = new int[5]; //defining an array of integers with size 5
        arr[0] = 90;
        arr[1] = 80;
        arr[2] = 70;
        arr[3] = 60;
        arr[4] = 50; //defining an array of integers with size 5 and initializing it with values

        System.out.println(arr); //printing the array will print the reference of the array in heap memory not the values of the array
        System.out.println(arr[0]); //printing the value at index 0 of the array

        String[] names = {"Aman","Hetvi","Riya"}; //defining an array of strings with size 3 and initializing it with values
        System.out.println(names[0]); //printing the value at index 0 of the array

        System.out.println("length of array: "+arr.length); //length of array : returns the length of the array #this is an property of arrays not a function so no () is used
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }

}