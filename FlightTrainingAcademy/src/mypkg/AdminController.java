/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

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

/**
 * FXML Controller class
 *
 * @author SURFACE
 */
public class AdminController implements Initializable {

    @FXML
    private Button financialrecordButton;
    @FXML
    private Button salaryInformationButton;
    @FXML
    private Button fundButton;
    @FXML
    private Button dataEntryButton;
    @FXML
    private Button occesionalProgramButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void financialrecordButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("FinancialRecords.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }
    

    @FXML
    private void salaryInformationButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("SalaryInformation.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();

    }

    @FXML
    private void fundButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("Fund.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void dataEntryButtonOnaction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("DataEntry.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void occesionalProgramButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("OccesionalProgram.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void backtoHomeOnAction(ActionEvent event) throws IOException {
        Parent tableViewParent  = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene tableViewScene  = new Scene(tableViewParent);
        //This line gets the stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
    
    
}
