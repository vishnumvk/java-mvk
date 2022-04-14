package exercises;

import java.util.*;

public class Cardsrandom {
public static void main (String[] args) {
    //Scanner input = new Scanner (System.in);
    String suits[] = {"Hearts","Diamonds","Clubs","Spadse"};
    String cards[] = {"2","3","4","5","6","7","8","9","10","Joker","Queen","King","Ace"};
    Random random = new Random (0);
    
    for(int i=0;i<10;i++)
    System.out.println (cards[random.nextInt(13)] +" of "+ suits[random.nextInt(4)] );
	}}