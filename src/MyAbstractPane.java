import javafx.geometry.Insets;
import javafx.scene.layout.BorderPane;

public abstract class MyAbstractPane extends BorderPane {

	public MyAbstractPane(MyScene myScene) {
		setPrefSize(150, 300);

		MyButtonPane myButtonPane = new MyButtonPane(this, myScene);
		setBottom(myButtonPane);

		setPadding(new Insets(10));
	}

	public abstract void doIt();
}
