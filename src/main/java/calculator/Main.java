package calculator;

import java.util.Scanner;

import static operations.MathOperations.*;

public class Main {

    public static void main(String args[]) {
        System.out.print("Enter First value");
        int firstNumber = enterValue();
        System.out.print("Enter Second value");
        int secondNumber = enterValue();
        int finalResult = 0;
        System.out.println("Choose math operation");
        System.out.println("Possible math operations: +, -, *, /");
        char mathOperation = enterMathOperation();
        switch (mathOperation) {
            case '+':
                finalResult = supplement(firstNumber, secondNumber);
                break;
            case '-':
                finalResult = subtraction(firstNumber, secondNumber);
                break;
            case '*':
                finalResult = multiplication(firstNumber, secondNumber);
                break;
            case '/':
                if (secondNumber == 0) {
                    System.out.println("Failed divide by 0");
                    break;
                } else {
                    finalResult = division(firstNumber, secondNumber);
                }
                break;
            default:
                System.out.println("Failed to execute. Try another time.");
        }
        System.out.println("Final result = " + finalResult);
    }

    public static int enterValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int value;
        if (scanner.hasNextInt()) {
            value = scanner.nextInt();
        } else {
            System.out.println("Please enter number!");
            scanner.next();
            value = enterValue();
        }
        return value;
    }

    public static char enterMathOperation() {
        Scanner scanner = new Scanner(System.in);
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Please enter correct math operation");
            scanner.next();
            operation = enterMathOperation();
        }
        return operation;
    }
}
