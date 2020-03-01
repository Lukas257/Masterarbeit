package StartScreen;

import Main.Main;
import MainWindow.MainWindowController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

public class StartScreenController implements Initializable{

    Main main;

    @FXML
    private AnchorPane anc_pane_StartScreen;

    public void setMain(Main main) {
        this.main = main;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //TODO
    }

}
