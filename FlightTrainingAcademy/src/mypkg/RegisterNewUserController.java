 
package mypkg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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

 
public class RegisterNewUserController implements Initializable {

    @FXML
    private TextField createIdTextField;
    @FXML
    private TextField createPasswordTextField;
    @FXML
    private Button newRegisterButton;
    @FXML
    private Button goBackHomeButton;
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private Label outputLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Configuring combo box
        comboBox.getItems().add("Student");
        comboBox.getItems().addAll("Flight Instructor","Head Of Training","Aircraft Maintenance Engineer","Accounts and Admin");
        comboBox.setValue("");
    }    

    @FXML
    private void newRegisterButtonOnAction(ActionEvent event) {
        File userFile = null;
        FileWriter fw = null;
        String userId = createIdTextField.getText();
        try{
            userFile = new File("UsersLogin.txt");
            if(userFile.exists())
                fw = new FileWriter(userFile,true);
            else 
                fw = new FileWriter(userFile);
            Scanner sc = new Scanner(userFile);
            String str;
            String [] users;
            boolean userExists = false;
            //Check if user exist or not
            if(userFile.exists()){                          
                while(sc.hasNextLine()){
                    str = sc.nextLine();
                    users = str.split(",");
                    if(users[0].equals(userId)){
                        userExists = true;
                        outputLabel.setText("This user is already exists.");
                        break;
                    }
                }
                if(userExists == false){
                    fw.write(createIdTextField.getText()+"," + createPasswordTextField.getText() + "," + comboBox.getValue() +"\n");
                    outputLabel.setText("You are registered.");
                }
                
            }
            //For writing a new userFile
            else{
                fw.write(createIdTextField.getText()+"," + createPasswordTextField.getText() + "," + comboBox.getValue() +"\n");
                outputLabel.setText("You are registered.");
            }
            
            
        }
        catch (IOException ex) {
            Logger.getLogger(RegisterNewUserController.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                Logger.getLogger(RegisterNewUserController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @FXML
    private void goBackHomeButtonOnAction(ActionEvent event) throws IOException {
        Parent tableViewParent  = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene tableViewScene  = new Scene(tableViewParent);
        //This line gets the stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();
    }

    @FXML
    private void comboBoxOnAction(ActionEvent event) {
    }
    
}
