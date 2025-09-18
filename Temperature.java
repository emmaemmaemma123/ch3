package ch3;

import java.util.Scanner;
public class Temperature {
    public static void main(String arngs[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Temperature in Celsius: ");
        int celsius = in.nextInt();
        double calculate = (double) (celsius*9)/5;
        
        double fahrenheit = calculate + 32;
        
        System.out.print(celsius + "˚C = ");
        System.out.print(fahrenheit + "˚F");
    }
}
