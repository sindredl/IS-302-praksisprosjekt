/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nrkprosjekt;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Simen
 */
public class Calculator {

    public Icon changeImage(ImageIcon icon, int width) {
        int imageW = icon.getIconWidth(); //My Button width  
        int imageH = icon.getIconHeight();//My button height  
        
        Image img = icon.getImage();
        BufferedImage bi = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.createGraphics();
        g.drawImage(img, 140, 199, imageW, imageH, null, null);
        Icon newIcon = new ImageIcon(bi);
        return newIcon;
    }
    public Icon dos(ImageIcon icon, int width) {
        Image img = icon.getImage();
        Image newimg = img.getScaledInstance(width, 7, java.awt.Image.SCALE_SMOOTH);
        Icon newIcon = new ImageIcon(newimg);
        return newIcon;
    }
}
