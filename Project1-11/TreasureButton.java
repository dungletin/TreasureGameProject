import java.awt.*;
import javax.swing.ImageIcon;
import java.util.Random;

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
 */

/**

 *  |-----------------------------------------------------------|

 *  |                          TreasureButton                   |

 *  |-----------------------------------------------------------|

 *  |      Responsibilities         |   Collaborating Classes   |

 *  |-------------------------------+---------------------------|

 *  |     Hold the text "$" as      |                           |

 *  |     a troll button            |     TreasureButtonListener|

 *  |                               |       TreasureButton      |

 *  |     has a getter for the text |        TreasureGame       |

 *  |                               |                           |

 *  |-------------------------------+---------------------------|

 */
public class TreasureButton extends EmptyButton
{
    private final String defaultText = "$";
    private final ImageIcon icon = new ImageIcon("treasure.png");
    private Game game;
    private int buttonPoint;
    
    public TreasureButton(Game game)
    {
        addActionListener(new TreasureButtonListener(this, game));
        Random random = new Random();
        buttonPoint = random.nextInt(3) + 1;
    }
    
    public void updateButton()
    {
        setEnabled(false);
        setIcon(icon);
        setBackground(Color.GRAY);
    }

    public String getDefaultText()
    {
        return defaultText;
    }
    
    public int getButtonPoint()
    {
        return buttonPoint;
    }
}
