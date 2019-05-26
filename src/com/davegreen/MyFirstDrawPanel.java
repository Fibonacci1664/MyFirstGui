package com.davegreen;

import java.awt.*;
import javax.swing.*;

public class MyFirstDrawPanel extends JPanel
{
    public MyFirstDrawPanel()
    {
    
    }
    
    public void paintComponent(Graphics g)                      // This declares the VERY IMPORTANT Graphics class which is abstract, therefore we can never call it directly, but instead
    {
        super.paintComponent(g);                                // the system calls it for us and gives us a nice blank canvas each time we do
    
        g.setColor(Color.blue);                                 // Here we define what colour we want to paint.
        
        g.fillRect(20, 50, 100, 100);           // Here we define what shape is to be created, fillRect, then we define where this shape is to be set and how big it is.
    }
}
