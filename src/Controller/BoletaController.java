/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

import Model.Main;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author sebaa
 */
public class BoletaController implements Initializable {
    
    private Main cambioE = new Main();
    @FXML
    private Button btAtrasBoleta;
    @FXML
    private Button btImprimir;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleBtAtrasBoletaAction(ActionEvent event) throws IOException {
        cambioE.cambioEscena(event, "/View/interfazSalas.fxml");
    }

    @FXML
    private void handleBtImprimirAction(ActionEvent event) throws IOException {
        JOptionPane.showMessageDialog(null, "IMPRIMIDO");
        cambioE.cambioEscena(event, "/View/interfazPrincipal.fxml");
    }
    
}
