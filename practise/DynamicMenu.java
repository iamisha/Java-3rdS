
import javax.swing.*;
import java.awt.Component;
import java.awt.event.*;

class DynamicMenu implements ActionListener,MouseListener{
    JFrame f;
    JPopupMenu menu;
    JMenuItem select,copy,cut,paste,exit;
    JTextArea area;
    public DynamicMenu(){
        f = new JFrame("Menu");
        f.setSize(300,400);

        menu = new JPopupMenu();
        select = new JMenuItem("Select All");
        copy = new JMenuItem("Copy");
        cut = new JMenuItem("Cut");
        paste = new JMenuItem("Paste");
        exit = new JMenuItem("Exit");
        area = new JTextArea("Hello world!");

        area.setBounds(200,200,100,100);
        
        f.add(menu);
        f.add(area);
        menu.add(select);
        menu.add(copy);
        menu.add(cut);
        menu.add(paste);
        menu.addSeparator();
        menu.add(exit);

        f.addMouseListener(this);
        select.addActionListener(this);
        copy.addActionListener(this);
        cut.addActionListener(this);
        paste.addActionListener(this);
        exit.addActionListener(this);

        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void mouseClicked(MouseEvent e){
        menu.show(f.getContentPane(),e.getX(),e.getY());
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
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

    public static void main(String [] args){
        new DynamicMenu();
    }
}