import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
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
 *  Scary text effect. (2022, January 26). InkPx. 
 *        https://inkpx.com/templates/w56/scary-text-effect
 *  Treasure chest free icons designed by Freepik. (n.d.). Flaticon. 
 *        https://www.flaticon.com/free-icon/treasure-chest_4230567
 *  Troll free icons designed by Smashicons. (n.d.). Flaticon. 
 *        https://www.flaticon.com/free-icon/troll_1137131

 */

/**

 *  |-----------------------------------------------------------|

 *  |                          Game                             |

 *  |-----------------------------------------------------------|

 *  |      Responsibilities         |   Collaborating Classes   |

 *  |-------------------------------+---------------------------|

 *  |     
   
 *  | create panels and add         |                           |

 *  |   to the frame                |                           |
 
 *  |update when found treasure     |       all the classes     |

 *  |     update when found nothing |                           |

 *  |      update when lose         |                           | 

 *  |     update when win 
 *  | update game when found a troll|                           |

 *  |         end the game          |                           |

 *  |     
  
 *  |-------------------------------+---------------------------|

 */
public class Game extends JFrame
{
    private JPanel buttonPanel;
    private JPanel statPanel;
    private JPanel plainPanel;
    private JPanel titlePanel;
    private JPanel movePanel;
    private EmptyButton[] buttons;
    private int treasuresLeft;
    private int treasuresFound;
    private int triesLeft;
    private JLabel treasuresLeftLabel;
    private JLabel treasuresFoundLabel;
    private JLabel triesLeftLabel;
    private JLabel moveLabel;
    private JLabel titleLabel;
    private ImageIcon titleIcon;
    private int point;
    private JLabel pointLabel;
    private JMenuBar menu;
    private JMenu fileMenu;
    private JMenuItem exitItem;
    private JMenuItem aboutItem;
    private ImageIcon treasureIcon;
    private ImageIcon trollIcon;
    private ImageIcon nothingIcon;
    
