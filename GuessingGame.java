import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
public class GuessingGame extends Tab  {
	int numGuess = 0;
	int res = 0;
	int userNumber = 0;



	public GuessingGame(){
		//		this.guess = guess;
		this.numGuess = numGuess;
		//		this.res = res;



		Button userInput = new Button ("Enter Guess");
		Button quit = new Button ("quit");
		Button reset = new Button ("reset");

		Label textLabel = new Label("Enter your guess");
		TextField textField = new TextField ();
		final Label randomNumberTextfield = new Label();
		final Label outcomeTextfield = new Label();
		



		TextArea text = new TextArea();
		text.appendText(outcome(res, userNumber));
		text.setPrefRowCount(10);
		text.setPrefColumnCount(20);
		text.setWrapText(true);


		VBox vbox = new VBox();
		vbox.getChildren().add(textLabel);
		vbox.getChildren().add(textField);
		vbox.getChildren().add(userInput);
		vbox.getChildren().add(randomNumberTextfield);
		
		vbox.getChildren().add(quit);
		vbox.getChildren().add(reset);
		vbox.getChildren().add(outcomeTextfield);
		vbox.setAlignment(Pos.CENTER);
		vbox.setSpacing(5);





		setText("Guessing Game");
		setContent(vbox);
		
	
		userInput.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				String userInput = textField.getText();
				
				System.out.println("generate number butto" + numGuess);
				// numGuess++;
				 
				  int intUserInput =Integer.parseInt(userInput);

			
					int res = generateNumber( numGuess);
					String newres = Integer.toString(res);
					randomNumberTextfield.setText(newres);
					
					String highLow = outcome(res,  intUserInput );
					outcomeTextfield.setText(highLow);
					limit(vbox);
					numGuess++;
					
					
					
				}
	});

	

		quit.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent e) {
				quit(vbox);


			}
		});



	
	reset.setOnAction(new EventHandler<ActionEvent>() {
		public void handle(ActionEvent e) {
			reset(numGuess);
				

		}
	});


}







public int generateNumber(int numGuess) {
	numGuess++;

	
		res = (int)(Math.random() * 50 + 1);
		System.out.println(res);
		return res;
	}

public void reset(Object i) {
	numGuess = 0;
	System.out.println( numGuess);
}

public String outcome(int res,int userNumber){
	String outcome = "";
	if(res  == userNumber) {
		outcome = "correctly";
	}else if(res > userNumber) {
		outcome = "too low";
	}else if(res < userNumber) {
		outcome = "too high";
	}


	return ("You've guessed " + outcome);
}


public void  limit(Object GuessingGame) {
	System.out.println("quit numguess:"+ numGuess);
	if(numGuess == 4) {
		System.exit(0);
	}

//	}else 
//		System.exit(0);


}

public void  quit(Object GuessingGame) {
	
	System.exit(0);


}
public int getNumGuess() {
	return numGuess;
}


public void setNumGuess(int numGuess) {
	this.numGuess = numGuess;
}


public int getUserNumber() {
	return userNumber;
}


public void setUserNumber(int userNumber) {
	this.userNumber = userNumber;
}







}

