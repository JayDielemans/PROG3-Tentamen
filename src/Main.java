import javafx.application.Application;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) {
		MyScene myScene = new MyScene(new Pane());
		stage.setTitle("PROG3-jaydielemans-Lines");
		stage.setScene(myScene);
		stage.setResizable(false);
		stage.show();
	}
}
