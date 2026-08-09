package guessnum;

import java.util.Scanner;

public class project{

    public static void main(String[] args){
        
        System.out.println("Guess a number between 1 and 100");

        int num=(int)(Math.random()*100);
        int i=1;

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        while(true){

            System.out.print("\nEnter your guess "+i+": ");
            i+=1;
            int guess=sc.nextInt();

            if(guess<0){
                break; 
            } else if(guess>100){
                System.out.println("out of range! Please guess a number between 1 and 100.");
            } else if(guess<num){
                System.out.println("Your guess is too low.");
            } else if(guess>num){
                System.out.println("Your guess is too high.");
            }
            else {
                System.out.println("\n\nCongratulations! You guessed the number.");
                break;
            }

        }
        sc.close();

    }
}