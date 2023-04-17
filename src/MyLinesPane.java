import java.util.ArrayList;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class MyLinesPane extends MyAbstractPane {

	Color backgroundColor;
	Color lineColor;

	ArrayList<Line> lines;
	VBox myVBoxLines;

	public MyLinesPane(Color backgroundColor, Color lineColor, MyScene myScene) {
		super(myScene);

		this.lines = new ArrayList<Line>();
		this.backgroundColor = backgroundColor;
		this.lineColor = lineColor;

		setBackground(new Background(new BackgroundFill(backgroundColor, null, null)));

		myVBoxLines = new VBox();
		myVBoxLines.setSpacing(10);
		setCenter(myVBoxLines);
	}

	@Override
	public void doIt() {
		if (myVBoxLines.getChildren().size() != 18) {

			Line newLine = new Line(0, 150, 120, 150);
			newLine.setStroke(lineColor);
			newLine.setStrokeWidth(4);

			myVBoxLines.getChildren().add(newLine);
		}
	}
}
