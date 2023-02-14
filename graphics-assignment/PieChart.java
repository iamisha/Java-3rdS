import javax.swing.*;
import java.awt.*;

public class PieChart extends JFrame{
    final int [] data= {20,12,10,6};

    public PieChart(){
        setSize(590,620);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public int getTotal(){
        int sum = 0;
        for(int i:data){
            sum += i;
        }
        return sum;
    }
    public int [] getAngles(){

        int [] angles = new int[data.length];
        int total = getTotal();

        for(int i = 0; i<data.length;i++){
            angles[i] = Math.round((360*data[i])/total);
        }
        return angles;
    }
    public void paint(Graphics g){
        Color [] colors = {Color.RED,Color.PINK,Color.BLUE,Color.MAGENTA};

        int [] angles = getAngles();
        int startAngle = 0;

        for(int i = 0; i<angles.length;i++){
            g.setColor(colors[i]);
            g.fillArc(150, 200, 300, 300, startAngle, angles[i]);
            startAngle += angles[i];
        }
    }
    public static void main(String[] args) {
        new PieChart();
    }
}