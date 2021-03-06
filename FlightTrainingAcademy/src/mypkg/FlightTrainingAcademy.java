 
package mypkg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Md. Tarek Aziz
 */
public class FlightTrainingAcademy extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Flight Training Academy");
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
    
}
