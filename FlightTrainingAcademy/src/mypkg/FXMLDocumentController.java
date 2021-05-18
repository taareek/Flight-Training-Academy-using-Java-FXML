/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypkg;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SURFACE
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private RadioButton studentRadioButton;
    @FXML
    private RadioButton flightInstructorRadioButton;
    @FXML
    private RadioButton headOfTrainingRadioButton;
    @FXML
    private RadioButton aircraftMaintenanceEngineerRadioButton;
    @FXML
    private RadioButton adminRadioButton;
    @FXML
    private Label userTypeLabelButton;
    @FXML
    private TextField userIdText;
    @FXML
    private TextField userPasswordText;
    @FXML
    private Button logInButtonOnClick;
    @FXML
    private Button goToregisterButton;
    @FXML
    private Label errorLabel;
    private ToggleGroup tg;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        // Configuring users radio button
        tg = new ToggleGroup();
        this.studentRadioButton.setToggleGroup(tg);
        this.flightInstructorRadioButton.setToggleGroup(tg);
        this.headOfTrainingRadioButton.setToggleGroup(tg);
        this.aircraftMaintenanceEngineerRadioButton.setToggleGroup(tg);
        this.adminRadioButton.setToggleGroup(tg);
    }    

    @FXML
    private void userRadioButtonOnAction(ActionEvent event) {
        if(this.tg.getSelectedToggle().equals(this.studentRadioButton))
            userTypeLabelButton.setText("You have selected user type \nas Student.");
             
        if(this.tg.getSelectedToggle().equals(this.flightInstructorRadioButton))
            userTypeLabelButton.setText("You have selected user type as \nFlight Instructor.");
        if(this.tg.getSelectedToggle().equals(this.headOfTrainingRadioButton))
            userTypeLabelButton.setText("You have selected user type as \nHead Of Training.");
        if(this.tg.getSelectedToggle().equals(this.aircraftMaintenanceEngineerRadioButton))
            userTypeLabelButton.setText("You have selected user type as \nAircraft Maintenance Engineer.");
        if(this.tg.getSelectedToggle().equals(this.adminRadioButton))
            userTypeLabelButton.setText("You have selected user type as \nAdmin and Accounts.");
    }

    @FXML
    private void logInButtonOnClickOnAction(ActionEvent event) throws IOException {
        if(this.tg.getSelectedToggle().equals(this.studentRadioButton)){
            Parent newParent  = FXMLLoader.load(getClass().getResource("Student.fxml"));
            Scene newParentScene  = new Scene(newParent);
            //This line gets the stage information
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(newParentScene);
            window.show();
        }
        if(this.tg.getSelectedToggle().equals(this.flightInstructorRadioButton)){
            Parent newParent  = FXMLLoader.load(getClass().getResource("Instructor.fxml"));
            Scene newParentScene  = new Scene(newParent);
            //This line gets the stage information
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(newParentScene);
            window.show();
        }
        if(this.tg.getSelectedToggle().equals(this.headOfTrainingRadioButton)){
            Parent newParent  = FXMLLoader.load(getClass().getResource("HeadOfTraining.fxml"));
            Scene newParentScene  = new Scene(newParent);
            //This line gets the stage information
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(newParentScene);
            window.show();
        }
        if(this.tg.getSelectedToggle().equals(this.aircraftMaintenanceEngineerRadioButton)){
            Parent newParent  = FXMLLoader.load(getClass().getResource("AircraftMaintenanceEngineer.fxml"));
            Scene newParentScene  = new Scene(newParent);
            //This line gets the stage information
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(newParentScene);
            window.show();
        }
        if(this.tg.getSelectedToggle().equals(this.adminRadioButton)){
            Parent newParent  = FXMLLoader.load(getClass().getResource("AccountsAndAdmin.fxml"));
            Scene newParentScene  = new Scene(newParent);
            //This line gets the stage information
            Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
            window.setScene(newParentScene);
            window.show(); 
        }
    }

    @FXML
    private void goToRegisterButtonOnAction(ActionEvent event) throws IOException {
        Parent tableViewParent  = FXMLLoader.load(getClass().getResource("RegisterNewUser.fxml"));
        Scene tableViewScene  = new Scene(tableViewParent);
        //This line gets the stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private void errorLabelOnAction(MouseEvent event) {
    }
    
}
