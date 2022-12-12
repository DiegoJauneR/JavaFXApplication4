/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controller;

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
import javafx.stage.Stage;
import Model.Main;
import javafx.event.Event;
import javafx.event.EventTarget;
import javafx.scene.layout.GridPane;
import Model.Sala;
import Controller.Metodos;
/**
 * FXML Controller class
 *
 * @author sebaa
 */
public class SalasController implements Initializable {

    @FXML
    private Button btVermut;
    @FXML
    private Button btMatine;
    @FXML
    private Button btAtrasAsientos;
    @FXML
    private Button btVespertino;
    @FXML
    private Button btComprar;
    private Main cambioE = new Main();
    private Metodos metodos = new Metodos();
    
    private Sala metodosSala = new Sala();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    

    @FXML
    private void handleBtVermutAction(ActionEvent event) {
        metodos.salaHorarioYAsientos(1);
    }

    @FXML
    private void handleBtMatineAction(ActionEvent event) {
        metodos.salaHorarioYAsientos(0);
    }
    
    @FXML
    private void handleBtVespertinoAction(ActionEvent event) {
        metodos.salaHorarioYAsientos(2);
    }
    
    @FXML
    private void handleBtAtrasAsientosAction(ActionEvent event) throws IOException {
        cambioE.cambioEscena(event,"/View/interfazCatalogo.fxml");
    }

    

    @FXML
    private void handleBtComprarAction(ActionEvent event) throws IOException {
        cambioE.cambioEscena(event,"/View/interfazBoleta.fxml");
    }

    @FXML
    private void handleAsientosAction(ActionEvent event) {
        Node node = (Node) event.getTarget();
        System.out.println(node);
        int x = GridPane.getRowIndex(node) == null ? 0 : GridPane.getRowIndex(node);
        int y = GridPane.getColumnIndex(node) == null ? 0 : GridPane.getColumnIndex(node);
        metodosSala.asignarXeY(x, y);
        metodosSala.seleccionarAsientos();
        
    }
    
    
}
