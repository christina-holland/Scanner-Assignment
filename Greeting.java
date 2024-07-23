import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Asking the user for their name
        System.out.print("What's your name? ");

        //Reading the user's input (name)
        String name = scanner.nextLine();

        //Printing the greeting message
        System.out.println("Hi " + name);
    }
}

