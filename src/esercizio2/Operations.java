package esercizio2;

import java.util.Scanner;

public class Operations {

    public static void main(String[] args) {

        Collection collection = new Collection("MOMA", "New York", 2);

        Square square1 = new Square("Notte Stellata", "Vincent van Gogh", 74, 92);
        Sculpture sculpture1 = new Sculpture("Forme uniche della continuità nello spazio", "Umberto Boccioni", 111, 88, 22);

        collection.ìnsert(square1);
        collection.ìnsert(sculpture1);

        System.out.println(collection);

        collection.getArtWorkFromI(0).printEncumbrance();
        collection.getArtWorkFromI(1).printEncumbrance();

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il titolo dell opera di cui vuoi conoscere i dettagli");
        System.out.println(collection.getArtWorkFromTitle(input.nextLine()));
    }
}
