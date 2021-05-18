 
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

 
public class DataEntryController implements Initializable {

    @FXML
    private TextField designationTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField idTextField;
    @FXML
    private TextField salaryTextField;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Button logOutBtn;

     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        comboBox.getItems().addAll("Student", "Employee");
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
    private void coboBoxOnAction(ActionEvent event) {
    }

    @FXML
    private void submitButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        logOutBtn.getScene().getWindow().hide();
    }
    
}
