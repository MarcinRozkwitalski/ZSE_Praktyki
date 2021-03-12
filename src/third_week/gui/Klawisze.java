package third_week.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Klawisze {
    public static void main(String[] args) {
        JFrame ablak = new JFrame("Okno zmieniające rozmiar");
        ablak.setVisible(true);
        final int[] x = {400};
        final int[] y = {400};
        ablak.setSize(new Dimension(x[0], y[0]));
        ablak.setFocusable(true);
        ablak.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ablak.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_UP){
                    System.out.println("Jedziemy w górę");
                    int tempx = x[0];
                    y[0] = y[0] - 5;
                    int tempy = y[0];
                    ablak.setSize(new Dimension(tempx, tempy));
                }
            }
        });

        ablak.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    System.out.println("Jedziemy w lewo");
                    int tempy = y[0];
                    x[0] = x[0] - 5;
                    int tempx = x[0];
                    ablak.setSize(new Dimension(tempx, tempy));
                }
            }
        });

        ablak.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                    System.out.println("Jedziemy w prawo");
                    int tempy = y[0];
                    x[0] = x[0] + 5;
                    int tempx = x[0];
                    ablak.setSize(new Dimension(tempx, tempy));
                }
            }
        });

        JPanel contentPane = (JPanel) ablak.getContentPane();
        int condition = JComponent.WHEN_IN_FOCUSED_WINDOW;
        InputMap inputMap = contentPane.getInputMap(condition);
        ActionMap actionMap = contentPane.getActionMap();

        String down = "down";
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_DOWN, 0), down);
        actionMap.put(down, new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Jedziemy w dół");
                int tempx = x[0];
                y[0] = y[0] + 5;
                int tempy = y[0];
                ablak.setSize(new Dimension(tempx, tempy));
            }
        });

    }
}
