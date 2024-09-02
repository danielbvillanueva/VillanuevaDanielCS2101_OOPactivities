import java.util.Scanner;

public class GettingInputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int getYear = in.nextInt();
        in.nextLine();

        System.out.print("Enter the genre: ");
        String getGenre = in.nextLine();

        System.out.print("Enter the album: ");
        String getAlbum = in.nextLine();

        System.out.print("Enter the song title: ");
        String getTitle = in.nextLine();

        System.out.print("Enter the artist: ");
        String getArtist = in.nextLine();

        System.out.println("---------------------------");
        System.out.println("SONG DETAILS");
        System.out.println("---------------------------");

        System.out.println(" Year Released: " + getYear + "\n Genre: " + getGenre + "\n Album: " + getAlbum + "\n Title: " + getTitle + "\n Artist: " + getArtist);
        
    }
}