 
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
import javafx.scene.control.TableView;
import javafx.stage.Stage;

 
public class ProgramHistoryController implements Initializable {

    @FXML
    private TableView<String> attendanceTableView;
    @FXML
    private TableView<String> gradeHistoryTableView;
    @FXML
    private TableColumn<?, ?> attendanceCourseIdCol;
    @FXML
    private TableColumn<?, ?> attCourseNameColumn;
    @FXML
    private TableColumn<?, ?> attendanceColumn;
    @FXML
    private TableColumn<?, ?> gradesCourseIdCol;
    @FXML
    private TableColumn<?, ?> gradesCourseNameCol;
    @FXML
    private TableColumn<?, ?> gradesCol;
    @FXML
    private Button logOutButton;
 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void goBackToMainSceneOnClick(ActionEvent event) throws IOException {
        Parent newParent  = FXMLLoader.load(getClass().getResource("Student.fxml"));
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
