/** Blackjack eshte klasa kontrolluese e lojes 21 (gjithashtu e njohur si BLACKJACK) */
import javax.swing.*;
public class Blackjack
{ 
   public static void main(String [] args)
   { 
      Player p = new Player();
      ComputerPlayer cp = new ComputerPlayer();
      int b = p.getScore();
      int c = cp.getScore();
      String pSuit = p.getName();
      String cpSuit = cp.getName();
      
     
    if ( b == 21 && c != 21 )
     { JOptionPane.showMessageDialog(null, "BLACKJACK -- Congratulations " + ", you won automatically by scoring " + b + " points ");}
      else { 
         JOptionPane.showMessageDialog(null, "You have " + b + " points" + "\nPlayer 2 has " + c + " points");
         if ( b > c && b <= 21 )
         { JOptionPane.showMessageDialog(null, "Congratulations " +  ", you won by scoring " + b + " points");}
         else { 
            if ( c <= 21 && c != b) 
            { JOptionPane.showMessageDialog(null, "The winner is Player 2 with " + c + " points");}
            else { 
               if ( c == b && c <= 21 && b <= 21)
               JOptionPane.showMessageDialog(null, "We have a draw " + b + "--" + c);
               else  {
                  if ( b > 21 && c > 21) 
                  JOptionPane.showMessageDialog(null, "Both players have exceeded 21 points " + b + "--" + c);
                      else {
                       JOptionPane.showMessageDialog(null, "Congratulations " +  ", you won by scoring " + b + " points");
               }
             }
           }
         }
       }
     }
   }  