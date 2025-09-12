package ch3;

import java.util.Scanner;
import java.util.Random;
public class GuessMyNumber{
    public static void main(String arngs[]){
        Random random = new Random();
        int number = random.nextInt(100) + 1;
            
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both)." + " Can you guess what it is?");
        System.out.print("Type a number: ");
        
        Scanner in = new Scanner(System.in);
        int response = in.nextInt();
        
        
        int off = number - response;
        System.out.println("Your guess is: " + response);
        System.out.println("The number I was thinking of was: " + number);
        System.out.print("Your number was off by: " + off);
        
    }
}
