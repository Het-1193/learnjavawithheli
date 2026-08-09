package javaprogramming;

/*
defining the package so that the it knows what we are referring to;
and there are no name conflicts cuz there can be classes with same names in different folders
it makes like a proper organized folder structure
*/

import java.util.Arrays; //importing the Arrays class from the java.util package to use its methods #used to perform various operations on arrays like sorting, searching, etc.
import java.util.Scanner; //importing the Scanner class from the java.util package to use its methods #used to take user input from the console

//most things follow the came things as in C programming

/*
defining the public class
it should be named same as the file name
there is only one public class in a file

it is accessible anywhere unlike simple class which is accessible only in its package
it contains the main method, variables/properties, methods/functions,
*/

/*Making first class */
public class Main{

    //functions area

        //simple function    
        public static void printjava(){
            System.out.println("Java is fun!");
        }

        //function with parameters
        public static void printname(String name){
            System.out.println("Hello "+name);
        }

        public static void printsum(int a, int b){
            System.out.println("Sum: "+(a+b));
        }



   /* defining the main method which is the entry point that JVM looks for to begin execution */

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
        //concatenation of variables is done using + operator

        System.out.println("Name: "+name+" Age: "+age+" Phone: "+phone+" Pi: "+pi+" Letter: "+letter+" Is Java Fun: "+isJavaFun);

        /*Non-primitive data types in java */

        //string in java

        //have variable size and are stored in heap memory
        //new keyword is used to create a new object in heap memory

        String who= new String("Aman"); // a new boject is created in heap memory and the reference is stored in stack memory

        String where="India";//no new object is created in heap memory and the reference is stored in stack memory
    
        //string functions in java

        System.out.println("length of name: "+name.length()); // length function : returns the length of the string
        System.out.println(name.charAt(0)); //char at function : returns the character at the specified index
        System.out.println(name.indexOf("t")); //index of function : returns the index of the specified character
        System.out.println(name.substring(0,3)); //substring function : returns the substring from the specified index to the specified index
        System.out.println(name.toUpperCase()); //to upper case function : returns the string in upper case
        System.out.println(name.toLowerCase()); //to lower case function : returns the string in lower case
        System.out.println(name.replace("h","H")); //replace function : replaces the specified character with the specified character

        /*array in java*/
        
        int[] arr = new int[5]; //defining an array of integers with size 5
        arr[0] = 90;
        arr[1] = 80;
        arr[2] = 70;
        arr[3] = 60;
        arr[4] = 50; //defining an array of integers with size 5 and initializing it with values
        
        //array functions and stuff

        System.out.println(arr); //printing the array will print the reference of the array in heap memory not the values of the array
        System.out.println(arr[0]); //printing the value at index 0 of the array

        System.out.println("Original Array: "+Arrays.toString(arr)); //toString function of array class: converts the array to string and returns it

        String[] names = {"Aman","Hetvi","Riya"}; //defining an array of strings with size 3 and initializing it with values # doent require new keyword it automatically does the work.
        System.out.println(names[0]); //printing the value at index 0 of the array

        System.out.println("length of array: "+arr.length); //length of array : returns the length of the array #this is an property of arrays not a function so no () is used
        Arrays.sort(arr); //sort function of array class: sorts the array
        System.out.println("Sorted Array: "+Arrays.toString(arr));

        //2 D Array
        int[][] marks={{90,85,100},{45,68,78}};
        System.out.println(marks[0][1]);
        System.out.println(Arrays.toString(marks)); //this dos'nt work in case of multidimensional array it'll just print the reference of the array in heap memory not the values of the array
        System.out.println("2D Array: "+Arrays.deepToString(marks)); //deepToString function : used to print multidimensional arrays

        /*Casting in java
        casting is used to convert one data type to another data type*/

        //Implicit casting: converting a smaller data type to a larger data type
        double price = 9.78;
        double fprice = price + 50; //implicit casting
        System.out.println(fprice);

