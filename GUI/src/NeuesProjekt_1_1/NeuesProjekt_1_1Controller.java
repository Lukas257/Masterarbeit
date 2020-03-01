package NeuesProjekt_1_1;

import CreatePDF.ErstellePDF;
import Main.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class NeuesProjekt_1_1Controller implements Initializable{


    Main main;
    public void setMain(Main main) {
        this.main = main;
    }


    //AnchorPane in der Mitte der BorderPane, zum Austausch durch ButtonKlick
    @FXML
    private AnchorPane anc_pane_1_1_NeuesProjekt;

    @FXML
    private TextField txtfield_Projektbezeichnung;

    @FXML
    private TextField txtfield_Projektnummer;

    @FXML
    private TextField txtfield_Datum;

    @FXML
    private TextArea txtarea_Projektbeschreibung;

    @FXML
    private Button btn_anlegen;

    @FXML
    private Button btn_erstellePDF;

//______________________________________________________________________________________________________________________


    //Getters für die Eingabe
    public String getProjektbezeichnung() {
        return txtfield_Projektbezeichnung.getText().toString();
    }

    public String getProjektnummer() {
        return this.txtfield_Projektnummer.getText().toString();
    }

    public String getDatum() {
        return this.txtfield_Datum.getText().toString();
    }

    public String getProjektbeschreibung() {
        return this.txtarea_Projektbeschreibung.getText().toString();
    }

    
    /**
     * zum testen, liefert die eingegebenen Daten in der Ausgabe
     *
     * funktioniert
     *
     * @throws IOException
     */
    public void btn_anlegenPush() throws IOException {

        System.out.println("btn anlegenPush wird ausgeführt");
        System.out.println(getProjektbezeichnung());
        System.out.println(getProjektnummer());
        System.out.println(getDatum());
        System.out.println(getProjektbeschreibung());
    }

    /**
     * soll die entsprechende PDF-Datei erstellen
     * mit den, im Fenster, eingegebenen Daten
     */
    public void btn_erstellePDFPush() throws IOException{
        System.out.println("erstellepdf wurde gedrückt");

        ErstellePDF erstellePDF = new ErstellePDF(this);
        System.out.println("neues Objekt der Klasse ErstellePDF wurde erstellt");
        erstellePDF.erstelleDatei();
        System.out.println("PDF Datei wurde erstellt");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }

}