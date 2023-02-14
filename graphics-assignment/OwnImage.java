
import java.io.*;
import java.awt.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

class OwnImage{

    public OwnImage(){
        try{
        BufferedImage img = new BufferedImage(380,290,BufferedImage.TYPE_INT_RGB);
        Graphics g = img.createGraphics();
        g.setColor(Color.GREEN);
        g.drawString("Isha Hitang | A software engineering Student | ", 60, 140);
        g.dispose(); // it releases all system resources

        File outfile = new File("mydrawing.gif");
        ImageIO.write(img,"gif",outfile);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
  public static void main(String[] args) {
    new OwnImage();
  }  
}