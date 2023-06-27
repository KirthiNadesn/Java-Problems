package lab5;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;

public class Lab5Ques2 extends Application{
	
	public void start(Stage stage) {
		
		Pane pane = new Pane();
		Circle circle = new Circle();
		
		circle.setCenterX(250.0f);
		circle.setCenterY(170.0f);
		circle.setRadius(120.0f);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
	
		
		
		Ellipse eyeleft = new Ellipse(195 ,130,30,20);
		eyeleft.setFill(Color.WHITE);
		eyeleft.setStroke(Color.BLACK);
		
		Circle pupilleft = new Circle(195,130,13);
		pupilleft.setFill(Color.BLACK);
		pupilleft.setStroke(Color.BLACK);
		
		Ellipse eyeright = new Ellipse(295 ,130,30,20);
		eyeright.setStroke(Color.BLACK);
		eyeright.setFill(Color.WHITE);
		eyeright.setStroke(Color.BLACK);
		
		Circle pupilright = new Circle(295,130,13);
		pupilright.setFill(Color.BLACK);
		pupilright.setStroke(Color.BLACK);
		
		
		
        Polygon nose = new Polygon();
        nose.getPoints().addAll(
        		245.0, 180.0 - 40.0,
        		245.0 - 40.0, 150.0 + 40.0,
        		245.0 + 40.0, 150.0 + 40.0);
        nose.setFill(Color.WHITE);
        nose.setStroke(Color.BLACK);
		
        Arc smile = new Arc(250, 150 + 40, 100, 50, -140, 100);
        smile.setType(ArcType.OPEN);
        smile.setStroke(Color.BLACK);
        smile.setFill(Color.TRANSPARENT);
        
		pane.getChildren().addAll(circle,eyeleft,pupilleft,eyeright,pupilright,nose,smile);
		stage.setTitle("Smiley Face");
		Scene scene = new Scene(pane, 500,350);
		stage.setScene(scene);
		stage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	

	}

}
