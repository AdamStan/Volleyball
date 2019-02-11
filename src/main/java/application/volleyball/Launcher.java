package application.volleyball;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

import application.volleyball.models.Club;
import application.volleyball.models.League;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Runs application
 * @author Adam
 */
public class Launcher extends Application{
	
	public static Set<Club> clubs = new HashSet<Club>();
	
	
	static {
		League league = new League("Minus Liga");
		clubs.add(new Club());
		clubs.add(new Club());
		clubs.add(new Club());
		clubs.add(new Club());
		clubs.add(new Club());
		clubs.add(new Club());
	}

	public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
    	FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Launcher.class.getResource("windows/MainWindow.fxml"));
        try {
			VBox rootLayout = loader.load();
			Scene scene = new Scene(rootLayout);
	        primaryStage.setScene(scene);
            primaryStage.setTitle("Volleyball Simulation");
            primaryStage.show();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

}
