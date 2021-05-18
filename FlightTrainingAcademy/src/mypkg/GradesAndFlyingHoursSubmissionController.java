 
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
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

 
public class GradesAndFlyingHoursSubmissionController implements Initializable {

    @FXML
    private Button courseGradeSubmitButton;
    @FXML
    private Button flyingGradeSubmitButton;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Button logOutButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void courseGradeSubmitButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void flyingGradeSubmitButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void goBackToMainSceneOnClick(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("Instructor.fxml"));
        Scene newParentScene  = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void comboBoxOnAction(ActionEvent event) {
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        logOutButton.getScene().getWindow().hide();
    }
    
}
