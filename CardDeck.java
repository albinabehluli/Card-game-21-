/** CardDeck modelon nje tube kartash. */
public class CardDeck
{
   private int card_count; // sa karta jane mbetur ne tube
   private Card[] deck = new Card[4 * Card.SIZE_OF_ONE_SUIT];
// konstante: elementet deck[0]..deck[card_count - 1]mban kartat 
/** Konstruktori CardDeck krijon nje tube kartash me te gjitha kartat e tij. */
   public CardDeck()
   { createSuit(Card.SPADES);
      createSuit(Card.HEARTS);
      createSuit(Card.CLUBS);
      createSuit(Card.DIAMONDS);
   }
/** newCard merr nje karte te re nga tuba
* @kthen nje karte jo te perdorur mepare, ose kthen null, nese nuk kane mbetur me karta */
   public Card newCard()
   { Card next_card = null;
      if ( card_count == 0 )
      { System.out.println("CardDeck error: no more cards"); }
      else { int index = (int)(Math.random() * card_count); // zgjedhje e rastesishme
         next_card = deck[index];
      // sapo karta te nxirret nga tuba, zhvendos kartat e tjera me mbush zbrastiren
         for ( int i = index+1; i != card_count; i = i + 1 )
         // Deri me tani, kartat nga index+1 te i-1 jane zhvendosur ne te majte 
         // ne grup nga nje pozicion
         { deck[i - 1] = deck[i]; }
         card_count = card_count - 1;
      }
      return next_card;
   }
/** moreCards tregon nese tuba ka me shume karta per te dhene.
* @kthen nese tuba eshte jo e zbrazet*/
   public boolean moreCards()
   { 
      return (card_count > 0); }
/** createSuit krijon llojin e kartave per nje tube te re. */
   private void createSuit(String which_suit)
   { 
      for ( int i = 1; i <= Card.SIZE_OF_ONE_SUIT; i = i + 1 )
      { deck[card_count] = new Card(which_suit, i);
         card_count = card_count + 1;
      }
   }
}