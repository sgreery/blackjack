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
        if(psuit==0){
            suit = "diamonds";
        }
        if(psuit==1){
            suit = "spades";
        }
        if(psuit==2){
            suit = "hearts";
        }
        if(psuit==3){
            suit = "clubs";
        }
        if(pnumber == 13){
            number = "King";
            value = 10;
        }
        if(pnumber == 12){
            number = "Queen";
            value = 10;
        }
        if(pnumber == 11){
            number = "Jack";
            value = 10;
        }
        if(pnumber == 10){
            number = "Ten";
            value = 10;
        }
        if(pnumber == 9){
            number = "Nine";
            value = 9;
        }
        if(pnumber == 8){
            number = "Eight";
            value = 8;
        }
        if(pnumber == 7){
            number = "Seven";
            value = 7;
        }
        if(pnumber == 6){
            number = "Six";
            value = 6;
        }
        if(pnumber == 5){
            number = "Five";
            value = 5;
        }
        if(pnumber == 4){
            number = "Four";
            value = 4;
        }
        if(pnumber == 3){
            number = "Three";
            value = 3;
        }
        if(pnumber == 2){
            number = "Two";
            value = 2;
        }
        if(pnumber == 1){
            number = "Ace";
            value = 11;
        }
    }
    public void print(){
        System.out.println("The card is a(n) " + number + " of " + suit + " and it is " + isEleven + " that it is eleven. The value is " + value);
    }
}
