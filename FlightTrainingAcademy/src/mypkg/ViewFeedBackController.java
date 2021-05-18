 
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
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SURFACE
 */
public class ViewFeedBackController implements Initializable {

    @FXML
    private Button feedbackFromStudentsButton;
    @FXML
    private Button feedbackFromAcademyButton;
    @FXML
    private TextArea studentsFeedBackkTextArea;
    @FXML
    private TextArea academyFeedBackTextArea;
    @FXML
    private Button logOutButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void feedbackFromStudentsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void feedbackFromAcademyButtonOnAction(ActionEvent event) {
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
    private void logOutButtonOnClick(ActionEvent event) {
        logOutButton.getScene().getWindow().hide();
    }
    
}
