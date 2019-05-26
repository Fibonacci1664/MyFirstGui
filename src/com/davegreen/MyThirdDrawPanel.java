package com.davegreen;

import java.awt.*;
import javax.swing.*;

public class MyThirdDrawPanel extends JPanel
{
    public MyThirdDrawPanel()
    {
    
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        GradientPaint gradientPaint = new GradientPaint(70, 70, Color.blue, 150, 150, Color.orange);      // The first set of co-ords are the starting point for the
                                                                                                                        // gradient, then the starting color, then the ending
                                                                                                                        // co-ords, then the ending color.
        
        g2d.setPaint(gradientPaint);                                                                                    // This sets the virtual paintbrush to a gradient instead
                                                                                                                        // of a solid color.
        
        g2d.fillOval(70, 70, 100, 100);
    }
}
