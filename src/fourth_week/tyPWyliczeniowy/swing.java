package fourth_week.tyPWyliczeniowy;

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.math.BigDecimal;
        import java.math.RoundingMode;
        import java.util.ArrayList;

class swing extends JFrame implements ActionListener{

    public int koszyk = 0;
    public int ilosc_produktow = 0;
    public double ilosc_produktow_kg = 0;
    public String ilosc_produktow2, gotowka2, pin2, wybor;
    public double wartosc_produktow = 0, wybor_cena = 0, gotowka = 0, reszta = 0, brak = 0, pin = 0;
    public ArrayList<String> lista_produktow = new ArrayList<>();
    public ArrayList<Double> lista_produktow_cena = new ArrayList<>();

    public JPanel panel, p_pieczywo, p_owoce, p_warzywa, p_artykulyS, p_napoje, p_koszyk, p_kasa;
    public JLabel tekst, tekst2, tekst3, dodano, ilosc, koszyk2, t_pieczywo, t_owoce, t_warzywa, t_artykulyS, t_napoje;
    public JLabel text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11;
    public JLabel t_kasa, kasaText, kasaText2, kasaText3, t_koszyk;
    public JTextArea tekstA;
    public JButton p_alejka, o_alejka, w_alejka, a_alejka, n_alejka, k_alejka, pieczywo, owoce, warzywa, artykulySpozywcze, napoje, zawartosc, potwierdz, potwierdz_kg, potwierdzKasa, potwierdzKasaKarta, kasa, platnoscGotowka, platnoscKarta;
    public JButton chleb, kajzerka, paczek, dounat;
    public JButton banan, jablko, pomarancza, cytryna;
    public JButton ogorek, pomidor, salata, papryka, rzodkiewka;
    public JButton herbata, kawa, makaron, ryz, cukier;
    public JButton woda, wodag, sokp, cola;

