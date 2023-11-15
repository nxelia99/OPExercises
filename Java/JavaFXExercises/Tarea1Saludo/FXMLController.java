import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class FXMLController{

	@FXML
    private Button botonaceptar;

    @FXML
    private Label label;

    @FXML
    private TextField nombreinput;
    
    @FXML
    private Label saludomensaje;

	
	@FXML
	private void handleButtonAction(ActionEvent event) {
		String nombre = nombreinput.getText();
		saludomensaje.setText("¡Hola " + nombre + "! ");
		
	}
	
	
	


}
