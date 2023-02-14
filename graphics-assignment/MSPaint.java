import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.Graphics;
import javax.swing.JMenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
public class MSPaint extends JFrame implements MouseListener, MouseMotionListener, ActionListener{

   

        private int x,y,x2,y2;
        private boolean painting = false;
        private JMenuBar menuBar;
        private JMenu shapeMenu;
        private JMenuItem lineItem,rectangleItem, ovalItem;
        private String shape = "shape";
        private Graphics g;


    public MSPaint(){
        setSize(400,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        shapeMenu = new JMenu("shape");
        menuBar.add(shapeMenu);

        lineItem = new JMenuItem("Line");
        shapeMenu.add(lineItem);
        lineItem.addActionListener(this);

        rectangleItem = new JMenuItem("Rectangle");
        shapeMenu.add(rectangleItem);
        rectangleItem.addActionListener(this);

        ovalItem = new JMenuItem("oval");
        shapeMenu.add(ovalItem);
        ovalItem.addActionListener(this);

        addMouseListener(this);
        addMouseMotionListener(this);
    }
    public void actionPerformed(ActionEvent e){

        Object source = e.getSource();
        if(source == lineItem){
            shape = "line";
        }else if(source == rectangleItem){
            shape = "rectangle";
        }else if(source == ovalItem){
            shape = "oval";
        }

    }
    public void mousePressed(MouseEvent e){
        painting = true;
        x = e.getX();
        y = e.getY();
    }
    public void mouseReleased(MouseEvent e){
        painting = false;
        x2 = e.getX();
        y2 = e.getY();
        g = getGraphics();
        if(shape.equals("line")){
            g.drawLine(x,y,x2,y2);
        }if(shape.equals("rectangle")){
            g.drawRect(Math.min(x,x2),Math.min(y,y2),Math.abs(x-x2),Math.abs(y-y2));
        }
        if(shape.equals("oval")){
            g.drawOval(Math.min(x,x2),Math.min(y,y2),Math.abs(x-x2),Math.abs(y-y2));

        }
    }
    public void mouseDragged(MouseEvent e){}
    public void mouseMoved(MouseEvent e){}
    public void mouseClicked(MouseEvent e){}
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}

    public static void main(String[] args){
        MSPaint frame = new MSPaint();
        frame.setVisible(true);
        
    }
}
