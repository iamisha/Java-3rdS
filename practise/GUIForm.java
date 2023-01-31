import java.io.*;
import javax.swing.*;

class GUIForm{
    JFrame f;
    JTextField tf;
    JButton btn;

    public GUIForm(){
        f = new JFrame();
        f.setTitle("Simple gui form");
        f.setSize(300, 400);
        tf = new JTextField();
        btn = new JButton("click");

        tf.setBounds(50, 60, 200, 60);
        btn.setBounds(90, 200, 100, 60 );
        
        f.add(tf);
        f.add(btn);

        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    public static void main(String [] args){
        new GUIForm();
    }
}
