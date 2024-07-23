import java.util.Scanner;

public class HelloThere {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompting the user for the first input
        System.out.println("Hello there! How are you doing today?");
        //Reading the user's input (response1)
        String response1 = scanner.nextLine();

        //Prompting the user for the second input
        System.out.println("Wow - Interesting! Tell me more!");
        //Reading the user's input (response2)
        String response2 = scanner.nextLine();

        //Printing a goodbye message
        System.out.println("Nice talking to you! Goodbye!");
    }
}

