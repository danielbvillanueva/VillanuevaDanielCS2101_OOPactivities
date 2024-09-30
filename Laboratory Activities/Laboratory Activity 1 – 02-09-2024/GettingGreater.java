import java.util.Scanner;

public class GettingGreater {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Getting the Greater Value");

        System.out.print("Enter the first character: ");
        char char1 = in.next().charAt(0);

        System.out.print("Enter the first character: ");
        char char2 = in.next().charAt(0);

        char greaterChar = (char) Math.max(char1, char2);

        System.out.println("-------------------------------------------");
        System.out.println("The Character with greater value is: " + greaterChar);
        System.out.println("-------------------------------------------");
        
        System.out.println("Showing the ASCII Codes");
        System.out.println(char1 + ": " + (int) char1);
        System.out.println(char2 + ": " + (int) char2);

        in.close();
    }
}