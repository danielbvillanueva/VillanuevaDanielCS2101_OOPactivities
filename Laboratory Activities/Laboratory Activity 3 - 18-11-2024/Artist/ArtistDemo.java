package Artist;

public class ArtistDemo {
    public static void main(String[] args) {
        Artist artist = new Artist("Ed Sheeran", "British", 32, "Music");
        artist.displayInfo();
        System.out.println();

        Singer singer = new Singer("Harry Styles", "British", 29, "Music", Genre.POP);
        singer.displayInfo();
        System.out.println();

        Painter painter = new Painter("Leonardo da Vinci", "Italian", 67, "Painting", Medium.OIL);
        painter.displayInfo();
        System.out.println();

        Writer writer = new Writer("George Orwell", "British", 46, "Writing", WritingStyle.FICTION);
        writer.displayInfo();
        System.out.println();

        Dancer dancer = new Dancer("Michael Jackson", "American", 50, "Dancing", DanceStyle.HIPHOP);
        dancer.displayInfo();
    }
}

