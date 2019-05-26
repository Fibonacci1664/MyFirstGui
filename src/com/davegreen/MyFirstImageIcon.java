package com.davegreen;

import java.awt.*;
import javax.swing.*;

public class MyFirstImageIcon extends JPanel
{
    public MyFirstImageIcon()
    {
    
    }
    
    @Override
    protected void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Image image = new ImageIcon("images/mushroom.jpg", "A very large mushroom cloud.").getImage();     // Remember the first argument can just be the file name IF the image
                                                                                                                // is place in the correct folder, that of the INITIAL folder after
                                                                                                                // opening up the individual project folder, i.e., the folder that
                                                                                                                // contains:
                                                                                                                // * .idea, * out, * src (folders) & a .iml file
                                                                                                                // this is the first place that the IDE system looks, however just
                                                                                                                // storing lots of image in this folder (if it were a larger project)
                                                                                                                // would be unprofessional and untidy, so in order to achieve the
                                                                                                                // shortest file path possible i created a images folder in this folder
                                                                                                                // and all images would be contained in this folder, as per the file path
                                                                                                                // naming above, the description is similar to that of HTML, it is there
                                                                                                                // to help facilitate screen readers for people who may have poor sight, and
                                                                                                                // so is there to provide a accurate description of what the image is portraying.
        
        g.drawImage(image, 0, 0, this);
    }
}