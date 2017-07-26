/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vk7.pkg5;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Qnaerhi
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextArea docArea;
    @FXML
    private TextField fileNameField;
    @FXML
    private Button saveButton;
    @FXML
    private Button loadButton;
    
    @FXML
    private void saveButtonPress(ActionEvent event) throws IOException {
        String filename = fileNameField.getText();
        fileIO file= new fileIO(filename);
        file.writeText(docArea.getText());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void loadButtonPress(ActionEvent event) throws IOException {
        String filename = fileNameField.getText();
        fileIO file= new fileIO(filename);
        docArea.setText(file.readText());
    }
    
}