        int p = 100;
        //int fp= p + 18.0; this shows error cuz double is bigger than int and we are trying to assign a double value to an int variable
        int fp= p + (int)18.0; //explicit casting: converting a larger data type to a smaller data type
        System.out.println(fp); //it simply removes all the decimal values and gives the integer value of the double value

        /*Widening Casting (automatic) - converting a smaller type to a larger type size
        byte -> short -> char -> int -> long -> float -> double
        Narrowing Casting (manual) - converting a larger type to a smaller type size
        double -> float -> long -> int -> char -> short -> byte*/

        //Narrowing Casting (manual) - converting a larger type to a smaller type size

        // double to float (loss of precision beyond ~7 decimals)
        double myDouble = 3.1415926535;
        float myFloat = (float) myDouble;    // 3.1415927

        // float to long / int (truncates decimal part completely)
        float price1 = 99.99f;
        long roundedPrice = (long) price;    // 99
        int intPrice = (int) price;          // 99

        // int to short and byte (potential overflow)
        int largeInt = 130;
        short myShort = (short) largeInt;    // 130 (fits in 16-bit short)
        byte myByte = (byte) largeInt;       // -126 (overflow! byte max is 127)

        // int to char (maps numeric value to Unicode character)
        int code = 65;
        char letter1 = (char) code;           // 'A'

        // char to short (char is unsigned 16-bit, short is signed 16-bit)
        char symbol = 'Z';
        short symbolCode = (short) symbol;   // 90

        // String to Primitives (Parsing)
        // String to int, double, boolean to do this you simply write the data type followed by .parseType("string") and it will convert the string to the respective data type
        int one = Integer.parseInt("456");          // 456
        double two = Double.parseDouble("3.14"); // 3.14
        boolean three = Boolean.parseBoolean("true");// true

        // Primitives to String
        String four = String.valueOf(100);              // "100"
        String five = Double.toString(9.99);         // "9.99"
        String strFloat = Float.toString(4.56f);                 // "4.56"
        //

        final int birthday = 19; //final keyword is used to declare a constant variable which cannot be changed once assigned

        /*Operators in java are same as in any other language and logical operators are like C. small potato stuff*/

        /*Conditional Statements*/
        boolean sunisup = true;
        if (sunisup == true)// not necessary to write == true, if(sunisup) is enough it will automatically check if the boolean variable is true  and if you want to check for false then just write !sunisup
            System.out.println("day");
        else
            System.out.println("night");

        //taking user input in java using Scanner class
        Scanner sc = new Scanner(System.in); //creating an object of Scanner class
        //sc is name and new Scanner(System.in) is the constructor of Scanner class which takes input from the console(keyboard) (System.in is the standard input stream which is used to take input from the console)        
        //Other options: read from file using File, or directly write in the string or from interner/network using: Socket.getInputStream() or URL.openStream() etc.
        //use BufferReader if you want to read large amount of data from the console cuz it is faster than Scanner class
        //use console class if you want to read password from the console cuz it does not show the password on the console (console.readPassword() method) but it is not available in all IDEs so use Scanner class instead

        //pen=10 and notebook=40

    /*
        //now lets take input
        System.out.print("Enter the cash you have: ");
        int cash=sc.nextInt(); //taking integer input from the user using nextInt() method of Scanner class

    */

        /*
        scanner.nextLine() : Reads a full sentence/text
        scanner.next() : Reads just a single word 
        scanner.nextInt() : Reads a whole number 
        scanner.nextDouble() : Reads a decimal number 
        scanner.nextBoolean() : Reads true or false.
        */

/*

        System.out.println("Cash: "+cash); //printing the input taken from the user

        if (cash>=50)
            System.out.println("You can buy a notebook");
        else if (cash>=10)
            System.out.println("You can buy a pen");
        else
            System.out.println("You cannot buy anything");
    
        //example of other type of input:

        sc.nextLine();
        
        System.out.println("Enter your fav quote: ");
        String quote=sc.nextLine(); //taking string input from the user using nextLine()

        System.out.println("Quote of the day: "+quote); //printing the input taken from the user

        String name2=sc.next(); //taking string input from the user using next() method of Scanner class
        System.out.println("Name: "+name2); //printing the input taken from the user

        int num1=sc.nextInt(); //taking integer input from the user using nextInt() method of Scanner class
        System.out.println("Number: "+num1); //printing the input taken from the user

        double num3=sc.nextDouble(); //taking double input from the user using nextDouble() method of Scanner class
        System.out.println("Number: "+num3); //printing the input taken from the user

        Boolean bool=sc.nextBoolean(); //taking boolean input from the user using nextBoolean() method of Scanner class
        System.out.println("Boolean: "+bool); //printing the input taken from the user
    
*/

