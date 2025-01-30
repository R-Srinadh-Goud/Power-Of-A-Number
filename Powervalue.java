import java.util.Scanner;

public class Powervalue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask for the base and exponent
        System.out.print("Enter the base: ");
        double base = input.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = input.nextDouble();

        // Calculate power using Math.pow
        double result = Math.pow(base, exponent);

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is " + result);
    }
}

