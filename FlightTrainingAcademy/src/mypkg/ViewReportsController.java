 
package mypkg;

import java.io.File;
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
import javafx.stage.FileChooser;
import javafx.stage.Stage;
 
public class ViewReportsController implements Initializable {

    @FXML
    private Button BillpaperButton;
    @FXML
    private Button TranscriptButton;
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
    private void downloadBillPaperButtonOnClick(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File f = fc.showSaveDialog(null);
        System.out.println("Edited Content will be written in: "+f.getAbsolutePath());
    }

    @FXML
    private void downloadTranscriptButtonOnClick(ActionEvent event) {
        FileChooser fc = new FileChooser();
        File f = fc.showSaveDialog(null);
        System.out.println("Edited Content will be written in: "+f.getAbsolutePath());
    }

    @FXML
    private void logOutButtonOnClick(ActionEvent event) {
        logOutButton.getScene().getWindow().hide();
    }
    
}
