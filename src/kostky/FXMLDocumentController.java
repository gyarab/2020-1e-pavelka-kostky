package kostky;

import java.io.File;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class FXMLDocumentController {

    @FXML
    private Label nadpis;

    @FXML
    private Label pocet;

    @FXML
    private HBox hbox;

    @FXML
    private Button dva;

    @FXML
    private Button tri;

    @FXML
    private Button ctyri;

    @FXML
    private Button napoveda;

    @FXML
    private Button zpet;

    @FXML
    private HBox hraci;

    @FXML
    private VBox hrac1;

    @FXML
    private TextField sazka1;

    @FXML
    private Button hrac1hod;

    @FXML
    private Label hod1;

    @FXML
    private Label vydelek1;

    @FXML
    private VBox hrac3;

    @FXML
    private TextField sazka2;

    @FXML
    private Button hrac2hod;

    @FXML
    private Label hod2;

    @FXML
    private Label vydelek2;

    @FXML
    private VBox hrac4;

    @FXML
    private TextField sazka3;

    @FXML
    private Button hrac3hod;

    @FXML
    private Label hod3;

    @FXML
    private Label vydelek3;

    @FXML
    private VBox hrac2;

    @FXML
    private TextField sazka4;

    @FXML
    private Button hrac4hod;

    @FXML
    private Label hod4;

    @FXML
    private Label vydelek4;

    @FXML
    private Button menu;

    @FXML
    private Label labelnapoveda;

    @FXML
    private Label celkovacastka;

    @FXML
    private Button secist;

    @FXML
    private Button vyhodnotit;

    @FXML
    private Label chybakostky;

    @FXML
    private ImageView obraz1;

    int ab;
    int i = 0;
    int kostka1;
    int kostka2;
    int kostka3;
    int kostka4;
    int castka2;
    int castka3;
    int castka4;
    int vydelekhrace1;
    int vydelekhrace2;
    int vydelekhrace3;
    int vydelekhrace4;

    Image cislo0 = new Image(getClass().getResourceAsStream(""));
    Image cislo1 = new Image(getClass().getResourceAsStream("1.png"));
    Image cislo2 = new Image(getClass().getResourceAsStream("2.png"));
    Image cislo3 = new Image(getClass().getResourceAsStream("3.png"));
    Image cislo4 = new Image(getClass().getResourceAsStream("4.png"));
    Image cislo5 = new Image(getClass().getResourceAsStream("5.png"));
    Image cislo6 = new Image(getClass().getResourceAsStream("6.png"));
    Image cislo7 = new Image(getClass().getResourceAsStream("7.png"));
    Image cislo8 = new Image(getClass().getResourceAsStream("8.png"));
    Image cislo9 = new Image(getClass().getResourceAsStream("9.png"));
    Image cislo10 = new Image(getClass().getResourceAsStream("10.png"));
    Image cislo11 = new Image(getClass().getResourceAsStream("11.png"));
    Image cislo12 = new Image(getClass().getResourceAsStream("12.png"));

    @FXML
    void hod1(ActionEvent event) {                  // metoda pro hod hráče 1 
        double x = 1 + (Math.random() * 11);        //vygeneruje se náhodné číslo od 1 do 12
        double y = Math.round(x);                   //hodnota x se zaokrouhlí a uloží se do y
        kostka1 = (int) y;                          // hodnota y se přetypuje z double na int a uloží se do kostka1
        String out = String.valueOf(kostka1);       // do out se zapíše hodnota kostka 1 ale ve stringu
        hod1.setText("Hodil jsi: " + out);          // label hod1 napíše hodil jsi: a počet kolik hráč hodil (out)
        hrac1hod.setMouseTransparent(true);         // tlacitko pomocí kterého hráč hází se nastaví na MouseTransparent a nikdo na něj nebude moci ničím zmáčknout
        i++;
        Zvuk();                                     // zavolá se metoda nazvaná zvuk, která přehraje zvuk

        switch (kostka1) {                          //switch, který zobrazí číslo rovnájící se hodnotě hodu hráče
            case 1:
                obraz1.setImage(cislo1);
                break;
            case 2:
                obraz1.setImage(cislo2);
                break;
            case 3:
                obraz1.setImage(cislo3);
                break;
            case 4:
                obraz1.setImage(cislo4);
                break;
            case 5:
                obraz1.setImage(cislo5);
                break;
            case 6:
                obraz1.setImage(cislo6);
                break;
            case 7:
                obraz1.setImage(cislo7);
                break;
            case 8:
                obraz1.setImage(cislo8);
                break;
            case 9:
                obraz1.setImage(cislo9);
                break;
            case 10:
                obraz1.setImage(cislo10);
                break;
            case 11:
                obraz1.setImage(cislo11);
                break;
            case 12:
                obraz1.setImage(cislo12);
                break;
        }
    }

    @FXML
    void hod2(ActionEvent event) {      // metoda pro hod hráče 2
        double x = 1 + (Math.random() * 11);
        double y = Math.round(x);
        kostka2 = (int) y;
        String out = String.valueOf(kostka2);
        hod2.setText("Hodil jsi: " + out);
        hrac2hod.setMouseTransparent(true);
        i++;
        Zvuk();

        switch (kostka2) {
            case 1:
                obraz1.setImage(cislo1);
                break;
            case 2:
                obraz1.setImage(cislo2);
                break;
            case 3:
                obraz1.setImage(cislo3);
                break;
            case 4:
                obraz1.setImage(cislo4);
                break;
            case 5:
                obraz1.setImage(cislo5);
                break;
            case 6:
                obraz1.setImage(cislo6);
                break;
            case 7:
                obraz1.setImage(cislo7);
                break;
            case 8:
                obraz1.setImage(cislo8);
                break;
            case 9:
                obraz1.setImage(cislo9);
                break;
            case 10:
                obraz1.setImage(cislo10);
                break;
            case 11:
                obraz1.setImage(cislo11);
                break;
            case 12:
                obraz1.setImage(cislo12);
                break;
        }

    }

    @FXML
    void hod3(ActionEvent event) {      // metoda pro hod hráče 3
        double x = 1 + (Math.random() * 11);
        double y = Math.round(x);
        kostka3 = (int) y;
        String out = String.valueOf(kostka3);
        hod3.setText("Hodil jsi: " + out);
        hrac3hod.setMouseTransparent(true);
        i++;
        Zvuk();

        switch (kostka3) {
            case 1:
                obraz1.setImage(cislo1);
                break;
            case 2:
                obraz1.setImage(cislo2);
                break;
            case 3:
                obraz1.setImage(cislo3);
                break;
            case 4:
                obraz1.setImage(cislo4);
                break;
            case 5:
                obraz1.setImage(cislo5);
                break;
            case 6:
                obraz1.setImage(cislo6);
                break;
            case 7:
                obraz1.setImage(cislo7);
                break;
            case 8:
                obraz1.setImage(cislo8);
                break;
            case 9:
                obraz1.setImage(cislo9);
                break;
            case 10:
                obraz1.setImage(cislo10);
                break;
            case 11:
                obraz1.setImage(cislo11);
                break;
            case 12:
                obraz1.setImage(cislo12);
                break;
        }

    }

    @FXML
    void hod4(ActionEvent event) {      // metoda pro hod hráče 4
        double x = 1 + (Math.random() * 11);
        double y = Math.round(x);
        kostka4 = (int) y;
        String out = String.valueOf(kostka4);
        hod4.setText("Hodil jsi: " + out);
        hrac4hod.setMouseTransparent(true);
        i++;
        Zvuk();

        switch (kostka4) {
            case 1:
                obraz1.setImage(cislo1);
                break;
            case 2:
                obraz1.setImage(cislo2);
                break;
            case 3:
                obraz1.setImage(cislo3);
                break;
            case 4:
                obraz1.setImage(cislo4);
                break;
            case 5:
                obraz1.setImage(cislo5);
                break;
            case 6:
                obraz1.setImage(cislo6);
                break;
            case 7:
                obraz1.setImage(cislo7);
                break;
            case 8:
                obraz1.setImage(cislo8);
                break;
            case 9:
                obraz1.setImage(cislo9);
                break;
            case 10:
                obraz1.setImage(cislo10);
                break;
            case 11:
                obraz1.setImage(cislo11);
                break;
            case 12:
                obraz1.setImage(cislo12);
                break;
        }

    }
    
    /** 
    *  Metoda která se zavolá když se vybere hra pro 2 hráče. Zneviditelní všechna tlačítka na úvodní straně a zviditelní tlačítka potřebná pro hru 2 hráčů. 
    */
    
    @FXML
    void hrajou2(ActionEvent event) {
        hrac1.setVisible(true);
        hrac2.setVisible(true);
        chybakostky.setVisible(true);
        pocet.setVisible(false);
        hbox.setVisible(false);
        menu.setVisible(true);
        vyhodnotit.setVisible(true);
        napoveda.setVisible(false);
        secist.setVisible(true);
        ab = 1;
    }
    
    /** 
    *  Metoda která se zavolá když se vybere hra pro 3 hráče. Zneviditelní všechna tlačítka na úvodní straně a zviditelní tlačítka potřebná pro hru 3 hráčů. 
    */
    
    @FXML
    void hrajou3(ActionEvent event) {
        hrac1.setVisible(true);
        hrac2.setVisible(true);
        hrac3.setVisible(true);
        chybakostky.setVisible(true);
        pocet.setVisible(false);
        hbox.setVisible(false);
        vyhodnotit.setVisible(true);
        menu.setVisible(true);
        napoveda.setVisible(false);
        secist.setVisible(true);
        ab = 2;
    }
    
    /** 
     *  Metoda která se zavolá když se vybere hra pro 4 hráče. Zneviditelní všechna tlačítka na úvodní straně a zviditelní tlačítka potřebná pro hru 4 hráčů. 
     */
    
    @FXML
    void hrajou4(ActionEvent event) {
        hrac1.setVisible(true);
        hrac2.setVisible(true);
        hrac3.setVisible(true);
        hrac4.setVisible(true);
        chybakostky.setVisible(true);
        pocet.setVisible(false);
        hbox.setVisible(false);
        vyhodnotit.setVisible(true);
        menu.setVisible(true);
        napoveda.setVisible(false);
        secist.setVisible(true);
        ab = 3;
    }
    /**
     * Metoda, která se zavolá, když se hráč chce vrátit zpět na úvodní stranu. Všechna tlačítka se zneviditelní a hodnoty v labelech se vynulují. 
     * A zviditelní se všechna tlačítka, která byla na začátku.
     */
    @FXML
    void menu(ActionEvent event) {
        hrac1.setVisible(false);
        hrac2.setVisible(false);
        hrac3.setVisible(false);
        hrac4.setVisible(false);
        hbox.setVisible(true);
        menu.setVisible(false);
        napoveda.setVisible(true);
        zpet.setVisible(false);
        pocet.setVisible(true);
        chybakostky.setVisible(false);
        vyhodnotit.setVisible(false);
        labelnapoveda.setVisible(false);
        hrac1hod.setMouseTransparent(false);
        hrac2hod.setMouseTransparent(false);
        hrac3hod.setMouseTransparent(false);
        hrac4hod.setMouseTransparent(false);
        celkovacastka.setVisible(false);
        secist.setVisible(false);
        vyhodnotit.setMouseTransparent(true);
        hrac1hod.setMouseTransparent(true);
        hrac2hod.setMouseTransparent(true);
        hrac3hod.setMouseTransparent(true);
        hrac4hod.setMouseTransparent(true);
        hod1.setText("");
        hod2.setText("");
        hod3.setText("");
        hod4.setText("");
        vydelek1.setText("");
        vydelek2.setText("");
        vydelek3.setText("");
        vydelek4.setText("");
        celkovacastka.setText("");
        chybakostky.setText("");
        sazka1.clear();
        sazka2.clear();
        sazka3.clear();
        sazka4.clear();
        vydelekhrace1 = 0;
        vydelekhrace2 = 0;
        vydelekhrace3 = 0;
        vydelekhrace4 = 0;
        i = 0;
        obraz1.setImage(cislo0);
    }
    
    /**
     * Všechna  tlačítka se zneviditelní a ukáže se pouze tlačítko, které hráče vrátí zpět do menu.
     * A ukáže se nápověda.
     */
    
    @FXML
    void napoveda(ActionEvent event) {
        napoveda.setVisible(false);
        zpet.setVisible(true);
        pocet.setVisible(false);
        hbox.setVisible(false);
        labelnapoveda.setVisible(true);
        labelnapoveda.setText("Hra kostky je hra pro 2-4 hráče. \n"
                + "Na začátku kola každý vsadí vlastní částku. \n"
                + "Po té každý hodí kostkami a ten, \n"
                + "který má nejvyšší číslo bere vše.");
    }
    /**
     * Zavolá se při stisknutí tlačítka sečíst sázky.
     * Metoda, která sečte všechny sázky. V metodě se nachází switch který se přepíná podle počtu hráčů (case 1 - 2 hráči, case 2 - 3 hráči, case 3 - 4 hráči).
     * V této metodě je ošetřeno to, že pokud jeden z hráčů nevsadí tak se nemůže pokračovat a také po sečtení sázek se už sázka nedá upravovat.
     */
    @FXML
    void secist(ActionEvent event) {
        i = 0;
        celkovacastka.setVisible(true);

        switch (ab) {
            case 1:

                if (sazka1.getText().isEmpty() || sazka4.getText().isEmpty()) {
                    celkovacastka.setText("Musí vsadit všichni");
                } else {
                    String vs1 = sazka1.getText();
                    String vs4 = sazka4.getText();

                    int v1 = Integer.parseInt(vs1);
                    int v4 = Integer.parseInt(vs4);

                    castka2 = v1 + v4;

                    String vystup = Integer.toString(castka2);
                    celkovacastka.setText(vystup);
                    secist.setMouseTransparent(true);
                    vyhodnotit.setMouseTransparent(false);
                    hrac1hod.setMouseTransparent(false);
                    hrac4hod.setMouseTransparent(false);
                    sazka1.setEditable(false);
                    sazka4.setEditable(false);
                    chybakostky.setText("");
                }
                break;

            case 2:
                if (sazka1.getText().isEmpty() || sazka2.getText().isEmpty() || sazka4.getText().isEmpty()) {
                    celkovacastka.setText("Musí vsadit všichni");
                } else {
                    String vs1 = sazka1.getText();
                    String vs2 = sazka2.getText();
                    String vs4 = sazka4.getText();

                    int v1 = Integer.parseInt(vs1);
                    int v2 = Integer.parseInt(vs2);
                    int v4 = Integer.parseInt(vs4);

                    castka3 = v1 + v2 + v4;

                    String vystup = Integer.toString(castka3);
                    celkovacastka.setText(vystup);
                    secist.setMouseTransparent(true);
                    vyhodnotit.setMouseTransparent(false);
                    hrac1hod.setMouseTransparent(false);
                    hrac2hod.setMouseTransparent(false);
                    hrac4hod.setMouseTransparent(false);
                    sazka1.setEditable(false);
                    sazka4.setEditable(false);
                    sazka2.setEditable(false);
                    chybakostky.setText("");
                }
                break;

            case 3:

                if (sazka1.getText().isEmpty() || sazka2.getText().isEmpty() || sazka3.getText().isEmpty() || sazka4.getText().isEmpty()) {
                    celkovacastka.setText("Musí vsadit všichni");
                } else {
                    String vs1 = sazka1.getText();
                    String vs2 = sazka2.getText();
                    String vs3 = sazka3.getText();
                    String vs4 = sazka4.getText();

                    int v1 = Integer.parseInt(vs1);
                    int v2 = Integer.parseInt(vs2);
                    int v3 = Integer.parseInt(vs3);
                    int v4 = Integer.parseInt(vs4);

                    castka4 = v1 + v2 + v3 + v4;

                    String vystup = Integer.toString(castka4);
                    celkovacastka.setText(vystup);
                    secist.setMouseTransparent(true);
                    vyhodnotit.setMouseTransparent(false);
                    hrac1hod.setMouseTransparent(false);
                    hrac2hod.setMouseTransparent(false);
                    hrac3hod.setMouseTransparent(false);
                    hrac4hod.setMouseTransparent(false);
                    sazka1.setEditable(false);
                    sazka4.setEditable(false);
                    sazka2.setEditable(false);
                    sazka3.setEditable(false);
                    chybakostky.setText("");
                }
                break;
        }

    }
    
    /**
     * Metoda, která vyhodnotí výsledek. Pokud není jednoznačný výsledek, tak každý hráč hodí znovu. 
     * Jinak se na obrazovku vypíše který hráč vyhrává a připíší se mu vydělané peníze. 
     * 
     * Po vyhodnocení se vymažou hodnoty z textových polí a nastaví se na upravitelné.
     */
    
    @FXML
    void vyhodnotit(ActionEvent event) {

        switch (ab) {
            case 1:
                if (i == 2) {
                    if (kostka1 > kostka4) {
                        chybakostky.setText("Vyhrává hráč 1");
                        vydelekhrace1 = vydelekhrace1 + castka2;
                        vydelek1.setText(vydelekhrace1 + " Kč");
                        i = 0;
                        secist.setMouseTransparent(false);
                        sazka1.clear();
                        sazka4.clear();
                        celkovacastka.setText("");
                        hod1.setText("");
                        hod4.setText("");
                        vyhodnotit.setMouseTransparent(true);
                        sazka1.setEditable(true);
                        sazka4.setEditable(true);
                        obraz1.setImage(cislo0);

                    }
                    if (kostka1 < kostka4) {
                        chybakostky.setText("Vyhrává hráč 2");
                        vydelekhrace4 = vydelekhrace4 + castka2;
                        vydelek4.setText(vydelekhrace4 + " Kč");
                        i = 0;
                        secist.setMouseTransparent(false);
                        sazka1.clear();
                        sazka4.clear();
                        celkovacastka.setText("");
                        hod1.setText("");
                        hod4.setText("");
                        vyhodnotit.setMouseTransparent(true);
                        sazka1.setEditable(true);
                        sazka4.setEditable(true);
                        obraz1.setImage(cislo0);
                    }
                    if (kostka1 == kostka4) {
                        i=0;
                        chybakostky.setText("Hoďte znovu");
                        hrac1hod.setMouseTransparent(false);
                        hrac4hod.setMouseTransparent(false);
                    }
                    

                } else {
                    chybakostky.setText("Musí hodit všichni");
                }
                break;
            case 2:
                if (i == 3) {
                    if (kostka1 > kostka4 && kostka1 > kostka2) {
                        chybakostky.setText("Vyhrává hráč 1");
                        i = 0;
                        secist.setMouseTransparent(false);
                        sazka1.setEditable(true);
                        sazka4.setEditable(true);
                        sazka2.setEditable(true);
                        hod1.setText("");
                        hod2.setText("");
                        hod4.setText("");
                        celkovacastka.setText("");
                        sazka1.clear();
                        sazka2.clear();
                        sazka4.clear();
                        vydelekhrace1 = vydelekhrace1 + castka3;
                        vydelek1.setText(vydelekhrace1 + " Kč");
                        obraz1.setImage(cislo0);

                    } else if (kostka2 > kostka1 && kostka2 > kostka4) {
                        chybakostky.setText("Vyhrává hráč 2");
                        i = 0;
                        secist.setMouseTransparent(false);
                        sazka1.setEditable(true);
                        sazka4.setEditable(true);
                        sazka2.setEditable(true);
                        hod1.setText("");
                        hod2.setText("");
                        hod4.setText("");
                        celkovacastka.setText("");
                        sazka1.clear();
                        sazka2.clear();
                        sazka4.clear();
                        vydelekhrace2 = vydelekhrace2 + castka3;
                        vydelek2.setText(vydelekhrace2 + " Kč");
                        obraz1.setImage(cislo0);
                    } else if (kostka4 > kostka1 && kostka4 > kostka2) {
                        chybakostky.setText("Vyhrává hráč 3");
                        i = 0;
                        secist.setMouseTransparent(false);
                        sazka1.setEditable(true);
                        sazka4.setEditable(true);
                        sazka2.setEditable(true);
                        hod1.setText("");
                        hod2.setText("");
                        hod4.setText("");
                        celkovacastka.setText("");
                        sazka1.clear();
                        sazka2.clear();
                        sazka4.clear();
                        vydelekhrace4 = vydelekhrace4 + castka4;
                        vydelek4.setText(vydelekhrace4 + " Kč");
                        obraz1.setImage(cislo0);
                    } else {
                        chybakostky.setText("Hoďte znovu");
                        i = 0;
                        hrac1hod.setMouseTransparent(false);
                        hrac2hod.setMouseTransparent(false);
                        hrac4hod.setMouseTransparent(false);

                    }
                } else {
                    chybakostky.setText("Musí hodit všichni");
                }
                break;
            case 3:
                if (i == 4) {
                    if (kostka1 > kostka2 && kostka1 > kostka3 && kostka1 > kostka4) {
                        chybakostky.setText("Vyhrává hráč 1");
                        i = 0;
                        secist.setMouseTransparent(false);
                        sazka1.setEditable(true);
                        sazka4.setEditable(true);
                        sazka2.setEditable(true);
                        sazka3.setEditable(true);
                        hod3.setText("");
                        hod1.setText("");
                        hod2.setText("");
                        hod4.setText("");
                        celkovacastka.setText("");
                        sazka1.clear();
                        sazka2.clear();
                        sazka4.clear();
                        sazka3.clear();
                        vydelekhrace1 = vydelekhrace1 + castka4;
                        vydelek1.setText(vydelekhrace1 + " Kč");
                        obraz1.setImage(cislo0);
                    } else if (kostka2 > kostka1 && kostka2 > kostka3 && kostka2 > kostka4) {
                        chybakostky.setText("Vyhrává hráč 2");
                        i = 0;
                        secist.setMouseTransparent(false);
                        sazka1.setEditable(true);
                        sazka4.setEditable(true);
                        sazka2.setEditable(true);
                        sazka3.setEditable(true);
                        hod3.setText("");
                        hod1.setText("");
                        hod2.setText("");
                        hod4.setText("");
                        celkovacastka.setText("");
                        sazka1.clear();
                        sazka2.clear();
                        sazka4.clear();
                        sazka3.clear();
                        vydelekhrace2 = vydelekhrace2 + castka4;
                        vydelek2.setText(vydelekhrace2 + " Kč");
                        obraz1.setImage(cislo0);
                    } else if (kostka3 > kostka4 && kostka3 > kostka2 && kostka3 > kostka1) {
                        chybakostky.setText("Vyhrává hráč 3");
                        i = 0;
                        secist.setMouseTransparent(false);
                        sazka1.setEditable(true);
                        sazka4.setEditable(true);
                        sazka2.setEditable(true);
                        sazka3.setEditable(true);
                        hod3.setText("");
                        hod1.setText("");
                        hod2.setText("");
                        hod4.setText("");
                        celkovacastka.setText("");
                        sazka1.clear();
                        sazka2.clear();
                        sazka4.clear();
                        sazka3.clear();
                        vydelekhrace3 = vydelekhrace3 + castka4;
                        vydelek3.setText(vydelekhrace3 + " Kč");
                        obraz1.setImage(cislo0);
                    } else if (kostka4 > kostka1 && kostka4 > kostka2 && kostka4 > kostka3) {
                        chybakostky.setText("Vyhrává hráč 4");
                        i = 0;
                        secist.setMouseTransparent(false);
                        sazka1.setEditable(true);
                        sazka4.setEditable(true);
                        sazka2.setEditable(true);
                        sazka3.setEditable(true);
                        hod3.setText("");
                        hod1.setText("");
                        hod2.setText("");
                        hod4.setText("");
                        celkovacastka.setText("");
                        sazka1.clear();
                        sazka2.clear();
                        sazka4.clear();
                        sazka3.clear();
                        vydelekhrace4 = vydelekhrace4 + castka4;
                        vydelek4.setText(vydelekhrace4 + " Kč");
                        obraz1.setImage(cislo0);
                    } else {
                        chybakostky.setText("Hoďte znovu");
                        i = 0;
                        hrac1hod.setMouseTransparent(false);
                        hrac2hod.setMouseTransparent(false);
                        hrac3hod.setMouseTransparent(false);
                        hrac4hod.setMouseTransparent(false);

                    }
                } else {
                    chybakostky.setText("Musí hodit všichni");
                }
                break;
        }
    }

    Media me;
    MediaPlayer mp;
    
    /**
     * Metoda, která přehraje zvuk.
     */
    
    void Zvuk() {
        String path = new File("src\\kostky\\hod.mp3").getAbsolutePath();
        me = new Media(new File(path).toURI().toString());
        mp = new MediaPlayer(me); // vytvoří se MediaPlayer který přehraje me.
        mp.play(); // MediaPlayer mp se spustí.
    }
}
