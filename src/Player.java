public class Player {
    public int cardTotal;
    public boolean isHit;
    public int Cards;
    Player [] cardsArray = new Player[cardTotal];
    public Player(){
        cardTotal = 3;
        isHit = true;
        Cards = 10;
    }
    public void printInfo(){
        System.out.println(cardTotal);
        System.out.println(isHit);
        System.out.println(Cards);
    }

}
