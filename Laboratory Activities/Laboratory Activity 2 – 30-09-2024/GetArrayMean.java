import java.util.Scanner;

public class GetArrayMean{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter number: ");
            arr[i] = in.nextInt();
        }
        double mean = getArrayMean(arr);
        System.out.printf("Mean of array is: %.2f\n", mean);

        in.close();
    }

    public static double getArrayMean(int[] arr){
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
       return sum / arr.length;
    }
}