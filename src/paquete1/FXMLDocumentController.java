/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

/**
 *
 * @author usuario
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    public Button btn_salir;
    public javafx.scene.control.TextField fld_nombre;
    public javafx.scene.control.TextField fld_apellido;
    public javafx.scene.control.TextField fld_telefono;
    public javafx.scene.control.TextField fld_email;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fld_nombre.setDisable(true);
        fld_apellido.setDisable(true);
        fld_telefono.setDisable(true);
        fld_email.setDisable(true);
        
        
    }    
    
    @FXML
    private void handleButtonSalir(ActionEvent event) {
        Platform.exit();
        
    }
    @FXML
    private void handleButtonNuevo(ActionEvent event) {
        fld_nombre.setDisable(true);
    }
}
