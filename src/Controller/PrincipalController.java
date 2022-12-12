package Controller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
import Model.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 *
 * @author david
 */
public class PrincipalController implements Initializable {

    
    private Main cambioE = new Main();
    @FXML
    private Button btIngresos;
    @FXML
    private Button btCatalogo;
    @FXML
    private Button btSalir;
    
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void handleBtIngresosAction(ActionEvent event) throws IOException {
        cambioE.cambioEscena(event, "/View/interfazIngresos.fxml");
    }

    @FXML
    private void handleBtCatalogoAction(ActionEvent event) throws IOException {
        cambioE.cambioEscena(event, "/View/interfazCatalogo.fxml");
    }

    @FXML
    private void handleBtSalirAction(ActionEvent event) {
       Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
       stage.close();
    }

    

}
