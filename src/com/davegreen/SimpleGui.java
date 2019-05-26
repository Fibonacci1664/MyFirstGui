package com.davegreen;

import javax.swing.*;                                                           // Import the required package for GUI.
import java.awt.*;                                                              // Import the graphics package.
import java.awt.event.*;                                                        // Import the required package to allow for communication between "listener" and "event source".

public class SimpleGui implements ActionListener                                // Ensure we implement the ActionListener interface, again this is to facilitate the communications
{                                                                               // between "listener" and "event source".
    private JFrame frame;                                                       // Create a frame.
    private JButton button;                                                     // Create a button.
    private JCheckBox checkBox;
    private JRadioButton radioButton;
    
    public SimpleGui()
    {
        this.frame = new JFrame();                                              // Instantiate the frame.
        this.button = new JButton("This is a button");                      // Instantiate the button with the viewable text as is.
        this.checkBox = new JCheckBox("This is a check box.");
        this.radioButton = new JRadioButton("This is a radio button.");
    }
    
    public void myFirstGui()
    {
        button.addActionListener(this);                                      // Register my interest with the button, i will essentially be added to the buttons list of listeners.
                                                                               // The argument that is passed MUST be an object from a class that implements or is implementing the
                                                                                // ActionListener interface.
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                  // This ensures that the program quits if the window is closed.
        
        frame.getContentPane().add(button);                                    // Here we are adding the button to the ContentPane, think of the frame as a literal window frame, you
                                                                               // cannot add things to a frame, but the frame is what holds the ContentPane and you can add things to
                                                                               // the ContentPane.
        
        frame.getContentPane().add(checkBox);
        frame.getContentPane().add(radioButton);
        
        MyFirstDrawPanel myFirstDrawPanel = new MyFirstDrawPanel();
        
        frame.getContentPane().add(myFirstDrawPanel);                           // Here we are adding A DRAWING PANEL to the frame, although not explicitly called the paintComponent method
                                                                                // within the myFirstDrawPanel class runs "On-Demand" when it recognises that something needs to be drawn/re-drawn.
        
        MyFirstImageIcon myFirstImageIcon = new MyFirstImageIcon();

        frame.getContentPane().add(myFirstImageIcon);

        MySecondDrawPanel mySecondDrawPanel = new MySecondDrawPanel();

        frame.getContentPane().add(mySecondDrawPanel);
//
//        MyThirdDrawPanel myThirdDrawPanel = new MyThirdDrawPanel();
//
//        frame.getContentPane().add(myThirdDrawPanel);
//
//        MyForthDrawPanel myForthDrawPanel = new MyForthDrawPanel();
//
//        frame.getContentPane().add(myForthDrawPanel);
        
        
        
        
        
        frame.setSize(600, 647);                                    // Here we define the height and width of the frame, which remember contains the content pane.
                                                                                // The height of the windows upper frame that the close, minimize and restore icons sit in is 47px
                                                                                // high, so if you actually wanted a content pane that was 600px high you would need to account for
                                                                                // this by accommodating for the 47px, i.e., a 600px content pane would need to be set to 647px high
                                                                                // when setting the frame size, although i must note even taking the upper frame out of the equation
                                                                                // the content pane doesn't look exactly square nor does it measure square with a conventional ruler
                                                                                // on screen, it is 1/8th taller than it is wider.
        
        frame.setVisible(true);                                                 // Here we are ensuring that we make the newly created frame visible.
    }
    
    @Override
    public void actionPerformed(ActionEvent e)                                  // This is the actual event handling method and as can be seen is directly inherited from the Action
    {                                                                           // Listeners interface as can be seen due to the fact we are required to override the method, when an
        button.setText("You just got some free money!");                        // event happens, e.g. a mouse click, the button calls this method letting us know an event has happened
    }                                                                           // and in turn sending us an ActionEvent object as the argument as can be seen in the parenthesis, think
                                                                                // of it a lot like exceptions being thrown and caught only this time the button SENDS us and action event
                                                                                // calling the relevant method and we GET the event as an object.
}
