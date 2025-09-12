import java.util.Scanner;
public class Temperature {
    public static void main(String arngs[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Temperature in Celsius: ");
        int celsius = in.nextInt();
        
        double fahrenheit = celsius * 9/5 + 32;
        
        System.out.print(celsius + "˚C = ");
        System.out.print(fahrenheit + "˚F");
    }
}
