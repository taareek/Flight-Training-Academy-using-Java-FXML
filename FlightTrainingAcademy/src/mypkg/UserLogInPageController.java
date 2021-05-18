 
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

 
public class UserLogInPageController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField passwordTextField;
    @FXML
    private Button userLogInButton;
    @FXML
    private Button backToHomeButton;
    @FXML
    private ComboBox comboBox;
    
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Configuring combo box
        comboBox.getItems().add("Student");
        comboBox.getItems().addAll("Flight Instructor","Head Of Training","Aircraft Maintenance Engineer","Accounts and Admin");
        comboBox.setValue("");
    }    

    @FXML
    private void userLogInButtonOnAction(ActionEvent event) throws IOException {
          if(comboBox.getValue().equals("Student")){
              Parent tableViewParent  = FXMLLoader.load(getClass().getResource("Student.fxml"));
              Scene tableViewScene  = new Scene(tableViewParent);
              Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
              window.setScene(tableViewScene);
              window.show();
          }
          if(comboBox.getValue().equals("Flight Instructor")){
              Parent tableViewParent  = FXMLLoader.load(getClass().getResource("Instructor.fxml"));
              Scene tableViewScene  = new Scene(tableViewParent);
              Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
              window.setScene(tableViewScene);
              window.show();
          }
          if(comboBox.getValue().equals("Head Of Training")){
              Parent tableViewParent  = FXMLLoader.load(getClass().getResource("HeadOfTraining.fxml"));
              Scene tableViewScene  = new Scene(tableViewParent);
              Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
              window.setScene(tableViewScene);
              window.show();
          }
          if(comboBox.getValue().equals("Aircraft Maintenance Engineer")){
              Parent tableViewParent  = FXMLLoader.load(getClass().getResource("AircraftMaintenanceEngineer.fxml"));
              Scene tableViewScene  = new Scene(tableViewParent);
              Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
              window.setScene(tableViewScene);
              window.show();
          }
          if(comboBox.getValue().equals("Accounts and Admin")){
              Parent tableViewParent  = FXMLLoader.load(getClass().getResource("AccountsAndAdmin.fxml"));
              Scene tableViewScene  = new Scene(tableViewParent);
              Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
              window.setScene(tableViewScene);
              window.show();
          }
          
    }

    @FXML
    private void backToHomeButtonOnAction(ActionEvent event) throws IOException {
        Parent tableViewParent  = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene tableViewScene  = new Scene(tableViewParent);
        //This line gets the stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private void comboBoxOnActon(ActionEvent event) {
    }
    
}
