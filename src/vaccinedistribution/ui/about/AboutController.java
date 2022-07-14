package vaccinedistribution.ui.about;

import java.net.URL;
import java.util.ResourceBundle;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import javafx.fxml.Initializable;

public class AboutController implements Initializable{
    
    public void loadAvi(){
        try{
            Desktop.getDesktop().browse(new URL("https://www.linkedin.com/in/avitechsmith/").toURI());
        }catch (URISyntaxException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public void loadAkshat(){
        try{
            Desktop.getDesktop().browse(new URL("https://www.linkedin.com/in/akshat-shah-biztech/").toURI());
        }catch (URISyntaxException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public void loadShruti(){
        try{
            Desktop.getDesktop().browse(new URL("https://www.linkedin.com/in/shruti-agarwal-551238190/").toURI());
        } catch (URISyntaxException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
            
    @Override
    public void initialize(URL url, ResourceBundle rb){
    }
}
