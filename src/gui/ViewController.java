package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	
	@FXML
	private Button btMyTest;
	
	@FXML
	public void onBtMyTestAction() {
		System.out.println("Click");
	}

}
