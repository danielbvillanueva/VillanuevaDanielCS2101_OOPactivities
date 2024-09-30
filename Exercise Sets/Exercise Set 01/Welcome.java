import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Welcome to CS 211: Object Oriented Programming!");
        
        System.out.print("\nEnter your name: ");
        String user = in.nextLine();

        System.out.println( "This course will be fun, " + user + "!");
    }
}