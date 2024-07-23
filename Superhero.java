import java.util.Scanner;

public class Superhero {
    public static void main(String[] args) {
        //Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        //Prompting the user to begin the story
        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        //Reading the user's input (heroName)
        String heroName = scanner.nextLine();

        //Prompting the user for superhero's superpower
        System.out.println("What is their superpower?");
        //Reading the user's input (superpower)
        String superpower = scanner.nextLine();

        //Printing the superhero's story using string concatenation
        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + heroName + ", who had the power of " + superpower + ".");
        System.out.println("As they grew older, " + heroName + " saw that the world needed them.");
        System.out.println(heroName + " used their ability to " + superpower + " to save the world.");
    }
}

