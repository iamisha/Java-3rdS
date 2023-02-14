
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class ItalianFlag extends JFrame{

    public ItalianFlag(){
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void paint(Graphics g){
        final int x = 70;
        final int y = 150;
        final int width = 120;
        final int height = 220;

        Color [] colors = {Color.GREEN,Color.WHITE,Color.RED};
        for(int i = 0;i<3;i++){
            g.setColor(colors[i]);
            g.fillRect(x+(i*width), y, width, height);
        }
    }
    public static void main(String [] args){
        new ItalianFlag();
    }
}
