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
public class AircraftMaintenanceEngineerController implements Initializable {

    @FXML
    private Button performanceReportButton;
    @FXML
    private Button statusOfAirCraftButton;
    @FXML
    private Button troubleshootButton;
    @FXML
    private Button orderPartsButton;
    @FXML
    private Button ideasButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void performanceReportButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("AircraftPerformanceReport.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void statusOfAirCraftButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("StatusOfAircraft.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void troubleshootButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("AircraftTroubleShoot.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void orderPartsButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("OrderParts.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void ideasButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("AircraftEngineerIdeas.fxml"));
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
