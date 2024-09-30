import java.util.Scanner;

public class Tempconvert {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a Celsius value: ");
        double celsius = in.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.printf("%.2f Celsius is %.2f Fahrenheit\n", celsius, fahrenheit);
    }
}
