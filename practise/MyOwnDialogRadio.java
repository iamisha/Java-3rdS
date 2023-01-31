import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.awt.Component;
import java.awt.Dimension;
public class MyOwnDialogRadio implements ActionListener {

    JRadioButton se, it;
    JFrame f;
    public MyOwnDialogRadio(){

        f = new JFrame("own-dialog");
        f.setSize(300,400);

        se =new JRadioButton("SE",true);
        it = new JRadioButton("IT");

        f.add(se);
        f.add(it);
        ButtonGroup bg = new ButtonGroup();
        bg.add(se);
        bg.add(it);

        se.addActionListener(this);
        it.addActionListener(this);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));

        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == se){
            MyDialog.showMyDialog(f, "you have selected 'SE'","se");
        }else{
            MyDialog.showMyDialog(f,"You have selected 'IT'","it");
        }
    }
    public static void main(String[] args) {
        new MyOwnDialogRadio();
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
        d.setSize(150, 100);
        d.add(Box.createRigidArea(new Dimension(0,10)));
        d.add(l);
        d.add(Box.createRigidArea(new Dimension(0,10)));
        d.add(b);
        d.setLayout(new BoxLayout(d.getContentPane(),BoxLayout.Y_AXIS));
        l.setAlignmentX(Component.CENTER_ALIGNMENT);
        b.setAlignmentX(Component.CENTER_ALIGNMENT);
        d.setLocationRelativeTo(frame);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                d.setVisible(false);
            }
        });
        d.setVisible(true);
    }
}