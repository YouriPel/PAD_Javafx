/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodsmash;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Bob
 */
public class TestFXMLController implements Initializable {

    @FXML
    public Button button;
    public Label label;
    
    public int counter = 1;
    
    public void clickButton(ActionEvent event) {
        if(counter == 1) {
            label.setText("Start");
            counter = 0;
        } else {
            label.setText("Stop");
            counter = 1;
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
