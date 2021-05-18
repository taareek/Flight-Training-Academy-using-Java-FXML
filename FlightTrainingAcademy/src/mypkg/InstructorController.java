 
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

 
public class InstructorController implements Initializable {

    @FXML
    private Button takeAttendanceButton;
    @FXML
    private Button gradesAndFlyingHoursButton;
    @FXML
    private Button provideCourseMaterialButton;
    @FXML
    private Button setScheduleButton;
    @FXML
    private Button viewFeedbackButton;

     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void takeAttendanceButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("TakeAttendance.fxml"));
        Scene newParentScene  = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void gradesAndFlyingHoursButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("GradesAndFlyingHoursSubmission.fxml"));
        Scene newParentScene  = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void provideCourseMaterialButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("ProvideCourseMaterial.fxml"));
        Scene newParentScene  = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void setScheduleButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("SetSchedule.fxml"));
        Scene newParentScene  = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void viewFeedbackButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("ViewFeedBack.fxml"));
        Scene newParentScene  = new Scene(newParent);
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
