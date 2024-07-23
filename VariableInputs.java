import java.util.Scanner;

public class VariableInputs {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompting the user for string input
        System.out.print("Enter a string of text: ");
        //Reading the user's input
        String stringInput = scanner.nextLine();

        //Prompting the user for integer input
        System.out.print("Enter an integer: ");
        //Reading the user's input and converting the string to an integer
        int integerInput = Integer.valueOf(scanner.nextLine());

        //Prompting the user for double input
        System.out.print("Enter a double: ");
        //Reading the user's input and converting the string to a double
        double doubleInput = Double.valueOf(scanner.nextLine());

        //Prompting the user for boolean input
        System.out.print("Enter a boolean value (true/false): ");
        //Reading the user's input and converting the string to a boolean
        boolean booleanInput = Boolean.valueOf(scanner.nextLine());

        //Printing the inputs using string concatenation
        System.out.println("Your string is: " + stringInput);
        System.out.println("Your integer is: " + integerInput);
        System.out.println("Your double is: " + doubleInput);
        System.out.println("Your boolean is: " + booleanInput);
    }
}

