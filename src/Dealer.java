public class Dealer {
    public int Cardtotal;
    Dealer [] Cards = new Dealer[Cardtotal];
    public Card[] cards;
    public int Cardss;
    public boolean isOver17;
    public Dealer(){
        Cardtotal = 2;
        isOver17 = false;
        Cardss = 1;
    }
    public void printInfo(){
        System.out.println(Cardtotal);
        System.out.println(isOver17);
        System.out.println(Cardss);
    }
}
