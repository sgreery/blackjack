public class BASICGAMEAPP {
    public Player p;
    public Dealer d;
    public Card [] deck;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new BASICGAMEAPP();

    }
    public BASICGAMEAPP(){
        deck = new Card[52];
        System.out.println("Welcome to Sammy's casino");
        int counter = 0;
        for(int all = 0; all < 4; all++){
            for(int x=0; x<13; x++){
                Card c = new Card(x+1, all);

                deck[counter] = c;
//                c.print();

                deck[counter].print();
                counter++;
            }
        }
        System.out.println("*");
        printDeck();

        System.out.println("players info");
        p = new Player();
        //todo: add the card at index 0 of deck to the player cards at index 0
       p.cards[0] = deck[(int)(Math.random()*52)-1];
       p.cards[1] = deck[(int)(Math.random()*52)-1];
        p.print();


        System.out.println("dealers info");
        d = new Dealer();
        d.cards[0] = deck[(int)(Math.random()*52)-1];
        d.cards[1] = deck[(int)(Math.random()*52)-1];
        d.print();




    }
    public void printDeck(){
        for(int x=0; x<deck.length; x++){
            System.out.println(x);
            deck[x].print();
        }

    }
}