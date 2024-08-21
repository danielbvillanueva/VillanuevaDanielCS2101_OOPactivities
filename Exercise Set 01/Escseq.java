public class Escseq {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int number = i * 7;

            if (i % 2 == 0) {
                System.out.println("\t" + number); 
            } else {
                System.out.println(number); 
            }
        }
    }
}
