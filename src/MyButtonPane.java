import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;

public class MyButtonPane extends FlowPane {

	MyScene myScene;

	public MyButtonPane(MyAbstractPane m, MyScene myScene) {
		super();

		this.myScene = myScene;

		this.setAlignment(Pos.CENTER);

		Button b1 = new Button("First");
		b1.setOnAction(e -> handleFirst(m));

		Button b2 = new Button();

		if (m instanceof MyLinesPane) {
			b2.setText("Line");
			b2.setOnAction(e -> handle(m));
		} else if (m instanceof MyLettersPane) {
			b2.setText("Letter");
			b2.setOnAction(e -> handle(m));
		}

		HBox myHBoxButtons = new HBox();
		myHBoxButtons.getChildren().addAll(b1, b2);
		myHBoxButtons.setSpacing(10);

		this.getChildren().add(myHBoxButtons);
	}

	private void handleFirst(MyAbstractPane m) {
		myScene.changePanes(m);
	}

	private void handle(MyAbstractPane m) {
		m.doIt();
	}
}
