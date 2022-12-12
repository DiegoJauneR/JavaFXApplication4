
package Controller;

import Model.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class IngresosController implements Initializable {
    private Main cambioE = new Main();
    @FXML
    private Button btPeli1;
    @FXML
    private Button btPeli2;
    @FXML
    private Button btPeli3;
    @FXML
    private Button btAtrasIng;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void handleBtAtrasIngAction(ActionEvent event) throws IOException {
        cambioE.cambioEscena(event, "/View/interfazPrincipal.fxml");
    }


    @FXML
    private void handleBtPeli1Action(ActionEvent event) {
    }

    @FXML
    private void handleBtPeli2Action(ActionEvent event) {
    }

    @FXML
    private void handleBtPeli3Action(ActionEvent event) {
    }

    
}
