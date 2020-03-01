package MainWindow;




import Beteiligte_1_2.Beteiligte_1_2Controller;
import Main.Main;
import NeuesProjekt_1_1.NeuesProjekt_1_1Controller;
import StartScreen.StartScreenController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


import java.io.IOException;


public class MainWindowController {

    //NEU
    private Main main;


    //BorderPane des gesamten Fensters
    //NEU: in root umbenannt
    @FXML
    private BorderPane root;

    // AnchorPane im Center der BorderPane
    @FXML
    private AnchorPane anc_pane_MainWindow;

    @FXML
    private Button btn_1_1_NeuesProjekt;

    @FXML
    private Button btn_1_2_Beteiligte;

    @FXML
    private Button btn_2_1_BrandschutztechnischeInfrastruktur;

    @FXML
    private Button btn_2_2_Oeffnungen;



    //NEU
    public void setMain(Main main) {
        this.main = main;
    }

    //TitPane1 gedückt -> StartScreen wird angezeigt
    public void titPane1Push() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/StartScreen/StartScreen.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();

        StartScreenController ssc = loader.getController();
        ssc.setMain(main);

        main.getBorderPane().setCenter(pane);
    }

    // Button 1.1 Neues Projekt wird geklickt
    public void btn1_1_NeuesProjektPush() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/NeuesProjekt_1_1/NeuesProjekt_1_1.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();

        NeuesProjekt_1_1Controller npc = loader.getController();
        npc.setMain(main);

        main.getBorderPane().setCenter(pane);
    }


    //Button 1.2 Beteiligte wird gedrückt
    public void btn1_2_BeteiligtePush() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Beteiligte_1_2/Beteiligte_1_2.fxml"));
        AnchorPane pane = (AnchorPane) loader.load();

        Beteiligte_1_2Controller btc = loader.getController();
        btc.setMain(main);

        main.getBorderPane().setCenter(pane);
    }

}

    /*

    ALTER CODE, FUNKTIONIERT

    //wechsel zu Ansicht: 1.1 Neues Projekt
    @FXML
    public void btn1_1_NeuesProjektPush(ActionEvent event) throws IOException {


        Parent neuesProjekt_1_1Parent = FXMLLoader.load(getClass().getResource("/NeuesProjekt_1_1/NeuesProjekt_1_1_Test.fxml"));
        Scene neuesProjekt_1_1Scene = new Scene(neuesProjekt_1_1Parent);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

        window.setScene(neuesProjekt_1_1Scene);
        window.show();

        //System.out.println("Hallo Welt!");


    }

    */



