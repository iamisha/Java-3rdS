/* creating my own dialog box */
import javax.swing.*;
import java.awt.Dimension;
import java.awt.Component;
import java.awt.event.*;

class MyOwnDialog extends JFrame implements ActionListener{
    JButton btn;
    public MyOwnDialog(){
        btn = new JButton("click");
        setTitle("own-dialogbox");
        setSize(300,400);
        btn.setBounds(100, 200, 100, 60);
        add(btn);
        btn.addActionListener(this);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){

        MyDialog.showMyDialog(this, "Do you want to continue ?", "Own-Dialog");
        
    }
    public static void main(String[] args) {
        new MyOwnDialog();
    }
}
class MyDialog{
    static JDialog d;
    static JLabel l;
    static JButton b;

    public static void showMyDialog(JFrame frame, String msg, String title){
        d = new JDialog(frame, title);
        l = new JLabel(msg);
        b = new JButton("OK");
        d.setSize(180,140);
        d.setLayout(new BoxLayout(d.getContentPane(), BoxLayout.Y_AXIS));
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
        b.setAlignmentX(Component.CENTER_ALIGNMENT);
        d.add(Box.createRigidArea(new Dimension(0,10)));
        d.add(l);
        d.add(Box.createRigidArea(new Dimension(0,20)));
        d.add(b);
        d.setLocationRelativeTo(frame);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d.setVisible(false);
            }
        });
        d.setVisible(true);
    }
}