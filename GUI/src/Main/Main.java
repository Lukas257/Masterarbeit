package Main;


import MainWindow.MainWindowController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    //NEU
    @FXML
    private BorderPane root;

    Stage window;



    /*

    ALTER CODE, FUNKTIONIERT

    @Override
    public void start(Stage MainWindow) throws IOException {


        Parent root = FXMLLoader.load(getClass().getResource("../MainWindow/MainWindow.fxml"));
        MainWindow.setTitle("Brandschutznachweis nach DIN 18230");
        MainWindow.setScene(new Scene(root, 1200, 800));
        MainWindow.show();



    }
    */

    //NEU
    @Override
    public void start(Stage primaryStage) throws IOException {
        window = primaryStage;
        FXMLLoader loader = new FXMLLoader(Main.class.getResource("/MainWindow/MainWindow.fxml"));
        this.root = loader.load();

        MainWindowController mwc = loader.getController();
        mwc.setMain(this);

        Scene scene = new Scene(root);
        window.setTitle("Brandschutznachweis nach DIN 18230");
        window.setScene(scene);
        window.show();
    }


    public static void main(String[] args) { launch(args); }



    public BorderPane getBorderPane() {
        return root;
    }
}