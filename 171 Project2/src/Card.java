public class Card {
    String suit;
    int rank;
    public Card(String suit, int rank) {
        this.suit=suit;
        this.rank=rank;
    }

    public String toString() {
        return suit+" "+rank;
    }
}
