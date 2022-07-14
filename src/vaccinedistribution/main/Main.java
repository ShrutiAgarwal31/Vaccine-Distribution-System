package vaccinedistribution.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.image.Image;
import javafx.stage.*;
import vaccinedistribution.database.ConnectDB;

public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        ConnectDB.createConnection();
        Parent root = FXMLLoader.load(getClass().getResource("/vaccinedistribution/ui/login/login.fxml"));
        stage.setTitle("Vaccine Distributor Login");
        stage.getIcons().add(new Image("/images/syringe_100px.png"));
        stage.setScene(new Scene(root));
        stage.show();
        stage.setResizable(false);
    }  
}
