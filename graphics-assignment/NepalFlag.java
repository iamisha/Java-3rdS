import javax.swing.*;
import java.awt.Graphics;
import java.awt.Color;

public class NepalFlag extends JFrame{

    public NepalFlag(){
        setSize(300,350);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
    
        int [] x = {100,200,100};
        int [] y1 = {60,100,150};
        int [] y2 = {150,200,250};

        g.setColor(Color.RED);
        g.fillPolygon(x,y1,3);
        g.fillPolygon(x,y2,3);
        g.drawLine(100,50,100,300);
    }
    public static void main(String [] args){
        new NepalFlag();
    }
}