    public static double round(double value) {
        int precision = 2;
        BigDecimal bigDecimal = new BigDecimal(value);
        bigDecimal = bigDecimal.setScale(precision, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }

    public swing() {
        super("Sklep");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds((1366 / 2) - 500, (768 / 2) - 250, 1000, 500);
        setVisible(true);
        alejka();
    }
    public void alejka(){
        panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        tekst = new JLabel("Super Market");
        tekst.setBounds(365, 10, 100, 25);
        panel.add(tekst);

        tekst2 = new JLabel("Wybierz alejkę do której chcesz wejść.");
        tekst2.setBounds(290, 40, 225, 25);
        panel.add(tekst2);

        Color colorPieczywo = new Color(170, 129, 77);
        Color colorOwoce = new Color(236, 148, 7);
        Color colorWarzywa = new Color(73, 165, 55);
        Color colorArtykulyS = new Color(206, 79, 79);
        Color colorNapoje = new Color(58, 174, 205);
        Color colorZawartosc = new Color(228, 223, 56);

        pieczywo = new JButton("Pieczywo");
        pieczywo.setBounds(10, 80, 150, 25);
        pieczywo.setBackground(colorPieczywo);
        pieczywo.addActionListener(this);
        pieczywo.setFocusable(false);
        panel.add(pieczywo);

        owoce = new JButton("Owoce");
        owoce.setBounds(170, 80, 150, 25);
        owoce.setBackground(colorOwoce);
        owoce.addActionListener(this);
        owoce.setFocusable(false);
        panel.add(owoce);

        warzywa = new JButton("Warzywa");
        warzywa.setBounds(330, 80, 150, 25);
        warzywa.setBackground(colorWarzywa);
        warzywa.addActionListener(this);
        warzywa.setFocusable(false);
        panel.add(warzywa);

        artykulySpozywcze = new JButton("Artykuły Spożywcze");
        artykulySpozywcze.setBounds(490, 80, 150, 25);
        artykulySpozywcze.setBackground(colorArtykulyS);
        artykulySpozywcze.addActionListener(this);
        artykulySpozywcze.setFocusable(false);
        panel.add(artykulySpozywcze);

        napoje = new JButton("Napoje");
        napoje.setBounds(650, 80, 150, 25);
        napoje.setBackground(colorNapoje);
        napoje.addActionListener(this);
        napoje.setFocusable(false);
        panel.add(napoje);

        koszyk2 = new JLabel("W koszyku znajduje się " + koszyk + " przedmiotów (" + round(wartosc_produktow) + " zł).");
        koszyk2.setBounds(700, 10, 400, 25);
        panel.add(koszyk2);

        zawartosc = new JButton("Zobacz Zawartość");
        zawartosc.setBounds(760, 40, 140, 25);
        zawartosc.setBackground(colorZawartosc);
        zawartosc.addActionListener(this);
        zawartosc.setFocusable(false);
        panel.add(zawartosc);

        setVisible(true);
    }

    public void pieczywo(){
        panel.setVisible(false);
        p_pieczywo = new JPanel();
        p_pieczywo.setLayout(null);
        add(p_pieczywo);

        t_pieczywo = new JLabel("Wybierz produkt, a następnie jego ilość.");
        t_pieczywo.setBounds(30, 25, 300, 25);
        p_pieczywo.add(t_pieczywo);

        p_alejka = new JButton("Powrót na alejkę");
        chleb = new JButton("Chleb - 1.20 zł");
        kajzerka = new JButton("Kajzerka - 0.28 zł");
        paczek = new JButton("Paczek - 1.65 zł");
        dounat = new JButton("Dounat - 1.80 zł");

        Color colorPieczywo = new Color(170, 129, 77);

        p_alejka.setBackground(Color.WHITE);
        chleb.setBackground(colorPieczywo);
        kajzerka.setBackground(colorPieczywo);
        paczek.setBackground(colorPieczywo);
        dounat.setBackground(colorPieczywo);

        p_alejka.setBounds(10, 80, 150, 25);
        chleb.setBounds(170, 80, 150, 25);
        kajzerka.setBounds(330, 80, 150, 25);
        paczek.setBounds(490, 80, 150, 25);
        dounat.setBounds(650, 80, 150, 25);

        p_alejka.addActionListener(this);
        chleb.addActionListener(this);
        kajzerka.addActionListener(this);
        paczek.addActionListener(this);
        dounat.addActionListener(this);

        p_alejka.setFocusable(false);
        chleb.setFocusable(false);
        kajzerka.setFocusable(false);
        paczek.setFocusable(false);
        dounat.setFocusable(false);

        p_pieczywo.add(p_alejka);
        p_pieczywo.add(chleb);
        p_pieczywo.add(kajzerka);
        p_pieczywo.add(paczek);
        p_pieczywo.add(dounat);

        ilosc = new JLabel("Podaj ilość produktu: ");
        ilosc.setBounds(10, 120, 140, 15);
        p_pieczywo.add(ilosc);

        tekstA = new JTextArea();
        tekstA.setBounds(135, 120, 50, 15);
        p_pieczywo.add(tekstA);

        potwierdz = new JButton("Potwierdź");
        potwierdz.setBounds(195, 115, 125, 25);
        potwierdz.addActionListener(this);
        potwierdz.setFocusable(false);
        p_pieczywo.add(potwierdz);

        dodano = new JLabel();
        dodano.setBounds(10,120,400,25);
        p_pieczywo.add(dodano);

        setVisible(true);
        ilosc.setVisible(false);
        tekstA.setVisible(false);
        potwierdz.setVisible(false);
    }

    public void owoce(){
        panel.setVisible(false);
        p_owoce = new JPanel();
        p_owoce.setLayout(null);
        add(p_owoce);

        t_owoce = new JLabel("Wybierz produkt, a następnie jego ilość.");
        t_owoce.setBounds(30, 25, 300, 25);
        p_owoce.add(t_owoce);

        o_alejka = new JButton("Powrót na alejkę");
        banan = new JButton("Banan - 5.10 zł/kg");
        jablko = new JButton("Jabłko - 3.25 zł/kg");
        pomarancza = new JButton("Pomarańcza - 4.90 zł/kg");
        cytryna = new JButton("Cytryna - 6.75 zł/kg");

        Color colorOwoce = new Color(236, 148, 7);

        o_alejka.setBackground(Color.WHITE);
        banan.setBackground(colorOwoce);
        jablko.setBackground(colorOwoce);
        pomarancza.setBackground(colorOwoce);
        cytryna.setBackground(colorOwoce);

        o_alejka.setBounds(10, 80, 150, 25);
        banan.setBounds(170, 80, 150, 25);
        jablko.setBounds(330, 80, 150, 25);
        pomarancza.setBounds(490, 80, 150, 25);
        cytryna.setBounds(650, 80, 150, 25);

        o_alejka.addActionListener(this);
        banan.addActionListener(this);
        jablko.addActionListener(this);
        pomarancza.addActionListener(this);
        cytryna.addActionListener(this);

        o_alejka.setFocusable(false);
        banan.setFocusable(false);
        jablko.setFocusable(false);
        pomarancza.setFocusable(false);
        cytryna.setFocusable(false);

        p_owoce.add(o_alejka);
        p_owoce.add(banan);
        p_owoce.add(jablko);
        p_owoce.add(pomarancza);
        p_owoce.add(cytryna);

        ilosc = new JLabel("Podaj ilość produktu [kg]: ");
        ilosc.setBounds(10, 120, 150, 15);
        p_owoce.add(ilosc);

        tekstA = new JTextArea();
        tekstA.setBounds(160, 120, 50, 15);
        p_owoce.add(tekstA);

        potwierdz_kg = new JButton("Potwierdź");
        potwierdz_kg.setBounds(220, 115, 125, 25);
        potwierdz_kg.addActionListener(this);
        potwierdz_kg.setFocusable(false);
        p_owoce.add(potwierdz_kg);

        dodano = new JLabel();
        dodano.setBounds(10,120,400,25);
        p_owoce.add(dodano);

        setVisible(true);
        ilosc.setVisible(false);
        tekstA.setVisible(false);
        potwierdz_kg.setVisible(false);
    }

    public void warzywa(){
        panel.setVisible(false);
        p_warzywa = new JPanel();
        p_warzywa.setLayout(null);
        add(p_warzywa);

        t_warzywa = new JLabel("Wybierz produkt, a następnie jego ilość.");
        t_warzywa.setBounds(30, 25, 300, 25);
        p_warzywa.add(t_warzywa);

        Color colorWarzywa = new Color(73, 165, 55);

        w_alejka = new JButton("Powrót na alejkę");
        ogorek = new JButton("Ogórek - 3.14 zł/kg");
        pomidor = new JButton("Pomidor - 4.05 zł/kg");
        salata = new JButton("Sałata - 8.56 zł/kg");
        papryka = new JButton("Papryka - 6.20 zł/kg");
        rzodkiewka = new JButton("Rzodkiewka - 3.35 zł/kg");

        w_alejka.setBackground(Color.WHITE);
        ogorek.setBackground(colorWarzywa);
        pomidor.setBackground(colorWarzywa);
        salata.setBackground(colorWarzywa);
        papryka.setBackground(colorWarzywa);
        rzodkiewka.setBackground(colorWarzywa);

        w_alejka.setBounds(10, 80, 150, 25);
        ogorek.setBounds(170, 80, 150, 25);
        pomidor.setBounds(330, 80, 150, 25);
        salata.setBounds(490, 80, 150, 25);
        papryka.setBounds(650, 80, 150, 25);
        rzodkiewka.setBounds(810, 80, 150, 25);

        w_alejka.addActionListener(this);
        ogorek.addActionListener(this);
        pomidor.addActionListener(this);
        salata.addActionListener(this);
        papryka.addActionListener(this);
        rzodkiewka.addActionListener(this);

        w_alejka.setFocusable(false);
        ogorek.setFocusable(false);
        pomidor.setFocusable(false);
        salata.setFocusable(false);
        papryka.setFocusable(false);
        rzodkiewka.setFocusable(false);

        p_warzywa.add(w_alejka);
        p_warzywa.add(ogorek);
        p_warzywa.add(pomidor);
        p_warzywa.add(salata);
        p_warzywa.add(papryka);
        p_warzywa.add(rzodkiewka);

        ilosc = new JLabel("Podaj ilość produktu [kg]: ");
        ilosc.setBounds(10, 120, 150, 15);
        p_warzywa.add(ilosc);

        tekstA = new JTextArea();
        tekstA.setBounds(160, 120, 50, 15);
        p_warzywa.add(tekstA);

        potwierdz_kg = new JButton("Potwierdź");
        potwierdz_kg.setBounds(220, 115, 125, 25);
        potwierdz_kg.addActionListener(this);
        potwierdz_kg.setFocusable(false);
        p_warzywa.add(potwierdz_kg);

        dodano = new JLabel();
        dodano.setBounds(10,120,400,25);
        p_warzywa.add(dodano);

        setVisible(true);
        ilosc.setVisible(false);
        tekstA.setVisible(false);
        potwierdz_kg.setVisible(false);
    }

    public void artykulySpozywcze(){
        panel.setVisible(false);
        p_artykulyS = new JPanel();
        p_artykulyS.setLayout(null);
        add(p_artykulyS);

        t_artykulyS = new JLabel("Wybierz produkt, a następnie jego ilość.");
        t_artykulyS.setBounds(30, 25, 300, 25);
        p_artykulyS.add(t_artykulyS);

        a_alejka = new JButton("Powrót na alejkę");
        herbata = new JButton("Herbata - 9.30 zł");
        kawa = new JButton("Kawa - 27.99 zł");
        makaron = new JButton("Makaron - 4.19 zł");
        ryz = new JButton("Ryż - 4.78 zł");
        cukier = new JButton("Cukier - 3.85 zł");

        Color colorArtykulyS = new Color(206, 79, 79);

        a_alejka.setBackground(Color.WHITE);
        herbata.setBackground(colorArtykulyS);
        kawa.setBackground(colorArtykulyS);
        makaron.setBackground(colorArtykulyS);
        ryz.setBackground(colorArtykulyS);
        cukier.setBackground(colorArtykulyS);

        a_alejka.setBounds(10, 80, 150, 25);
        herbata.setBounds(170, 80, 150, 25);
        kawa.setBounds(330, 80, 150, 25);
        makaron.setBounds(490, 80, 150, 25);
        ryz.setBounds(650, 80, 150, 25);
        cukier.setBounds(810, 80, 150, 25);

        a_alejka.addActionListener(this);
        herbata.addActionListener(this);
        kawa.addActionListener(this);
        makaron.addActionListener(this);
        ryz.addActionListener(this);
        cukier.addActionListener(this);

        a_alejka.setFocusable(false);
        herbata.setFocusable(false);
        kawa.setFocusable(false);
        makaron.setFocusable(false);
        ryz.setFocusable(false);
        cukier.setFocusable(false);

        p_artykulyS.add(a_alejka);
        p_artykulyS.add(herbata);
        p_artykulyS.add(kawa);
        p_artykulyS.add(makaron);
        p_artykulyS.add(ryz);
        p_artykulyS.add(cukier);

        ilosc = new JLabel("Podaj ilość produktu: ");
        ilosc.setBounds(10, 120, 140, 15);
        p_artykulyS.add(ilosc);

        tekstA = new JTextArea();
        tekstA.setBounds(135, 120, 50, 15);
        p_artykulyS.add(tekstA);

        potwierdz = new JButton("Potwierdź");
        potwierdz.setBounds(195, 115, 125, 25);
        potwierdz.addActionListener(this);
        potwierdz.setFocusable(false);
        p_artykulyS.add(potwierdz);

        dodano = new JLabel();
        dodano.setBounds(10,120,400,25);
        p_artykulyS.add(dodano);

        setVisible(true);
        ilosc.setVisible(false);
        tekstA.setVisible(false);
        potwierdz.setVisible(false);
    }

    public void napoje(){
        panel.setVisible(false);
        p_napoje = new JPanel();
        p_napoje.setLayout(null);
        add(p_napoje);

        t_napoje = new JLabel("Wybierz produkt, a następnie jego ilość.");
        t_napoje.setBounds(30, 25, 300, 25);
        p_napoje.add(t_napoje);

        n_alejka = new JButton("Powrót na alejkę");
        woda = new JButton("Woda niegazowana - 1.89 zł");
        wodag = new JButton("Woda gazowana - 2.09 zł");
        sokp = new JButton("Sok pomarańczowy - 2.90 zł");
        cola = new JButton("Cola - 6.70 zł");

        Color colorNapoje = new Color(58, 174, 205);

        n_alejka.setBackground(Color.WHITE);
        woda.setBackground(colorNapoje);
        wodag.setBackground(colorNapoje);
        sokp.setBackground(colorNapoje);
        cola.setBackground(colorNapoje);

        n_alejka.setBounds(10, 80, 150, 25);
        woda.setBounds(170, 80, 190, 25);
        wodag.setBounds(370, 80, 190, 25);
        sokp.setBounds(570, 80, 190, 25);
        cola.setBounds(770, 80, 190, 25);

        n_alejka.addActionListener(this);
        woda.addActionListener(this);
        wodag.addActionListener(this);
        sokp.addActionListener(this);
        cola.addActionListener(this);

        n_alejka.setFocusable(false);
        woda.setFocusable(false);
        wodag.setFocusable(false);
        sokp.setFocusable(false);
        cola.setFocusable(false);

        p_napoje.add(n_alejka);
        p_napoje.add(woda);
        p_napoje.add(wodag);
        p_napoje.add(sokp);
        p_napoje.add(cola);

        ilosc = new JLabel("Podaj ilość produktu: ");
        ilosc.setBounds(10, 120, 140, 15);
        p_napoje.add(ilosc);

        tekstA = new JTextArea();
        tekstA.setBounds(135, 120, 50, 15);
        p_napoje.add(tekstA);

        potwierdz = new JButton("Potwierdź");
        potwierdz.setBounds(195, 115, 125, 25);
        potwierdz.addActionListener(this);
        potwierdz.setFocusable(false);
        p_napoje.add(potwierdz);

        dodano = new JLabel();
        dodano.setBounds(10,120,400,25);
        p_napoje.add(dodano);

        setVisible(true);
        ilosc.setVisible(false);
        tekstA.setVisible(false);
        potwierdz.setVisible(false);
    }

    public void wybor_produktu(){
        dodano.setVisible(false);
        ilosc.setVisible(true);
        tekstA.setVisible(true);
        potwierdz.setVisible(true);
    }

    public void wybor_produktu_kg(){
        dodano.setVisible(false);
        ilosc.setVisible(true);
        tekstA.setVisible(true);
        potwierdz_kg.setVisible(true);
    }

    public void potwierdz(){
        ilosc_produktow2 = tekstA.getText();
        ilosc_produktow = Integer.parseInt(ilosc_produktow2);

        if (ilosc_produktow <= 0){
            dodano.setText("Ilość produktów musi być wyższa od 0.");
            tekstA.setText("");
        }
        else {
            koszyk = koszyk + 1;
            wartosc_produktow = wartosc_produktow + (wybor_cena * ilosc_produktow);
            lista_produktow.add(wybor + " (" + ilosc_produktow + ")");
            lista_produktow_cena.add(wybor_cena * ilosc_produktow);
            tekstA.setText("");
            dodano.setText("Dodano " + ilosc_produktow + " " + wybor + " do koszyka (" + round(wybor_cena * ilosc_produktow) + "zł).");
        }
        dodano.setVisible(true);
        ilosc.setVisible(false);
        tekstA.setVisible(false);
        potwierdz.setVisible(false);
    }

    public void potwierdz_kg(){
        ilosc_produktow2 = tekstA.getText();
        ilosc_produktow_kg = Double.parseDouble(ilosc_produktow2);

        if (ilosc_produktow_kg <= 0){
            dodano.setText("Ilość produktów musi być wyższa od 0.");
            tekstA.setText("");
        }
        else {
            koszyk = koszyk + 1;
            wartosc_produktow = wartosc_produktow + (wybor_cena * ilosc_produktow_kg);
            lista_produktow.add(wybor + " (" + ilosc_produktow_kg + " kg)");
            lista_produktow_cena.add(wybor_cena * ilosc_produktow_kg);
            tekstA.setText("");
            dodano.setText("Dodano " + ilosc_produktow_kg + " kg " + wybor + " do koszyka (" + round(wybor_cena * ilosc_produktow_kg) + "zł).");
        }
        dodano.setVisible(true);
        ilosc.setVisible(false);
        tekstA.setVisible(false);
        potwierdz_kg.setVisible(false);
    }

    public void koszyk(){
        panel.setVisible(false);
        p_koszyk = new JPanel();
        p_koszyk.setLayout(null);
        add(p_koszyk);

        k_alejka = new JButton("Powrót na alejkę");
        k_alejka.setBounds(25, 20, 150, 25);
        k_alejka.setBackground(Color.WHITE);
        k_alejka.addActionListener(this);
        k_alejka.setFocusable(false);
        p_koszyk.add(k_alejka);

        Color colorKasa = new Color(206, 79, 79);

        kasa = new JButton("Kasa");
        kasa.setBounds(200, 20, 150, 25);
        kasa.setBackground(colorKasa);
        kasa.addActionListener(this);
        kasa.setFocusable(false);
        p_koszyk.add(kasa);

        t_koszyk = new JLabel();
        t_koszyk.setBounds(375, 20, 400, 25);
        p_koszyk.add(t_koszyk);

        tekst3 = new JLabel("W koszyku znajduje się " + koszyk + " przedmiotów (" + round(wartosc_produktow) + " zł).");
        tekst3.setBounds(25, 50, 400, 25);
        p_koszyk.add(tekst3);

        text1 = new JLabel();
        text1.setBounds(25, 75, 300, 25);
        p_koszyk.add(text1);

        text2 = new JLabel();
        text2.setBounds(25, 100, 300, 25);
        p_koszyk.add(text2);

        text3 = new JLabel();
        text3.setBounds(25, 125, 300, 25);
        p_koszyk.add(text3);

        text4 = new JLabel();
        text4.setBounds(25, 150, 300, 25);
        p_koszyk.add(text4);

        text5 = new JLabel();
        text5.setBounds(25, 175, 300, 25);
        p_koszyk.add(text5);

        text6 = new JLabel();
        text6.setBounds(25, 200, 300, 25);
        p_koszyk.add(text6);

        text7 = new JLabel();
        text7.setBounds(25, 225, 300, 25);
        p_koszyk.add(text7);

        text8 = new JLabel();
        text8.setBounds(25, 250, 300, 25);
        p_koszyk.add(text8);

        text9 = new JLabel();
        text9.setBounds(25, 275, 300, 25);
        p_koszyk.add(text9);

        text10 = new JLabel();
        text10.setBounds(25, 300, 300, 25);
        p_koszyk.add(text10);

        text11 = new JLabel();
        text11.setBounds(25, 325, 300, 25);
        p_koszyk.add(text11);

        // niestety nie wiedziałem jak zrobić tablicę z JLabel (o ile wogóle się da) //

        int i = 0;
        text1.setText(lista_produktow.get(i) + " - " + round(lista_produktow_cena.get(i)) + " zł.");
        i++;
        text2.setText(lista_produktow.get(i) + " - " + round(lista_produktow_cena.get(i)) + " zł.");
        i++;
        text3.setText(lista_produktow.get(i) + " - " + round(lista_produktow_cena.get(i)) + " zł.");
        i++;
        text4.setText(lista_produktow.get(i) + " - " + round(lista_produktow_cena.get(i)) + " zł.");
        i++;
        text5.setText(lista_produktow.get(i) + " - " + round(lista_produktow_cena.get(i)) + " zł.");
        i++;
        text6.setText(lista_produktow.get(i) + " - " + round(lista_produktow_cena.get(i)) + " zł.");
        i++;
        text7.setText(lista_produktow.get(i) + " - " + round(lista_produktow_cena.get(i)) + " zł.");
        i++;
        text8.setText(lista_produktow.get(i) + " - " + round(lista_produktow_cena.get(i)) + " zł.");
        i++;
        text9.setText(lista_produktow.get(i) + " - " + round(lista_produktow_cena.get(i)) + " zł.");
        i++;
        text10.setText(lista_produktow.get(i) + " - " + round(lista_produktow_cena.get(i)) + " zł.");

        if (koszyk > 10){
            text11.setText("Koszyk pokazuje tylko 10 pierwszych przedmiotów.");
        }

        setVisible(true);
    }

    public void kasa(){
        p_koszyk.setVisible(false);
        p_kasa = new JPanel();
        p_kasa.setLayout(null);
        add(p_kasa);

        Color colorGotowka = new Color(73, 165, 55);
        Color colorKarta = new Color(58, 174, 205);

        t_kasa = new JLabel("Do zapłaty jest " + round(wartosc_produktow) + " zł.");
        t_kasa.setBounds(135, 25, 150, 25);
        p_kasa.add(t_kasa);

        platnoscGotowka = new JButton("Gotówka");
        platnoscGotowka.setBounds(25, 75, 150, 25);
        platnoscGotowka.setBackground(colorGotowka);
        platnoscGotowka.setFocusable(false);
        platnoscGotowka.addActionListener(this);
        p_kasa.add(platnoscGotowka);

        platnoscKarta = new JButton("Karta płatnicza");
        platnoscKarta.setBounds(200, 75, 150, 25);
        platnoscKarta.setBackground(colorKarta);
        platnoscKarta.setFocusable(false);
        platnoscKarta.addActionListener(this);
        p_kasa.add(platnoscKarta);

        kasaText2 = new JLabel();
        kasaText2.setBounds(25 ,75, 500, 25);
        p_kasa.add(kasaText2);

        kasaText = new JLabel("Wprowadź ilość gotówki: ");
        kasaText.setBounds(25, 100, 150, 25);
        p_kasa.add(kasaText);

        tekstA = new JTextArea();
        tekstA.setBounds(175, 105, 100, 15);
        p_kasa.add(tekstA);

        potwierdzKasa = new JButton("Potwierdź");
        potwierdzKasa.setBounds(285, 105, 125, 25);
        potwierdzKasa.addActionListener(this);
        potwierdzKasa.setFocusable(false);
        p_kasa.add(potwierdzKasa);

        potwierdzKasaKarta = new JButton("Potwierdź");
        potwierdzKasaKarta.setBounds(225, 100, 125, 25);
        potwierdzKasaKarta.addActionListener(this);
        potwierdzKasaKarta.setFocusable(false);
        p_kasa.add(potwierdzKasaKarta);

        kasaText3 = new JLabel("Zapraszamy ponownie!");
        kasaText3.setBounds(25, 105, 200, 25);
        p_kasa.add(kasaText3);

        setVisible(true);
        kasaText.setVisible(false);
        tekstA.setVisible(false);
        potwierdzKasa.setVisible(false);
        potwierdzKasaKarta.setVisible(false);
        kasaText2.setVisible(false);
        kasaText3.setVisible(false);
    }

    public void gotowka(){
        brak = wartosc_produktow;
        platnoscKarta.setVisible(false);
        platnoscGotowka.setVisible(false);
        kasaText.setVisible(true);
        tekstA.setVisible(true);
        potwierdzKasa.setVisible(true);
    }

    public void potwierdzKasa(){
        kasaText2.setVisible(true);
        kasaText2.setText("Podano za mało pieniędzy." + " Należy się jeszcze " + round(brak) + "zł. ");

        gotowka2 = tekstA.getText();
        gotowka = Double.parseDouble(gotowka2);
        tekstA.setText("");

        if (gotowka >= brak){
            reszta = gotowka - brak;
            kasaText2.setText("Reszta to " + round(reszta) + " zł.");
            kasaText3.setVisible(true);
            kasaText.setVisible(false);
            tekstA.setVisible(false);
            potwierdzKasa.setVisible(false);
        }
        else{
            brak = brak - gotowka;
            potwierdzKasa();
        }
    }

    public void karta(){
        platnoscGotowka.setVisible(false);
        platnoscKarta.setVisible(false);
        tekstA.setText("");
        kasaText.setVisible(true);
        kasaText.setText("Wprowadź pin: ");
        tekstA.setVisible(true);
        tekstA.setBounds(115, 105, 100, 15);
        potwierdzKasaKarta.setVisible(true);
        kasaText2.setVisible(true);
        kasaText2.setText("Wprowadź pin (1234): ");
    }

    public void potwierdzKasaKarta(){
        pin2 = tekstA.getText();
        pin = Double.parseDouble(pin2);

        if (pin == 1234){
            kasaText2.setText("Prawidłowy pin.");
            kasaText3.setVisible(true);
            tekstA.setVisible(false);
            kasaText.setVisible(false);
            potwierdzKasaKarta.setVisible(false);
        }
        else{
            karta();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();

        if(source == pieczywo) {
            pieczywo();
        }
        else{
            if (source == owoce){
                owoce();
            }
            else {
                if (source == warzywa){
                    warzywa();
                }
                else{
                    if (source == artykulySpozywcze){
                        artykulySpozywcze();
                    }
                    else{
                        if (source == napoje){
                            napoje();
                        }
                        else{
                            if (source == p_alejka){
                                p_pieczywo.setVisible(false);
                                alejka();

                            }
                            else{
                                if (source == chleb) {
                                    wybor = "Chleb";
                                    wybor_cena = 1.20;
                                    wybor_produktu();
                                }
                                else{
                                    if (source == kajzerka){
                                        wybor = "Kajzerka";
                                        wybor_cena = 0.28;
                                        wybor_produktu();
                                    }
                                    else{
                                        if (source == paczek){
                                            wybor = "Pączek";
                                            wybor_cena = 1.65;
                                            wybor_produktu();
                                        }
                                        else{
                                            if (source == dounat){
                                                wybor = "Dounat";
                                                wybor_cena = 1.80;
                                                wybor_produktu();
                                            }
                                            else{
                                                if (source == banan){
                                                    wybor = "Banan";
                                                    wybor_cena = 5.10;
                                                    wybor_produktu_kg();
                                                }
                                                else{
                                                    if (source == jablko){
                                                        wybor = "Jabłko";
                                                        wybor_cena = 3.25;
                                                        wybor_produktu_kg();
                                                    }
                                                    else{
                                                        if (source == pomarancza){
                                                            wybor = "Pomarańcza";
                                                            wybor_cena = 4.90;
                                                            wybor_produktu_kg();
                                                        }
                                                        else{
                                                            if (source == cytryna){
                                                                wybor = "Cytryna";
                                                                wybor_cena = 6.75;
                                                                wybor_produktu_kg();
                                                            }
                                                            else{
                                                                if (source == ogorek){
                                                                    wybor = "Ogórek";
                                                                    wybor_cena = 3.14;
                                                                    wybor_produktu_kg();
                                                                }
                                                                else{
                                                                    if (source == pomidor){
                                                                        wybor = "Pomidor";
                                                                        wybor_cena = 4.05;
                                                                        wybor_produktu_kg();
                                                                    }
                                                                    else{
                                                                        if (source == salata){
                                                                            wybor = "Sałata";
                                                                            wybor_cena = 8.56;
                                                                            wybor_produktu_kg();
                                                                        }
                                                                        else{
                                                                            if (source == papryka){
                                                                                wybor = "Papryka";
                                                                                wybor_cena = 6.20;
                                                                                wybor_produktu_kg();
                                                                            }
                                                                            else{
                                                                                if (source == rzodkiewka){
                                                                                    wybor = "Rzodkiewka";
                                                                                    wybor_cena = 3.35;
                                                                                    wybor_produktu_kg();
                                                                                }
                                                                                else{
                                                                                    if (source == herbata){
                                                                                        wybor = "Herbata";
                                                                                        wybor_cena = 9.30;
                                                                                        wybor_produktu();
                                                                                    }
                                                                                    else{
                                                                                        if (source == kawa){
                                                                                            wybor = "Kawa";
                                                                                            wybor_cena = 27.99;
                                                                                            wybor_produktu();
                                                                                        }
                                                                                        else{
                                                                                            if (source == makaron){
                                                                                                wybor = "Makaron";
                                                                                                wybor_cena = 4.19;
                                                                                                wybor_produktu();
                                                                                            }
                                                                                            else{
                                                                                                if (source == ryz){
                                                                                                    wybor = "Ryż";
                                                                                                    wybor_cena = 4.78;
                                                                                                    wybor_produktu();
                                                                                                }
                                                                                                else{
                                                                                                    if (source == cukier){
                                                                                                        wybor = "Cukier";
                                                                                                        wybor_cena = 3.85;
                                                                                                        wybor_produktu();
                                                                                                    }
                                                                                                    else{
                                                                                                        if (source == woda){
                                                                                                            wybor = "Woda niegazowana";
                                                                                                            wybor_cena = 1.89;
                                                                                                            wybor_produktu();
                                                                                                        }
                                                                                                        else{
                                                                                                            if (source == wodag){
                                                                                                                wybor = "Woda gazowana";
                                                                                                                wybor_cena = 2.09;
                                                                                                                wybor_produktu();
                                                                                                            }
                                                                                                            else{
                                                                                                                if (source == sokp){
                                                                                                                    wybor = "Sok pomarańczowy";
                                                                                                                    wybor_cena = 2.90;
                                                                                                                    wybor_produktu();
                                                                                                                }
                                                                                                                else{
                                                                                                                    if (source == cola){
                                                                                                                        wybor = "Cola";
                                                                                                                        wybor_cena = 6.70;
                                                                                                                        wybor_produktu();
                                                                                                                    }
                                                                                                                    else{
                                                                                                                        if (source == potwierdz){
                                                                                                                            potwierdz();
                                                                                                                        }
                                                                                                                        else{
                                                                                                                            if (source == potwierdz_kg){
                                                                                                                                potwierdz_kg();
                                                                                                                            }
                                                                                                                            if (source == o_alejka){
                                                                                                                                p_owoce.setVisible(false);
                                                                                                                                alejka();
                                                                                                                            }
                                                                                                                            else{
                                                                                                                                if (source == w_alejka){
                                                                                                                                    p_warzywa.setVisible(false);
                                                                                                                                    alejka();
                                                                                                                                }
                                                                                                                                else{
                                                                                                                                    if (source == a_alejka){
                                                                                                                                        p_artykulyS.setVisible(false);
                                                                                                                                        alejka();
                                                                                                                                    }
                                                                                                                                    else{
                                                                                                                                        if (source == n_alejka){
                                                                                                                                            p_napoje.setVisible(false);
                                                                                                                                            alejka();
                                                                                                                                        }
                                                                                                                                        else{
                                                                                                                                            if (source == k_alejka){
                                                                                                                                                p_koszyk.setVisible(false);
                                                                                                                                                alejka();
                                                                                                                                            }
                                                                                                                                            else{
                                                                                                                                                if (source == zawartosc){
                                                                                                                                                    koszyk();
                                                                                                                                                }
                                                                                                                                                if (source == kasa){
                                                                                                                                                    if (wartosc_produktow <= 0){
                                                                                                                                                        t_koszyk.setText("Nie masz nic w koszyku, więc nie możesz przejść do kasy.");
                                                                                                                                                        if (source == k_alejka){
                                                                                                                                                            p_koszyk.setVisible(false);
                                                                                                                                                            alejka();
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    else{
                                                                                                                                                        kasa();
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                else{
                                                                                                                                                    if (source == platnoscGotowka){
                                                                                                                                                        gotowka();
                                                                                                                                                    }
                                                                                                                                                    else{
                                                                                                                                                        if (source == potwierdzKasa){
                                                                                                                                                            potwierdzKasa();
                                                                                                                                                        }
                                                                                                                                                        else{
                                                                                                                                                            if (source == platnoscKarta){
                                                                                                                                                                karta();
                                                                                                                                                            }
                                                                                                                                                            else{
                                                                                                                                                                if (source == potwierdzKasaKarta){
                                                                                                                                                                    potwierdzKasaKarta();
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        new swing();
    }
}

