import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double num1 = i.nextDouble();

        System.out.print("Enter a number: ");
        double num2 = i.nextDouble();

        System.out.print("Enter operation (A,S,M,D): ");
        String op = i.next();

        double result;
        switch (op.toUpperCase()) {
            case "A":
                result = num1 + num2;
                System.out.println(result);
                break;
            case "S":
                result = num1 - num2;
                System.out.println(result);
                break;
            case "M":
                result = num1 * num2;
                System.out.println(result);
                break;
            case "D":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero.");
                } else {
                    result = num1 / num2;
                    System.out.println(result);
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }

        i.close();
    }
}