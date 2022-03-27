package esercizio2;

public abstract class ArtWork {

    protected String title;
    protected String author;

    abstract double Encumbrance();

    public ArtWork(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public boolean equals(ArtWork o) {
        return this.title.equals(o.title)
                && this.author.equals(o.author);
    }

    public void printEncumbrance() {
        if (this instanceof Square) System.out.println(Encumbrance() + " mq");
        else System.out.println(Encumbrance() + " mc");
    }
}
