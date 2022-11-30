
import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;

class GUIForm extends Frame {
    public GUIForm() {
        setTitle("BESE-III");
        TextField t = new TextField();
        Button b = new Button("click");
        setSize(400, 400);
        t.setBounds(120, 100, 170, 50);
        b.setBounds(150, 250, 100, 40);
        add(t); // adding the control t
        add(b); // adding the control b
        setLayout(null);
        setVisible(true); // by default the frame is hidden, we have to make it visible.
    }

    public static void main(String[] args) {
        new GUIForm(); // calling the constructor
    }
}
