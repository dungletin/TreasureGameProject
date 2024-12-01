import javax.swing.*;
import java.awt.*;

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

 *  |                          EmptyButton                      |

 *  |-----------------------------------------------------------|

 *  |      Responsibilities         |   Collaborating Classes   |

 *  |-------------------------------+---------------------------|

 *  |     holds the default text    |                           |

 *  |                               |     EmptyButtonListener   |

 *  |                               |       TreasureButton      |

 *  |     get the text              |        TreasureGame       |
  
 *  |                               |       TrollButton         |       
 *  
 *  |                               |                           |           

 *  |                               |                           |

 *  |-------------------------------+---------------------------|

 */

public class EmptyButton extends JButton
{
    private final String defaultText = "O";
    private Game game;
    private int buttonPoint;
    public EmptyButton()
    {
        setPreferredSize(new Dimension(80,80));//set dimension for buttons
        buttonPoint = 0;
    }
    
    public EmptyButton(Game game)
    {
        this();
        addActionListener(new EmptyButtonListener(this, game));
    }
    
    public void updateButton()
    {
        //setText(defaultText);
        setEnabled(false);
    }
    //get the default text
    public String getDefaultText()
    {
        return defaultText;
    }
    //get the point
    public int getButtonPoint()
    {
        return buttonPoint;
    }
}
