package com.davegreen;

import java.awt.*;
import javax.swing.*;

public class MyForthDrawPanel extends  JPanel
{
    public MyForthDrawPanel()
    {
    
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        
        int red = (int) (Math.random() * 256);                                      // This method and class is much the same as the MyThirdDrawPanel class except we are using
        int blue = (int) (Math.random() * 256);                                     // what we learned in the MySecondDrawPanel class with respect to creating random RGB values
        int green = (int) (Math.random() * 256);                                    // and inserting them to allow us to create our gradient filled oval.
        Color startingColor = new Color(red, blue, green);
        
        red = (int) (Math.random() * 256);
        blue = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        Color endColor = new Color(red, blue, green);
        
        GradientPaint gradientPaint = new GradientPaint(70, 70, startingColor, 150, 150, endColor);
        
        g2d.setPaint(gradientPaint);
        
        g2d.fillOval(70, 70, 100, 100);
    }
}
