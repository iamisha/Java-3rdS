
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Color;

public class JapaneseFlag extends JFrame{

    public JapaneseFlag(){
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void paint(Graphics g){
        final int x = 120;
        final int y = 130;
        final int width = 230;
        final int height = 230;

        g.setColor(Color.RED);
        g.fillOval(x, y, width, height);
    }

    public static void main(String [] args){
        new JapaneseFlag();
    }
    
}
