package esercizio2;

public class Collection {

    private String name;
    private String place;
    private ArtWork T[];

    public Collection(String name, String place, int dimension) {
        this.name = name;
        this.place = place;
        T = new ArtWork[dimension];
    }

    public void ìnsert(ArtWork opera) {
        for (int i = 0; i < T.length; i++)
            if (T[i] == null) {
                T[i] = opera;
                break;
            }
    }

    public ArtWork getArtWorkFromTitle(String title) {
        for (ArtWork opera : T)
            if ((opera.title.equals(title))) {
                return opera;
            }
        return null;
    }

    public ArtWork getArtWorkFromI(int i) {
        return T[i];
    }

    public String toString() {
        String st = "nome:" + name + "luogo:" + place + "\n";
        for (ArtWork opera : T) if (opera != null) st += opera + "\n";
        return st;
    }
}
