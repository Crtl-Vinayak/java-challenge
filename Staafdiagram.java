package oktober2019;

import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
 
public class Staafdiagram extends Application {
	
	private Scene scene;
	private Group root;
	private Label l1 = new Label("Valerie");
	private TextField txf1 = new TextField();
	private Label l2 = new Label("Jeroen");
	private TextField txf2 = new TextField();
	private Label l3 = new Label("Hans");
	private TextField txf3 = new TextField();
	private Button toon = new Button("Toon");
	
	private int valerie_val = 120;
	private int jeroen_val = 80;
	private int hans_val = 60;
	
    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Override public void start(Stage stage) {
    	try {
	        stage.setTitle("StaafDiagram");
	        final CategoryAxis xAxis = new CategoryAxis();
	        final NumberAxis yAxis = new NumberAxis();
	        final BarChart<String,Number> bc = 
	            new BarChart<String,Number>(xAxis,yAxis);
	        
			XYChart.Series series = new XYChart.Series();      
	        series.getData().add(new XYChart.Data("Valerie", valerie_val));
	        series.getData().add(new XYChart.Data("Jeroen", jeroen_val));
	        series.getData().add(new XYChart.Data("Hans", hans_val));
	            
	        root = new Group();
	        scene = new Scene(root, 800, 700);
	        
	        bc.setLayoutX(0);
	        bc.setLayoutY(30);
	        bc.setPrefWidth(scene.getWidth());
	        bc.setPrefHeight(scene.getHeight() - 30);
	        bc.getData().addAll(series);
	        stage.setScene(scene);
	        
	        toon.setLayoutX(scene.getWidth() / 4 * 3);
	        l1.setLayoutX(10);
	        l2.setLayoutX(150);
	        l3.setLayoutX(290);
	        txf1.setPrefWidth(50);
	        txf2.setPrefWidth(50);
	        txf3.setPrefWidth(50);
	        txf1.setLayoutX(60);
	        txf2.setLayoutX(190);
	        txf3.setLayoutX(330);
	        root.getChildren().addAll(bc, toon, l1, l2, l3, txf1, txf2, txf3);
	        
	        new AnimationTimer() {

				@Override
				public void handle(long now) {
					bc.setPrefWidth(scene.getWidth());
			        bc.setPrefHeight(scene.getHeight() - 30);
			        toon.setLayoutX(scene.getWidth() / 4 * 3);
				}
	        }.start();
	        
	        toon.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent e) {
					valerie_val = Integer.parseInt(txf1.getText());
					jeroen_val = Integer.parseInt(txf2.getText());
					hans_val = Integer.parseInt(txf3.getText());
					System.out.println(valerie_val + " " + jeroen_val + " " + hans_val);
					 series.getData().add(new XYChart.Data("Valerie", valerie_val));
				        series.getData().add(new XYChart.Data("Jeroen", jeroen_val));
				        series.getData().add(new XYChart.Data("Hans", hans_val));
				}
	        });
	        
	        stage.show();
	        
    	} catch (Exception e){
    		e.printStackTrace();
    	}
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}