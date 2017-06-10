/** Player modelon nje lojtar per lojen 21 te kontrolluar nga nje shfrytezues njeri */
import javax.swing.*;
public class Player
{ 
   private int score; // mban shtegun e vlerave te te gjitha kartave ne doren e lojtarit
   private int handSize; // sa karta jane ne duar
   private String cardsName = ""; // emri i kartes
   private String username;
   private int cardScore;
   CardDeck a = new CardDeck(); // krijon nje instance te klases CardDeck
   Card[] hand = new Card[4 * Card.SIZE_OF_ONE_SUIT]; // krijon nje varg prej 52 kartash
   /**Konstruktori Player krijon nje lojtar per lojen 21 te kontrolluar nga nje shfytezues njeri. */
   public Player()
   {  username = JOptionPane.showInputDialog("Please enter your name");
      while ( handSize < 2 )
      {
         hand[handSize] = a.newCard();
         cardScore = hand[handSize].getNumber();
         score = score + hand[handSize].getCount();
    
         cardsName = cardsName + " " + hand[handSize].getName() + " of " + hand[handSize].getSuit() + "  ";
         handSize++;
      }
      while ( score < 21 )
      {
         String input = JOptionPane.showInputDialog(cardsName + " = " + score + "\nPress OK to ask for another card, otherwise press cancel");
         if ( input == null ){ 
            break ;}
         else { handSize++;
            hand[handSize] = a.newCard();
            cardScore = hand[handSize].getNumber();
            score = score + hand[handSize].getCount();
     
            cardsName = cardsName + " " + hand[handSize].getName() + " of " + hand[handSize].getSuit() + "  ";
         }
      }
   }
/** getName kthen vleren e kartave si String.  */
   public String getName()
   { 
      return cardsName;} 
   
/** getScore kthen piket e te gjitha kartave ne duart e lojtarit. */   
   public int getScore()
   { 
      return score;}
   
/** getUsersName kthen emrin e shfrytezuesit.  */
   public String getUsersName()
   { 
      return username.trim();}
}