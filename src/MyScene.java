import java.util.ArrayList;

import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class MyScene extends Scene {

	ArrayList<MyAbstractPane> panes;
	HBox myHBox;

	public MyScene(Pane root) {
		super(root);

		panes = new ArrayList<MyAbstractPane>();

		MyLinesPane myLinesPane = new MyLinesPane(Color.LIGHTSALMON, Color.WHITE, this);
		panes.add(myLinesPane);

		MyLinesPane myLinesPane2 = new MyLinesPane(Color.SKYBLUE, Color.WHITE, this);
		panes.add(myLinesPane2);

		MyLettersPane myLettersPane = new MyLettersPane(Color.LIGHTGREEN, Color.WHITE, this);
		panes.add(myLettersPane);

		MyLettersPane myLettersPane2 = new MyLettersPane(Color.LIGHTPINK, Color.WHITE, this);
		panes.add(myLettersPane2);

		myHBox = new HBox();

		for (MyAbstractPane pane : panes) {
			myHBox.getChildren().add(pane);
		}
		setRoot(myHBox);
	}

	public void changePanes(MyAbstractPane m) {
		int i = panes.indexOf(m);
		panes.remove(i);
		panes.add(0, m);

		myHBox.getChildren().clear();
		for (MyAbstractPane pane : panes) {
			myHBox.getChildren().add(pane);
		}
	}

}
