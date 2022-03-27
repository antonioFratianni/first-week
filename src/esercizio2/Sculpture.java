package esercizio2;

public class Sculpture extends ArtWork {

    private double width;
    private double height;
    private double profondita;

    public Sculpture(String title, String author, double width, double height, double depth) {
        super(title, author);
        this.width = width;
        this.height = height;
        this.profondita = depth;
    }

    public double Encumbrance() {
        return width * height * profondita / 1000000;
    }

    public String toString() {
        String s = "titolo: " + title + " autore: " + author + " altezza: "
                + height + " larghezza: " + width + " profondita: " + profondita;
        return s;
    }
}
