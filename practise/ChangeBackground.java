import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class ChangeBackground implements ActionListener{
    JFrame f;
    JButton btn1, btn2, btn3;

    public ChangeBackground(){
        f = new JFrame("Background-change");
        f.setSize(400,400);

        btn1 = new JButton("CYAN");
        btn2 = new JButton("MAGENTA");
        btn3 = new JButton("PINK");

        btn1.setBounds(100,60,200,60);
        btn2.setBounds(100,120,200,60);
        btn3.setBounds(100,180,200,60);

        f.add(btn1);
        f.add(btn2);
        f.add(btn3);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == btn1){
            f.getContentPane().setBackground(Color.CYAN);
        }else if(source == btn2){
            f.getContentPane().setBackground(Color.MAGENTA);
        }else{
            f.getContentPane().setBackground(Color.PINK);
        }
    }
    public static void main(String[] args) {
        new ChangeBackground();
    }
}