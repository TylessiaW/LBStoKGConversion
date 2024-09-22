import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        
        
        double kilograms = pounds * 0.454;
        
        
        System.out.println("The weight in kilograms is: " + kilograms);
    }
}
