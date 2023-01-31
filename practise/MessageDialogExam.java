import javax.swing.*;
import java.awt.event.*;
class MessageDialogExam implements WindowListener{
    JFrame f;
    public MessageDialogExam(){
        f = new JFrame("agree");
        f.setSize(300, 400);
        f.addWindowListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    public void windowClosing(WindowEvent e){
        JOptionPane.showMessageDialog(f,"do you really want to close the frame ?","title",JOptionPane.PLAIN_MESSAGE);
    }
    
    public void windowOpened(WindowEvent e){}
    public void windowActivated(WindowEvent e){}
    public void windowDeactivated(WindowEvent e){}
    public void windowIconified(WindowEvent e){}
    public void windowDeiconified(WindowEvent e){}
    public void windowClosed(WindowEvent e){}
    
    public static void main(String[] args) {
        new MessageDialogExam();
    }
}