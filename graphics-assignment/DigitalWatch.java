import javax.swing.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.Color;

class DigitalWatch extends JFrame{
    JLabel label;
    public DigitalWatch(){
        setSize(400,300);
        label = new JLabel();
        label.setFont(new Font("Arial", Font.PLAIN, 40));
        label.setForeground(Color.ORANGE);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void showTime(){
        while(true){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat f = new SimpleDateFormat("hh:mm:ss");
       
            String time = f.format(cal.getTime());
            label.setText(time);
            try{
                Thread.sleep(1000);
                cal = Calendar.getInstance();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void main(String []args){
        DigitalWatch d = new DigitalWatch();
        d.showTime();
    }
}