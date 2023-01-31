import java.awt.event.ActionListener;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;

class OddEvenGUI extends Frame implements ActionListener {
    TextField t;
    Label l;

    public OddEvenGUI() {
        setTitle("Odd-Even");
        t = new TextField();
        Button b = new Button("click");
        l = new Label();
        setLayout(null);
        setVisible(true);
        setSize(400, 400);
        t.setBounds(100, 100, 200, 50);
        b.setBounds(110, 250, 170, 50);
        l.setBounds(100, 180, 200, 50);
        b.addActionListener(this); // passing the address of own constructor object
        add(t);
        add(b);
        add(l);

    }

    public void actionPerformed(ActionEvent e) { // ActionEvent performs the events or tasks after clicking the button,
                                                 // clicking to the button is an action which is listened by the
                                                 // ActionListener
        int num = Integer.parseInt(t.getText());
        if (num % 2 == 0) {
            l.setText("You have entered an even num");
        } else {
            l.setText("You have entered an odd num");
        }
    }

    public static void main(String[] args) {
        new OddEvenGUI();
    }
}