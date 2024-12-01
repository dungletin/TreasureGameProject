import java.awt.event.*;

/**
 *  Student Name : Tien Dung Le
 *  Student ID: 0005752876
 *  
 *  
 *  References:
 *  Gaddis, T. (2015). Starting Out With Java Myprogramming Lab 
 *  From Control Structures Through Objects. (6th ed.). Addison-Wesley. 
 *  Java GUI: Full Course ☕ (FREE). (n.d.). YouTube. 
 *        https://www.youtube.com/watch?v=Kmgo00avvEw&t=1131s 
 *  Font List : Font « 2D Graphics GUI « Java
 *        http://www.java2s.com/Code/Java/2D-Graphics-GUI/FontList.htm
 *  Java Button size with code examples. (n.d.). Programming and Tools Blog. 
 *        https://www.folkstalk.com/tech/java-button-size-with-code-examples/ 
 *  Scary text effect. (2022, January 26). InkPx. 
 *        https://inkpx.com/templates/w56/scary-text-effect
 *  Treasure chest free icons designed by Freepik. (n.d.). Flaticon. 
 *        https://www.flaticon.com/free-icon/treasure-chest_4230567
 *  Troll free icons designed by Smashicons. (n.d.). Flaticon. 
 *        https://www.flaticon.com/free-icon/troll_1137131

 */
public class TreasureButtonListener implements ActionListener
{
    private EmptyButton button;//has a button
    private Game game;//has a game
    //constructor
    public TreasureButtonListener(EmptyButton button, Game game)
    {
        this.button = button;
        this.game = game;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        button.updateButton();
        game.foundTreasure(button.getButtonPoint());
    }
}
