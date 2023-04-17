import java.util.ArrayList;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MyLettersPane extends MyAbstractPane {

	Color backgroundColor;
	Color textColor;
	char letter = 'A';

	ArrayList<Text> letters;
	TilePane myTilePane;
	Text myText;

	public MyLettersPane(Color backgroundColor, Color textColor, MyScene myScene) {
		super(myScene);

		this.backgroundColor = backgroundColor;
		this.textColor = textColor;

		setBackground(new Background(new BackgroundFill(backgroundColor, null, null)));

		myTilePane = new TilePane();
		setCenter(myTilePane);
	}

	@Override
	public void doIt() {
		if (myTilePane.getChildren().size() != 26) {
			Font myFont = Font.font("Arial", 30);
			myText = new Text(Character.toString(letter));
			myText.setFill(textColor);
			myText.setFont(myFont);
			myTilePane.getChildren().add(myText);
			letter++;
		}
	}
}
