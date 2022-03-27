package esercizio2;

public class Square extends ArtWork {

    private double height;
    private double width;

    public Square(String title, String author, double height, double width) {
        super(title, author);
        this.height = height;
        this.width = width;
    }

    public double Encumbrance() {
        return width * height / 10000;
    }

    public String toString() {
        String s = "titolo: " + title + " autore: " + author + " altezza:" + height
                + " larghezza:" + width;
        return s;
    }
}
