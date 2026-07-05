import java.util.Scanner;

public class DivisionUsingScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result = a / b;

        System.out.println("Division = " + result);

        sc.close();
    }
}
