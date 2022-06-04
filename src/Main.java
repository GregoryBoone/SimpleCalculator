import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator calculator = new SimpleCalculator();

        //user enters numbers

        System.out.println("Enter the first number: ");
        double firstNumber = scanner.nextDouble();
        calculator.setFirstNumber(firstNumber);

        System.out.println("Enter the second number: ");
        double secondNumber = scanner.nextDouble();
        calculator.setSecondNumber(secondNumber);

        System.out.println("Enter an operation: ");
        String operation = scanner.next();

        switch (operation){
            case "+": System.out.println(firstNumber + " + " + secondNumber + " = " + calculator.getAdditionResult() ); break;
            case "-": System.out.println(firstNumber + " - " + secondNumber + " = " + calculator.getSubtractionResult() ); break;
            case "*": System.out.println(firstNumber + " * " + secondNumber + " = " + calculator.getMultiplicationResult() ); break;
            case "/": System.out.println(firstNumber + " / " + secondNumber + " = " + calculator.getDivisionResult() ); break;
            default: System.out.println("Please enter a valid operation; either +, -, *, or /.");
        }



    }
}
