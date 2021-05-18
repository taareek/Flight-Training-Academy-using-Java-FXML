 
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

 
public class StatusOfAircraftController implements Initializable {

    @FXML
    private TextField modelNameTextField;
    @FXML
    private TextField aircraftNameTextField;
    @FXML
    private TextField readyToFlyTextField;
    @FXML
    private TextField NeedToMaintenance;
    @FXML
    private Button logOutButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void addToStatusButtonOnAction(ActionEvent event) {
    }

    @FXML
    private void goBackToMainSceneOnClick(ActionEvent event) throws IOException {
        Parent newParent = FXMLLoader.load(getClass().getResource("AircraftMaintenanceEngineer.fxml"));
        Scene newParentScene = new Scene(newParent);
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(newParentScene);
        window.show();
    }


    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        logOutButton.getScene().getWindow().hide();
    }

    @FXML
    private void changeReadyToFlyCellEvent(TableColumn.CellEditEvent<String, String> event) {
    }

    @FXML
    private void changeNeedToMaintenanceCellEvent(TableColumn.CellEditEvent<String, String> event) {
    }
    
}
