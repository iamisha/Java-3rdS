import javax.swing.*;
import java.awt.*;

class BarDiagram extends JFrame{
    final int [] data = {20,12,10,6};
    final int frame_height = 600;
    final int frame_width = 600;
    final int bar_width = 60;

    public BarDiagram(){
        setSize(frame_width,frame_height);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public int getMax(){
        int max = 0;
        for(int i:data){
            if(i>max){
                max = i;
            }
        }
        return max;
    }
    public int [] transformData(){
        int [] td = new int[data.length];
        int max_height = 500;
        int max = getMax();

        for(int i=0;i<data.length;i++){
            td[i] = Math.round((max_height*data[i])/max);
        }
        return td;
    }
    public void paint(Graphics g){
        Color [] colors = {Color.RED,Color.BLACK,Color.PINK,Color.BLUE};
        int [] t = transformData();
        for(int i = 0; i<t.length;i++){
            g.setColor(colors[i]);
            g.fillRect(i*bar_width,frame_height-t[i],bar_width,t[i]);
        }
    }
    public static void main(String[] args) {
        new BarDiagram();
    }
}