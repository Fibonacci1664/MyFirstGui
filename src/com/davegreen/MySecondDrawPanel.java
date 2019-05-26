package com.davegreen;

import java.awt.*;
import javax.swing.*;

public class MySecondDrawPanel extends JPanel
{
    public MySecondDrawPanel()
    {
    
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        g.fillRect(20, 20, 542, 515);                // While we present the ILLUSION of having created a black content pane, this is simply not the case, we have
                                                                      // as always the blank white canvas of the content pane, on which we create by way of the paintComponent method
                                                                        // a black rectangle shape that starts at the 0, 0, x, y, position, i.e. the upper left most corner, and we
                                                                        // then tell it to paint it the same width and the same height as the content pane, we can see if we play
                                                                        // with the number that the original white content pane is still UNDERNEATH the newly created black rectangle
                                                                        // that now fills the content pane.
        
        int red = (int) (Math.random() * 256);                          // Here we create 3 random values on an RGB scale 0 - 256.
        int blue = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        
        Color randomColor = new Color(red, blue, green);                // Here we create a new color object and set it to the new random colors.
        g.setColor(randomColor);
        g.fillOval(70, 70, 100, 100);                   // Here we then fill an oval at the x, y, co-ordinates (first two arguments), then we define the size of the
                                                                         // oval (last two arguments).
    }
}
