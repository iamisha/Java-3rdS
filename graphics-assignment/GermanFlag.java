
import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

class GermanFlag extends JFrame{
    public GermanFlag(){
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        final int x = 240;
        final int y = 150;
        final int width = 320;
        final int height = 80;

        // loop for the list of colors
        Color [] colors = {Color.BLACK,Color.RED,Color.YELLOW};

        for (int i = 0; i < 3; i++){
            g.setColor(colors[i]);
            g.fillRect(x,y+(i*height),width,height);
        }
    }
    public static void main(String [] args){
        new GermanFlag();
    }
}