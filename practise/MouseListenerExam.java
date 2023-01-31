import javax.swing.*;
import java.awt.event.*;

class MouseListenerExam implements MouseListener,MouseMotionListener{
    JFrame f;
    JTextField tf,ts;
    public MouseListenerExam(){
        f = new JFrame("MouseListener");
        f.setSize(400,400);

        tf = new JTextField();
        ts = new JTextField();

        tf.setBounds(60, 100, 200, 60);
        ts.setBounds(60,200, 200, 60);

        f.add(tf);
        f.add(ts);

        f.addMouseListener(this);
        f.addMouseMotionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void mouseEntered(MouseEvent e){
        tf.setText("IN!");
    }
    public void mouseExited(MouseEvent e){
        tf.setText("OUT!");
    }
    public void mouseMoved(MouseEvent e){
        ts.setText("X:- "+e.getX()+ "Y:- "+e.getY());
    }
    public void mouseClicked(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    public void mouseDragged(MouseEvent e){}

    public static void main(String[] args) {
        new MouseListenerExam();
    }
}