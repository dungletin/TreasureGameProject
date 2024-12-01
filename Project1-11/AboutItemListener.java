import java.awt.event.ActionListener;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;

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

 *  |                          AboutWindowListener              |

 *  |-----------------------------------------------------------|

 *  |      Responsibilities         |   Collaborating Classes   |

 *  |-------------------------------+---------------------------|

 *  |                               |                           |  
  
 *  |                               |                           |

 *  |  open new window when         |                           |

 *  |  click on about item          |         AboutWindow       |

 *  |                               |        TreasureGame       |
  
 *  |                               |                           |       
 *  
 *  |                               |                           |           

 *  |                               |                           |

 *  |-------------------------------+---------------------------|

 */
public class AboutItemListener implements ActionListener
{
    private JMenuItem aboutItem;
    public AboutItemListener(JMenuItem aboutItem)
    {
        this.aboutItem = aboutItem;
    }
    //create another window when hit the about item
    public void actionPerformed(ActionEvent e)
    {
        AboutWindow myWindow = new AboutWindow();//call new window
    }
}
