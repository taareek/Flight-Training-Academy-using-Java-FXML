 
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

 
public class OccesionalProgramController implements Initializable {

    @FXML
    private TextField programNameTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private DatePicker dayDatePicker;
    @FXML
    private Button logOutButton;

     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackToMainSceneOnClick(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("AccountsAndAdmin.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }

    @FXML
    private void setProgramOnAction(ActionEvent event) {
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        logOutButton.getScene().getWindow().hide();
    }
    
}
