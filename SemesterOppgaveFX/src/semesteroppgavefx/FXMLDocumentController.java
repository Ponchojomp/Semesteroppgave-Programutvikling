package semesteroppgavefx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.control.*;


public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label, lblHei;
    
    @FXML
    private TextField KontNavn, lokaleNavn, ArrKontakt, AntPlass;
    
    @FXML
    private void handleButtonActionLokale(ActionEvent event) {
        lokaleNavn.setVisible(true);
        KontNavn.setVisible(false);
        ArrKontakt.setVisible(false);
        AntPlass.setVisible(false);
        
    }
    
    @FXML
    private void handleButtonActionKontakperson(ActionEvent event) {
       lokaleNavn.setVisible(false);
        KontNavn.setVisible(true);
        ArrKontakt.setVisible(false);
        AntPlass.setVisible(false);
    }
    
    @FXML
    private void handleButtonActionArrangement(ActionEvent event) {
        lokaleNavn.setVisible(false);
        KontNavn.setVisible(false);
        ArrKontakt.setVisible(true);
        AntPlass.setVisible(false);
    }
    
    @FXML
    private void handleButtonActionBillett(ActionEvent event) {
        lokaleNavn.setVisible(false);
        KontNavn.setVisible(false);
        ArrKontakt.setVisible(false);
        AntPlass.setVisible(true);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        lokaleNavn.setVisible(false);
        KontNavn.setVisible(false);
        ArrKontakt.setVisible(false);
        AntPlass.setVisible(false);
    }    

}
