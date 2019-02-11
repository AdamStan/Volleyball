package application.volleyball.windows;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainWindowController {
	@FXML
	private Button start;
	
	@FXML
	private Button options;
	
	@FXML
	private Button exit;
	
	public MainWindowController() {
	}
	
	@FXML
	public void exitAction() {
		System.exit(0);
	}
	
	@FXML
	public void optionsAction() {
		
	}
	
	@FXML
	public void startAction() {
		
	}
}
