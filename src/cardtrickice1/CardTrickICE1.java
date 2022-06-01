/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardtrickice1;
import java.util.*;
/** step1 : generate 7 random cards and store in array - how
 * step 2: take any card input from user suit,number
 * step 3: user card is in  the array 'card is found
 *
 * @author sivagamasrinivasan,May 23rd
 */
public class CardTrickICE1 {
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
         String s ="";
        Card[] magicHand = new Card[7]; //Array of object
        for( int i=0;i<magicHand.length;i++)
        {
            Card c1 = new Card();
            int x = rd.nextInt(13)+1;//use a method to generate random *13
            c1.setValue(x);
            int num1 = rd.nextInt(4);
            String suit = c1.SUITS[num1];
            c1.setSuits(suit);//random method suit
            magicHand[i] = c1;
        }
        for(int i = 0;i<magicHand.length;i++){
            System.out.println(magicHand[i].getValue()+" of "
                    +magicHand[i].getSuits());
        }
        
        //step 2:take input 
        
        System.out.println("PLEASE CHOOSE THE SUIT");
        System.out.println("1. Hearts\n2. Diamonds\n3. Spades\n4. Clubs");
        int num = sc.nextInt();
       
        switch (num){
            case 1:{
            s = "hearts";
            break;
            }
            case 2:{
            s = "diamonds";
            break;
            }
            case 3:{
            s = "spades";
            break;
            }
            case 4:{
            s = "clubs";
            break;
            }
            default:{
            System.out.println("Invalid Value");
            }
        }
        
        System.out.println("Please choose the value(1 to 13)");
        int n = sc.nextInt();
        if(!(n>0 && n<14))
            System.out.println("Invalid Value");
        
        
        //step 3: match with array 
         int result =0; 
        
        for(int i = 0; i<magicHand.length;i++){
            if(n == magicHand[i].getValue() && 
                   s.equals(magicHand[i].getSuits()))
            {
                 result = 1; 
            }
        }
        if( result ==1){
            System.out.println("You have a magichand");
        }
        else
        {
            System.out.println("Sorry,no match found");
        }
        Card luckyCard = new Card();
        luckyCard.setValue(4);
        luckyCard.setSuits("hearts");
    }    
}
