package ques1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.VBox;

public class Ques_1 extends Application{
	
	public void start(Stage stage) throws Exception{
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
		
		pane.setHgap(5.5);
		pane.setVgap(5.5);
		
		pane.add(new Label("First Operand"), 0, 0);
		TextField txtnum1 = new TextField();
		pane.add(txtnum1, 1, 0);
		
		
		pane.add(new Label("Second Operand"), 0, 1);
		TextField txtnum2 = new TextField();
		pane.add(txtnum2, 1, 1);
		
		
		pane.add(new Label("Result"), 0, 2);
		TextField txtResult = new TextField();
		pane.add(txtResult, 1, 2);
		
		
		Button btnAdd = new Button("Add");
		pane.add(btnAdd, 0, 3);
		Button btnSubtract = new Button("Subtract");
		pane.add(btnSubtract, 1, 3);
		Button btnClear = new Button("Clear");
		pane.add(btnClear, 3, 3);
		
		/*HBox hbox = new HBox(5);
		BorderPane borderpane = new BorderPane();
		borderpane.setBottom(hbox);*/
			
		
		/*VBox menuButtons = new VBox();
		menuButtons.getChildren().addAll(btnAdd, btnSubtract, btnClear);
		menuButtons.setSpacing(10);*/
		
		Scene scene = new Scene(pane);
		stage.setTitle("Calculator");
		stage.setScene(scene);
		stage.show();
		
		
		btnAdd.setOnAction( e -> {
			txtResult.setText(Double.parseDouble(txtnum1.getText()) + Double.parseDouble(txtnum2.getText()) + "");});
		
		btnSubtract.setOnAction( e -> {
			txtResult.setText(Double.parseDouble(txtnum1.getText()) - Double.parseDouble(txtnum2.getText()) + "");});
		
		btnClear.setOnAction(e -> {
		    txtnum1.setText(null);
		    txtnum2.setText(null);
		    txtResult.setText(null);
		});	
		
		
		
	}

	public static void main(String[] args) {
		launch(args);

	}

}
