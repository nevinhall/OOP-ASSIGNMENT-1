

import java.util.ArrayList;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class lottoView extends Tab {
	public lottoView(){
		Button generateNumbers = new Button("Click to Play!");
		
		TextField number1 = new TextField ();
		TextField number2 = new TextField ();
		TextField number3 = new TextField ();
		TextField number4 = new TextField ();
		TextField number5 = new TextField ();
		
		number1.setMaxWidth(2);
		number2.setMaxWidth(2);
		number3.setMaxWidth(2);
		number4.setMaxWidth(2);
		number5.setMaxWidth(2);
		
		FlowPane lottoVbox = new FlowPane();
		lottoVbox.getChildren().add(generateNumbers);
		lottoVbox.getChildren().add(number1);
		lottoVbox.getChildren().add(number2);
		lottoVbox.getChildren().add(number3);
		lottoVbox.getChildren().add(number4);
		lottoVbox.getChildren().add(number5);
		
		
		setText("Lotto Cure");
		setContent(lottoVbox);
		
		lottoVbox.setAlignment(Pos.CENTER);
		lottoVbox.setHgap(20);
		
		
		ArrayList<Integer> playerNumbers = new ArrayList<>();
		
		playerNumbers.add(0);
		playerNumbers.add(0);
		playerNumbers.add(0);
		playerNumbers.add(0);
		playerNumbers.add(0);
		
		lottoContorller g1 = new lottoContorller();
		g1.generateLottoNumbers();
		g1.playerNumbers(playerNumbers);

	}

}
