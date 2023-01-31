import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class GUIFormnext implements ActionListener{
    JFrame f;
    JTextField tf,ts,tt;
    JButton btnf, btns;

    GUIFormnext(){
        f = new JFrame("addition-substraion");
        f.setSize(400, 500);

        tf = new JTextField();
        ts = new JTextField();
        tt = new JTextField();
        btnf = new JButton("+");
        btns = new JButton("-");

        tf.setBounds(60,60,280,60);
        ts.setBounds(60,120,280,60);
        tt.setBounds(60,180,280,60);
        btnf.setBounds(30, 280, 100, 60);
        btns.setBounds(270, 280, 100, 60);

        f.add(tf);
        f.add(ts);
        f.add(tt);
        f.add(btnf);
        f.add(btns);

        btnf.addActionListener(this);
        btns.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent e){
        int val1 = Integer.parseInt(tf.getText());
        int val2 = Integer.parseInt(ts.getText());
        Object source = e.getSource();

        if(source == btnf){
            tt.setForeground(Color.BLUE);
            tt.setBackground(Color.CYAN);
            int sum = val1 + val2;
            tt.setText(""+sum);
        }else{
            tt.setForeground(Color.RED);
            tt.setBackground(Color.YELLOW);
            int subs = val1 - val2;
            tt.setText(""+subs);
        }
    }
    public static void main(String [] args){
        new GUIFormnext();
    }
}
