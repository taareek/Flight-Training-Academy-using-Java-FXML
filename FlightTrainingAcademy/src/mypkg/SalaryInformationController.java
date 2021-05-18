 
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

 
public class SalaryInformationController implements Initializable {

    @FXML
    private TableColumn<String, String> employeeNameColumn;
    @FXML
    private TableColumn<String, String> designationColumn;
    @FXML
    private TableColumn<String, String> jobStatusColumn;
    @FXML
    private TableColumn<Float, Float> slaryColumn;
    @FXML
    private TextField newSalaryTextField;
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
    private void updateSalaryOnAction(ActionEvent event) {
    }


    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        logOutButton.getScene().getWindow().hide();
    }

    @FXML
    private void changeSalaryCellEvent(TableColumn.CellEditEvent<String, String> event) {
    }
    
}
