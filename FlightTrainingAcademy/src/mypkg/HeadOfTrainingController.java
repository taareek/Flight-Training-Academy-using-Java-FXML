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
public class HeadOfTrainingController implements Initializable {

    @FXML
    private Button buildTrainingProgramButton;
    @FXML
    private Button stdprogressAndFeedbackButton;
    @FXML
    private Button ensureSecuirityButton;
    @FXML
    private Button evaluateFacultyButton;
    @FXML
    private Button flightScheduleButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    



    @FXML
    private void buildTrainingProgramButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("BuildTrainingProgram.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void stdprogressAndFeedbackButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("StudentsTrainingProgress.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void ensureSecuirityButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("EnsureSecuirity.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void evaluateFacultyButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("InstructorPerformance.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void flightScheduleButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("SetAndCheckAllFlightSchedule.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void backToHomeOnAction(ActionEvent event) throws IOException {
        Parent tableViewParent  = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene tableViewScene  = new Scene(tableViewParent);
        //This line gets the stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }
    
}
