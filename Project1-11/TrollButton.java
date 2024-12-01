import java.awt.*;

import javax.swing.ImageIcon;

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

 *  |                          TrollButton                      |

 *  |-----------------------------------------------------------|

 *  |      Responsibilities         |   Collaborating Classes   |

 *  |-------------------------------+---------------------------|

 *  |     Hold the text "Troll" as  |                           |

 *  |     a troll button            |     TrollButtonListener   |

 *  |                               |       TreasureButton      |

 *  |     get the text when button  |           TreasureGame    |

 *  |       is clicked              |                           |

 *  |-------------------------------+---------------------------|

 */
public class TrollButton extends EmptyButton
{
    private final String defaultText = "Troll";
    private final ImageIcon icon = new ImageIcon("troll.png");
    private Game game;

    public TrollButton(Game game)
    {
        addActionListener(new TrollButtonListener(this, game));
    }
    
    public void updateButton()
    {
        setEnabled(false);
        setIcon(icon);
        //setBackground(Color.RED);
    }
    
    public String getDefaultText()
    {
        return defaultText;
    }
    
}
