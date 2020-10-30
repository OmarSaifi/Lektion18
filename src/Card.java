public class Card {

// Clubs = Klöver ()
// DIAMONDS = Ruter ()
// HEARTS = Hjärter ()
// SPADES = Spader ()

    // Konstanter = Klassvariabler
    public static final int CLUBS = 0;
    public static final int DIAMONDS = 1;
    public static final int HEARTS = 2;
    public static final int SPADES = 3;

    // Instansvariabler / Egenskaper / Attribut
    public int suit; // Färg - Använder konstanterna
    public int rank; // Valör - Heltal mellan 1 och 13
    // 0      1    2    3    4    5    6    7    8    9    10  11  12
    // null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"
    public static final String[] ranks = {null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public static final String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};



    // Flera konstanter
    public static final int Jack = 11;
    public static final int Queen = 12;
    public static final int King = 13;

    public static void print(Card c1) {
    }
}





