public class BASICGAMEAPP {
    public Player p;
    public Dealer d;
    public Card [] deck;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        new BASICGAMEAPP();

    }
    public BASICGAMEAPP(){
        deck = new Card[13];
        System.out.println("Welcome to Sammy's casino");
        for(int all = 0; all < 4; all++){
            for(int x=0; x<deck.length; x++){
                Card c = new Card(x+1, all);

                deck[x] = c;
                c.print();

            }
        }



    }
}