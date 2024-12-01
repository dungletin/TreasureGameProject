import javax.swing.*;

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

 *  |                          AboutWindow                      |

 *  |-----------------------------------------------------------|

 *  |      Responsibilities         |   Collaborating Classes   |

 *  |-------------------------------+---------------------------|

 *  |                               |                           |  
  
 *  |        new window             |                           |
  
 *  |     give information          |       AboutWindowListener |

 *  |                               |                           |

 *  |                               |        TreasureGame       |         

 *  |                               |                           |

 *  |-------------------------------+---------------------------|

 */

public class AboutWindow extends JFrame
{
    private JPanel panel;
    private JLabel name;
    private JLabel ID;
    //window for the about item
    public AboutWindow()
    {
        //create student name and ID label
        name = new JLabel("Student Name: Tien Dung Le");
        ID = new JLabel ("ID: 0005752876");
        //set location and size
        name.setBounds(30, -20, 400, 100);
        ID.setBounds(30, 20, 400, 100);
        panel = new JPanel();
        panel.add(name);
        panel.add(ID);
        panel.setLayout(null);
        add(panel); //add panel to frame
        setSize(230, 150);//set size for frame
        setResizable(false);//unresizable
        setVisible(true);
        System.out.println();
    }
    
    
}
