package third_week.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kalkulator extends JFrame{

    private JPanel panelLiczb;
    private JPanel panelFunkcji;
    private JPanel panelWyniku;
    private JLabel wynik;
    private JLabel tekstLiczbaA;
    private JLabel tekstLiczbaB;
    private JTextArea poleLiczbaA;
    private JTextArea poleLiczbaB;
    private JButton przyciskDodaj;
    private JButton przyciskOdejmij;
    Kalkulator(){
        setTitle("Kalkulator prosty");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelLiczb = new JPanel();
        panelFunkcji = new JPanel();
        panelWyniku = new JPanel();
        wynik = new JLabel("");
        tekstLiczbaA = new JLabel("Liczba A");
        tekstLiczbaB = new JLabel("Liczba B");
        poleLiczbaA = new JTextArea("");
        poleLiczbaB = new JTextArea("");
        przyciskDodaj = new JButton("Suma");
        przyciskOdejmij = new JButton("Różnica");
        add(panelLiczb);
        panelLiczb.add(tekstLiczbaA);
        panelLiczb.add(poleLiczbaA);
        panelLiczb.add(tekstLiczbaB);
        panelLiczb.add(poleLiczbaB);
        panelFunkcji.add(przyciskDodaj);
        panelFunkcji.add(przyciskOdejmij);
        add(panelWyniku);
        panelWyniku.add(wynik);
        panelLiczb.setLayout(new GridLayout(4, 1));
        getContentPane().add(BorderLayout.NORTH, panelLiczb);
        getContentPane().add(BorderLayout.CENTER, panelWyniku);
        getContentPane().add(BorderLayout.SOUTH, panelFunkcji);
        setVisible(true);

        przyciskDodaj.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(poleLiczbaA.getText());
                double b = Double.parseDouble(poleLiczbaB.getText());
                double c = round(a + b, 2);
                wynik.setText("Suma=" + c);
            }
        });

        przyciskOdejmij.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(poleLiczbaA.getText());
                double b = Double.parseDouble(poleLiczbaB.getText());
                double c = round(a - b, 2);
                wynik.setText("Suma=" + c);
            }
        });
    }

    public static double round(double value, int places){
        if (places < 0) throw new IllegalArgumentException();
        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static void main(String[] args) {
        Kalkulator calc = new Kalkulator();
    }

}
