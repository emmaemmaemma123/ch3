package ch3;

import java.util.Scanner;
public class Time{
    public static void main(String arngs[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Type in Seconds: ");
        int seconds = in.nextInt();
        int hours = seconds/3600;
        int remaininghour = seconds % 3600;
        int minutes = remaininghour/60;
        int seconds2 = remaininghour%60;
        
        
        System.out.print(seconds + (" seconds = ") + hours + (" hours, ") + minutes + (" minutes, ") + (" and ") +  seconds2 + (" seconds"));
        
        
        
    }
}
