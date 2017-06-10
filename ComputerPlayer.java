/** ComputerPlayer modelon nje lojtar per lojen 21 te kontrolluar nga kompjuteri.*/
public class ComputerPlayer
{  private int score; // mban shtegun e vlerave te te gjitha kartave ne dore.
   private int handSize; // sa karta jane ne dore
   private String cardsName = ""; // emri i kartes
   CardDeck a = new CardDeck(); // krijon nje instance te klases CardDeck
   Card[] hand = new Card[4 * Card.SIZE_OF_ONE_SUIT]; // krijon nje grup prej 52 kartash
/** Konstuktori ComputerPlayer krijon nje lojtar te kompjuterizuar per lojen 21 */
   public ComputerPlayer()
   {  
      while ( handSize < 2 )
      {
         hand[handSize] = a.newCard();
         score = score + hand[handSize].getCount();
         cardsName = cardsName + " " + hand[handSize].getName() + " of " + hand[handSize].getSuit() + "  ";
         handSize++;
      }
      while ( score <= 16 )
      {
         handSize++;
         hand[handSize] = a.newCard();
         score = score + hand[handSize].getCount();
         cardsName = cardsName + " " + hand[handSize].getName() + " of " + hand[handSize].getSuit() + "  ";
      }
   }
/** getName kthen vleren e kartave si String. */
   public String getName()
   { 
      return cardsName;}

/** getScore kthen piket e te gjitha kartave ne doren e lojtarit. */   
   public int getScore()
   { 
      return score;}
}