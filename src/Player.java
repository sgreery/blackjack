public class Player {
    public int cardTotal;
    public boolean isHit;
    public Card[] cards;
    public int Cards;
    Player [] cardsArray = new Player[cardTotal];
    public Player(){
        cardTotal = 3;
        isHit = true;
        cards = new Card[2];

    }
    public void print(){
        System.out.println("card total: " + cardTotal);
        for(int x = 0; x<cards.length; x++){
            cards[x].print();

        }
    }

}