    public Game()
    {
        //menu
        //menu
        menu = new JMenuBar();
        fileMenu = new JMenu("File");
        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(new ExitItemListener(exitItem));
        aboutItem = new JMenuItem("About");
        fileMenu.add(exitItem);
        fileMenu.add(aboutItem);
        aboutItem.addActionListener(new AboutItemListener(aboutItem));
        menu.add(fileMenu);
        
        
        
        // create buttonPanel
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5,5));//set layout of button panel
        buttons = new EmptyButton[25];//create array holds 25 buttons
        
        //using the add random method
        addRandomButtons(10, "Treasure");//add 10 Treasure buttons
        addRandomButtons(5, "Troll");//add 5 Troll buttons
        addButton();

        
    
        //stat panel
        statPanel = new JPanel();
        //set the stat
        treasuresLeft = 10;
        treasuresFound = 0;
        triesLeft = 20;
        point = 0;
        //create label of treasures and tries then set dimension and location
        treasuresLeftLabel = new JLabel();
        treasuresLeftLabel.setText("Treasures Left: " + treasuresLeft);
        treasuresLeftLabel.setFont(new Font("Monospaced", Font.BOLD,15));
        treasuresLeftLabel.setBounds(50,30, 200,100);
        treasuresFoundLabel = new JLabel();
        treasuresFoundLabel.setText("Treasures Found: " + treasuresFound);
        treasuresFoundLabel.setFont(new Font("Monospaced", Font.BOLD,15));
        treasuresFoundLabel.setBounds(50,80, 200,100);
        triesLeftLabel = new JLabel();
        triesLeftLabel.setText("Tries Left: " + triesLeft);
        triesLeftLabel.setFont(new Font("Monospaced", Font.BOLD,15));
        triesLeftLabel.setBounds(50,130, 200,100);
        //point label
        pointLabel = new JLabel();
        pointLabel.setText("Points: " + point);
        pointLabel.setFont(new Font("Monospaced", Font.BOLD,15));
        pointLabel.setBounds(50,180, 200,100);
        
        
        statPanel.setPreferredSize(new Dimension(300,300));
        statPanel.setLayout(null);
        //add all labels to stat panel
        statPanel.add(treasuresLeftLabel);
        statPanel.add(treasuresFoundLabel);
        statPanel.add(triesLeftLabel);
        statPanel.add(pointLabel);
        
        
        
        
        // create move panel
        movePanel = new JPanel();
        moveLabel = new JLabel();
        moveLabel.setText("Last Move: ");
        moveLabel.setFont(new Font("Monospaced", Font.BOLD,25));
        movePanel.add(moveLabel);
        moveLabel.setHorizontalAlignment(JLabel.CENTER);
        moveLabel.setPreferredSize(new Dimension(600, 100));
        
        
        
        
        //title panel
        titleIcon = new ImageIcon("title.png");
        titlePanel = new JPanel();
        titleLabel = new JLabel(titleIcon);
        titleLabel.setPreferredSize(new Dimension(600,120));
        //titleLabel.setFont(new Font("SamsSerif", Font.BOLD, 25));
        //titleLabel.setHorizontalAlignment(JLabel.CENTER);//set label to the center
        titlePanel.setLayout(new BorderLayout());
        titlePanel.add(titleLabel, BorderLayout.CENTER);
        titlePanel.add(menu,BorderLayout.NORTH);
        
        
        
        //plainPanel
        plainPanel = new JPanel();
        plainPanel.setPreferredSize(new Dimension(300,300));
        //image icon for right panel
        trollIcon = new ImageIcon("troll1.png");
        treasureIcon = new ImageIcon("treasure1.png");
        nothingIcon = new ImageIcon("nothing.png");
        
        
        
        //for the frame
        setTitle("The Treasure Hunt Game");
        setLayout(new BorderLayout());//set layout for the frame
        //add button panel and put in to the center
        add(buttonPanel, BorderLayout.CENTER);
        //add stat panel and set location
        add(statPanel, BorderLayout.LINE_START);
        //add plain panel and set location
        add(plainPanel, BorderLayout.LINE_END);
        //add move Panel and title and set location
        add(movePanel, BorderLayout.PAGE_END);
        add(titlePanel, BorderLayout.PAGE_START);
        
        
    }
    
    
    //method that randomly add button to random location using number of buttons and which button
    public void addRandomButtons(int numberOfButtons, String button)
    {
        for(int i = 0; i < numberOfButtons; i++)
        {
            int location = randomLocation();
            if(button.equals("Treasure"))
            {
                buttons[location] = new TreasureButton(this);
            }
            
            if(button.equals("Troll"))
            {
                buttons[location] = new TrollButton(this);
            }
        }
    }
    
    
    //method that random a location until location is empty
    public int randomLocation()
    {
        //genarate a random location
        Random random = new Random();
        int location = random.nextInt(25);
        while(buttons[location] != null)
        {
            location = random.nextInt(25);
        }
        return location;
    }
    
    //method that add emptybutton into a empty place in array
    //then add all button and listener into panel
    public void addButton()
    {
        //add empty buttons to the locations that are empty
        for(int i = 0; i < 25; i ++)
        {
            if(buttons[i] == null)
            {
                buttons[i] = new EmptyButton(this);
            }
        }
        
        //add all button to button panel
        for(EmptyButton i: buttons)
        {
            buttonPanel.add(i);
            //i.addActionListener(new EmptyButtonListener(i, this));
        }
    }
    
    //when found a treasure reduce number of tries left, reduce treasure left  1, add 1 to treasure found
    //update all the labels
    //check if win then end game end set label to win
    //add point to point and set the text for point label
    public void foundTreasure(int buttonPoint)
    {
        treasuresFound += 1;
        treasuresLeft -= 1;
        triesLeft -= 1;
        point += buttonPoint;
        treasuresLeftLabel.setText("Treasures Left: " + treasuresLeft);
        treasuresFoundLabel.setText("Treasures Found: " + treasuresFound);
        triesLeftLabel.setText("Tries Left: " + triesLeft);
        pointLabel.setText("Points: " + point);
        moveLabel.setText("Last move: Treasure + " + buttonPoint + " point");
        if(isWin())
        {
            endGame();
            moveLabel.setText("Game Over: You Win");
        }
    }
    
    //when found nothing reduce number of tries left 1
    //update triesleft, move label
    //check if lose then end game end set label to lose
    
    public void foundNothing()
    {
        triesLeft -= 1;
        triesLeftLabel.setText("Tries Left: " + triesLeft);
        pointLabel.setText("Points: " + point);
        moveLabel.setText("Last move: Nothing");
        if(isLose())
        {
            endGame();
            moveLabel.setText("Game Over: You Lose");
        }
    }
    //update when found a troll
    //update treasure found to 0
    //update treasure found label
    //update the number of tries
    //check if lose then end the game and set the label to lose
    //set point = 0
    //reset the text point label
    public void foundTroll()
    {
        treasuresFound = 0;
        triesLeft -= 1;
        point = 0;
        treasuresFoundLabel.setText("Treasures Found: " + treasuresFound);
        triesLeftLabel.setText("Tries left: " + triesLeft);
        moveLabel.setText("YOU STEP ON A TROLL");
        pointLabel.setText("Points: " + point);
        if(isLose())
        {
            endGame();
            moveLabel.setText("Game Over: You Lose");
        }
    }
    
    //check if user lose
    public boolean isLose()
    {
        return triesLeft < treasuresLeft || triesLeft == 0;
    }
    //check if user win
    public boolean isWin()
    {
        return treasuresLeft == 0;
    }
    //end game then disable all buttons and show all treasure buttons
    public void endGame()
    {
        disableButtons();
        showTreasureButtons();
        showTrollButtons();
    }
    
    //disable all buttons
    public void disableButtons()
    {
        for(EmptyButton i : buttons)
        {
            i.setEnabled(false);
        }
    }
    //show all button has the text "$"
    //change color to gray
    public void showTreasureButtons()
    {
        for(EmptyButton i : buttons)
        {
            if(i.getDefaultText().equals("$"))
            {
                i.updateButton();
            }
        }
    }
    
    //check if it's a troll button then show the text and change background color to red
    public void showTrollButtons()
    {
        for(EmptyButton i : buttons)
        {
            if(i.getDefaultText().equals("Troll"))
            {
                 i.updateButton();
            }
        }
    }

    
    //play the game
    public void play()
    {
        pack();
        setVisible(true);
    }
    
}
