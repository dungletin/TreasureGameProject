import javax.swing.JMenuItem;
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
/**

 *  |-----------------------------------------------------------|

 *  |                          ExitItemListener                 |

 *  |-----------------------------------------------------------|

 *  |      Responsibilities         |   Collaborating Classes   |

 *  |-------------------------------+---------------------------|

 *  |                               |                           |  
  
 *  |                               |                           |

 *  |    exit when clicked          |                           |
 *  
 *  |       on exit item            |                           |

 *  |                               |                           |

 *  |                               |        TreasureGame       |
  
 *  |                               |                           |       
 *  
 *  |                               |                           |           

 *  |                               |                           |

 *  |-------------------------------+---------------------------|

 */
public class ExitItemListener implements ActionListener
{
    private JMenuItem exitItem;
    public ExitItemListener(JMenuItem exitItem)
    {
        this.exitItem = exitItem;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        System.exit(0);//exit
    }
}
