public class Card {
    public String number; //example: ace, two, king
    public String suit;
    public boolean isEleven;
    public int value;
    public Card(int pnumber, int psuit){

        number = "Ace";
        suit = "Spades";
        isEleven = true;
        value = 11;
        if(psuit==2){
            suit = "hearts";
        }
        if(pnumber == 13){
            number = "King";
            value = 10;
        }
    }
    public void print(){
        System.out.println("The card is a(n) " + number + " of " + suit + " and it is " + isEleven + " that it is eleven. The value is " + value);
    }
}