        //switch case in java

/*

        System.out.print("Enter the day of the week (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day of the week");
        }

*/        
        //Loops in java
        //these are same as in C

        //for loop in java
        int i;
        System.out.print("Numbers: ");
        for(i=0;i<=10;i++){
            System.out.print(i);
        }

        //while loop in java
        i=0;
        System.out.print("\nNumbers: ");
        while(i<=10){
            System.out.print(i);
            i+=1;
        }

        System.out.print("\nNumbers: ");
        //do while loop in java
        i=0;
        do {
            System.out.print(i);
            i+=1;
        } while(i<=10);

        //sc.close(); //closing the scanner object to prevent memory leak // closed it later so that we can use it later for taking input from the user

        //Break and continue statements in java

        //using break statement in java
        i=0;
        System.out.print("\nNumbers: ");
        while(i<=10){
            if(i==5){
                break; //break statement is used to exit the loop
            }
            System.out.print(i);
            i+=1;
        }


        //using continue statement in java
        i=0;
        System.out.print("\nNumbers: ");
        while(i<=10){
            if(i==5){
                i+=1;
                continue; //continue statement is used to skip the current iteration of the loop
            }
            System.out.print(i);
            i+=1;
        }

        //Exception handling in 
        
        //Java version has: try-catch-finally-throw-throws

        /*
        try: holds risky block of code
        catch: handles the exception thrown by the try block
        finally: executes the code after try-catch block regardless of whether an exception is thrown or not
        throw: used to throw an exception explicitly # basically raise of python
        throws: used to declare the exceptions that a method can throw
        */

        try {
            //int result = 10 / 0; // Risky code (ArithmeticException)
            throw new Exception("Locked in");
            //at one time only one will be raised in this so put one in comment to run either one

        } catch (ArithmeticException | NumberFormatException e) { // catching multiple exceptions at once using | operator0
        System.out.println("\nCannot divide by zero!"); // Runs ONLY if ArithmeticException happens
        } catch (Exception e) {
        System.out.println("\nExceptional: " + e.getMessage()); // or just write e only but get message is used to get the message of the exception
        } finally {
        System.out.println("This ALWAYS runs no matter what."); // Cleanup code
        }

        //not using throws now cuz its used to declare the exceptions that a method can throw and we are not using any methods here so no need to use throws

        //Function/Methods in java
        //used for repetitive tasks and to make the code more readable and organized

        //these are written at the top and called her cuz you cannot write a method inside one method (public static void main (Strings[] args))
        /*but there are ways to do it if you wanna:
        1. By local inner class: You can define a local inner class inside a method and then define methods inside that inner class. (these are for more complex actions/calculations with multiple variables and methods and stuff) big potato
        2. Lambda expressions (Java 8 and later): If you're using Java 8 or later, you can use lambda expressions to define small functions inside methods. (these are short one liner ones for simple small action/calculation) small potato
        */ 

        printjava(); //calling the function
        printjava(); //calling the function again

        //Scanner sc = new Scanner(System.in)

        System.out.print("Enter your name: ");
        String n=sc.nextLine(); //taking string input from the user using nextLine() method of Scanner class

        printname(n);

        System.out.print("Enter value of a:");
        int a = sc.nextInt(); //taking integer input from the user using nextInt() method of Scanner class
        System.out.print("Enter value of b:");   
        int b = sc.nextInt(); //taking integer input from the user using nextInt() method of Scanner class

        printsum(a,b);

        sc.close();
    }
}