public class Uppgift_13_6_Kort {
    public static void main(String[] args) {

        Card c1 = new Card(); // instanser
        c1.suit = Card.SPADES; // Färg
        c1.rank = Card.Queen; // Dam // Valör

        Card.print(c1);

        System.out.println("---Kort 1 ---");

        System.out.println(c1); // Hashkod
        System.out.println(c1.rank + " of " + c1.suit);
        System.out.println(Card.ranks[c1.rank] + " of " + Card.suits[c1.suit] );

        Card c2 = new Card();// instanser
        c2.suit = Card.CLUBS; // Klöver
        c2.rank = 7;

        System.out.println("---Kort 2----");

        Card.print(c2);

    }
}
