/** Klasa Card modelon nje loje me karta */
public class Card
{ //definicione qe mund te perdoren me i pershkru vlerat e kartave:
   public static final String SPADES = "spades";
   public static final String HEARTS = "hearts";
   public static final String DIAMONDS = "diamonds";
   public static final String CLUBS = "clubs";
   
   public static final int ACE = 1;
   public static final int JACK = 11;
   public static final int QUEEN = 12;
   public static final int KING = 13;
   
   public static final int SIZE_OF_ONE_SUIT = 13; // sa karta jane ne nje lloj
// Keto jane atributete kartave:
   private String suit;
  
   private String cardsName;
   private int count;
   private int number;
/** Konstruktori Card percakton llojin dhe numrin.
* @param s - llojin
* @param c - numrin */
   public Card(String s, int c)
   { suit = s;
      count = c;
      if ( c == 1 )
      { 
         cardsName = "ACE";
         count = 11;
      }
      else { 
         if ( c == 11 )
         { 
            cardsName = "JACK";
            count = 10; 
         }
         else { 
            if ( c == 12)
            { 
               cardsName = "QUEEN";
               count = 10;
            }
            else { 
               if ( c == 13 )
               {
                  cardsName = "KING";
                  count = 10;
               }  
               else {
                  cardsName = String.valueOf(c);
                  count = c;
               }     
            }
         }
      }
   
   }
/** getSuit kthen llojin e kartave. */
   public String getSuit()
   { 
      return suit; }
/** getSuit kthen llojin e kartave. */

/** getCount kthen numrimin e kartave. */
   public int getCount()
   { 
      return count; }
/** getNumber kthen numrin e kartave. */
   public int getNumber()
   { 
      return number; }
/** getName kthen vleren e kartave si String. */
   public String getName()
   { 
      return cardsName; }
}