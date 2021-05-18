
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

public class StudentController implements Initializable {

    @FXML
    private Button programHistoryButton;
    @FXML
    private Button FlyingHoursHistoryButton;
    @FXML
    private Button CourseMaterialButton;
    @FXML
    private Button instructorEvalationButton;
    @FXML
    private Button reportsButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void programHistoryButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("ProgramHistory.fxml"));
        Scene newParentScene  = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }
    @FXML
    private void FlyingHoursHistoryButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("FlyingHoursHistory.fxml"));
        Scene newParentScene  = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
        
    }
    @FXML
    private void CourseMaterialButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("CourseMaterialAccess.fxml"));
        Scene newParentScene  = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void instructorEvalationButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("InstructorEvaluation.fxml"));
        Scene newParentScene  = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void reportsButtonOnAction(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("ViewReports.fxml"));
        Scene newParentScene  = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void backMainOnClick(ActionEvent event) throws IOException {
        Parent tableViewParent  = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene tableViewScene  = new Scene(tableViewParent);
        //This line gets the stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    
    
}
