package vaccinedistribution.ui.dashboard;

import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class DashboardlayoutController implements Initializable {

    @FXML
    private Label registrations;
    
    @FXML
    public JFXButton logoutButton;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }   
    
    public void closeStage1(){
        ((Stage)registrations.getScene().getWindow()).close();
    }
    
    public void citizens(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/vaccinedistribution/ui/EndUser/db.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Vaccine Distributor Citizens");
            stage.getIcons().add(new Image("/images/syringe_100px.png"));
            stage.setScene(new Scene(root,600,400));
            stage.show();
            stage.setResizable(false);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void manufact(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/vaccinedistribution/ui/manufacturer/manuDB.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Vaccine Distributor Manufacturers");
            stage.getIcons().add(new Image("/images/syringe_100px.png"));
            stage.setScene(new Scene(root,600,400));
            stage.show();
            stage.setResizable(false);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void provider(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/vaccinedistribution/ui/provider/providerDB.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Vaccine Distributor Providers");
            stage.getIcons().add(new Image("/images/syringe_100px.png"));
            stage.setScene(new Scene(root,600,400));
            stage.show();
            stage.setResizable(false);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void aboutPage(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/vaccinedistribution/ui/about/about.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Vaccine Distributor About");
            stage.getIcons().add(new Image("/images/syringe_100px.png"));
            stage.setScene(new Scene(root,942,682));
            stage.show();
            stage.setResizable(false);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void precautionsPage(){
        try{
            Parent root = FXMLLoader.load(getClass().getResource("/vaccinedistribution/ui/precautions/precautions.fxml"));
            Stage stage = new Stage();
            stage.setTitle("Vaccine Distributor Precautions");
            stage.getIcons().add(new Image("/images/syringe_100px.png"));
            stage.setScene(new Scene(root,852,481));
            stage.show();
            stage.setResizable(false);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
