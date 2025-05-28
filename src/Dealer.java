public class Dealer {
    public int cardtotal;
    Dealer [] Cards = new Dealer[cardtotal];
    public Card[] cards;
    public boolean isOver17;
    public Dealer(){
        cards = new Card[2];
        cardtotal = 2;
        isOver17 = false;
    }
    public void print(){
        System.out.println("card total: " + cardtotal);
        for(int x = 0; x<cards.length; x++){
            cards[x].print();
        }
    }
}
