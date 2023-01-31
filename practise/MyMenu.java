import javax.swing.*;
import java.awt.event.*;
class MyMenu implements ActionListener{
    JFrame f;
    JMenu menu;
    JMenuBar bar;
    JMenuItem select, copy, cut,paste,exit;
    JTextArea area;
    public MyMenu(){
        f = new JFrame("Menu");
        f.setSize(300, 400);

        menu = new JMenu("file");
        bar = new JMenuBar();
        f.setJMenuBar(bar);
        select = new JMenuItem("Select All");
        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        paste = new JMenuItem("Paste");
        exit = new JMenuItem("Exit");
        area = new JTextArea("Hello world!");

        area.setBounds(200, 300, 180,100);

        bar.add(menu);
        menu.add(select);
        menu.add(copy);
        menu.add(cut);
        menu.add(paste);
        menu.addSeparator();
        menu.add(exit);
        f.add(area);

        select.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if(source == select){
            area.selectAll();
        }else if(source == copy){
            area.copy();
        }else if(source == cut){
            area.cut();
        }else if(source == paste){
            area.paste();
        }else{
            System.exit(0);
        }
    }
    public static void main(String[] args) {
        new MyMenu();
    }
}