 
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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class SetScheduleController implements Initializable {

    @FXML
    private Button examScheduleButton;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private TextField examDateTextField;
    @FXML
    private TextField examDayTextField;
    @FXML
    private TextField examTimeTextField;
    @FXML
    private TextField classDateTextField;
    @FXML
    private TextField classDayTextField;
    @FXML
    private TextField classTimeTExtField;
    @FXML
    private Button examScheduleButton1;
    @FXML
    private Button logOutButton;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
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
    private void examScheduleButtonOnAction(ActionEvent event) {
    }


    @FXML
    private void comboBoxOnAction(ActionEvent event) {
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        logOutButton.getScene().getWindow().hide();
    }
    
}
