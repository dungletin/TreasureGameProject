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
 */
/**

 *  |-----------------------------------------------------------|

 *  |                          EmptyButtonListener              |

 *  |-----------------------------------------------------------|

 *  |      Responsibilities         |   Collaborating Classes   |

 *  |-------------------------------+---------------------------|

 *  |     disable button when       |                           |
 *  
 *  |     it's clicked              |                           |

 *  |     of the buttons            |     EmptyButtonListener   |

 *  |                               |     TreasureButton        |

 *  |     Shows text when clicked   |                            |
   
 *  |                               |        TreasureGame       |

 *  | update game when found nothing|       TrollButton          |

 *  |-------------------------------+---------------------------|

 */
public class EmptyButtonListener implements ActionListener
{
    private EmptyButton button;//has a button
    private Game game;//has a game
    //constructor
    public EmptyButtonListener(EmptyButton button, Game game)
    {
        this.button = button;
        this.game = game;
    }
    
    public void actionPerformed(ActionEvent e)
    {
        button.updateButton();
        game.foundNothing();
    }
}
