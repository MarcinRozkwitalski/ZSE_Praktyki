package third_week.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Myszka extends JFrame implements MouseListener{

    JLabel tekst;
    JTextArea tekst2;
    JButton przycisk;

    Myszka(){
        addMouseListener(this);
        tekst = new JLabel();
        tekst.setBounds(20, 50, 100, 20);
        tekst2 = new JTextArea();
        tekst2.setBounds(50, 100, 200, 100);
        przycisk = new JButton();
        przycisk.setBounds(5, 5, 50, 50);
        przycisk.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt){
                tekst2.setBackground(Color.orange);
            }
            public void mouseClicked(MouseEvent evt){
                tekst2.setBackground(Color.red);
            }
        });
        tekst2.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt){
                tekst2.setBackground(Color.black);
            }
            public void mouseExited(MouseEvent evt){
                tekst2.setBackground(Color.blue);
            }
            public void mouseClicked(MouseEvent evt){
                tekst2.setBackground(Color.green);
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(tekst);
        add(tekst2);
        add(przycisk);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e){
        tekst.setText("Mouse Clicked");
    }
    public void mousePressed(MouseEvent e){
        tekst.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e){
        tekst.setText("Mouse Released");
    }
    public void mouseEntered(MouseEvent evt){
        tekst.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent evt){
        tekst.setText("Mouse Exited");
    }
    public static void main(String[] args) {
        new Myszka();
    }
}
