package oktober2019;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Wisselgeld_Calculator extends Application {

	public final static String TITLE = "Wisselgeld Calculator";
	public final static short WIDTH = 1280;
	public final static short HEIGHT = 720;

	private Stage window;
	private Scene scene;
	private Group root;
	
	private int txt500_amountINT;
	private int txt200_amountINT;
	private int txt100_amountINT;
	private int txt50_amountINT;
	private int txt20_amountINT;
	private int txt10_amountINT;
	private int txt5_amountINT;
	private int txt1_amountINT;
	private int txt05_amountINT;
	private int txt02_amountINT;
	private int txt01_amountINT;
	private int txt005_amountINT;
	@SuppressWarnings("unused")
	private int txt001_amountINT;
	
	private double balance;
	
	Text txt = new Text("€");
	TextField txf = new TextField("");
	Button butOk = new Button("OK");

	@Override
	public void start(Stage primaryStage) {
		root = new Group();
		scene = new Scene(root, WIDTH, HEIGHT, Color.DARKGRAY);
		window = primaryStage;
		window.setScene(scene);
		window.setTitle(TITLE);
		window.show();
		
		root.getChildren().addAll(txt, txf, butOk);
		txt.setLayoutX(400);
		txt.setLayoutY(120);
		txf.setLayoutX(420);
		txf.setLayoutY(100);
		butOk.setLayoutX(700);
		butOk.setLayoutY(100);
		
		txf.setPrefWidth(270);
		butOk.setPrefWidth(100);
		
		txt.setFont(Font.font("Arial Black", 20));
		txt.setStyle("-fx-font-weight: bold");
		
		aantalWisselgeld();
	}

	public void aantalWisselgeld() {
		Text txt500 = new Text("€500,00");
		Text txt200 = new Text("€200,00");
		Text txt100 = new Text("€100,00");
		Text txt50 = new Text("€50,00");
		Text txt20 = new Text("€20,00");
		Text txt10 = new Text("€10,00");
		Text txt5 = new Text("€5,00");
		Text txt1 = new Text("€1,00");
		Text txt05 = new Text("€0,50");
		Text txt02 = new Text("€0,20");
		Text txt01 = new Text("€0,10");
		Text txt005 = new Text("€0,05");
		Text txt001 = new Text("€0,01");
		
		txt500.setLayoutX(400);
		txt500.setLayoutY(200);
		txt200.setLayoutX(400);
		txt200.setLayoutY(220);
		txt100.setLayoutX(400);
		txt100.setLayoutY(240);
		txt50.setLayoutX(400);
		txt50.setLayoutY(260);
		txt20.setLayoutX(400);
		txt20.setLayoutY(280);
		txt10.setLayoutX(400);
		txt10.setLayoutY(300);
		txt5.setLayoutX(400);
		txt5.setLayoutY(320);
		txt1.setLayoutX(400);
		txt1.setLayoutY(340);
		txt05.setLayoutX(400);
		txt05.setLayoutY(360);
		txt02.setLayoutX(400);
		txt02.setLayoutY(380);
		txt01.setLayoutX(400);
		txt01.setLayoutY(400);
		txt005.setLayoutX(400);
		txt005.setLayoutY(420);
		txt001.setLayoutX(400);
		txt001.setLayoutY(440);
		
		txt500.setVisible(false);
		txt200.setVisible(false);
		txt100.setVisible(false);
		txt50.setVisible(false);
		txt20.setVisible(false);
		txt10.setVisible(false);
		txt5.setVisible(false);
		txt1.setVisible(false);
		txt05.setVisible(false);
		txt02.setVisible(false);
		txt01.setVisible(false);
		txt005.setVisible(false);
		txt001.setVisible(false);
		
		root.getChildren().addAll(txt500, txt200, txt100, txt50, txt20, txt10, txt5, txt1, txt05, txt02, txt01, txt005, txt001);
		
		Text txt500_amount = new Text("1x");
		Text txt200_amount = new Text("1x");
		Text txt100_amount = new Text("1x");
		Text txt50_amount = new Text("1x");
		Text txt20_amount = new Text("1x");
		Text txt10_amount = new Text("1x");
		Text txt5_amount = new Text("1x");
		Text txt1_amount = new Text("1x");
		Text txt05_amount = new Text("1x");
		Text txt02_amount = new Text("1x");
		Text txt01_amount = new Text("1x");
		Text txt005_amount = new Text("1x");
		Text txt001_amount = new Text("1x");
		
		txt500_amount.setLayoutX(370);
		txt500_amount.setLayoutY(200);
		txt200_amount.setLayoutX(370);
		txt200_amount.setLayoutY(220);
		txt100_amount.setLayoutX(370);
		txt100_amount.setLayoutY(240);
		txt50_amount.setLayoutX(370);
		txt50_amount.setLayoutY(260);
		txt20_amount.setLayoutX(370);
		txt20_amount.setLayoutY(280);
		txt10_amount.setLayoutX(370);
		txt10_amount.setLayoutY(300);
		txt5_amount.setLayoutX(370);
		txt5_amount.setLayoutY(320);
		txt1_amount.setLayoutX(370);
		txt1_amount.setLayoutY(340);
		txt05_amount.setLayoutX(370);
		txt05_amount.setLayoutY(360);
		txt02_amount.setLayoutX(370);
		txt02_amount.setLayoutY(380);
		txt01_amount.setLayoutX(370);
		txt01_amount.setLayoutY(400);
		txt005_amount.setLayoutX(370);
		txt005_amount.setLayoutY(420);
		txt001_amount.setLayoutX(370);
		txt001_amount.setLayoutY(440);
		
		txt500_amount.setVisible(false);
		txt200_amount.setVisible(false);
		txt100_amount.setVisible(false);
		txt50_amount.setVisible(false);
		txt20_amount.setVisible(false);
		txt10_amount.setVisible(false);
		txt5_amount.setVisible(false);
		txt1_amount.setVisible(false);
		txt05_amount.setVisible(false);
		txt02_amount.setVisible(false);
		txt01_amount.setVisible(false);
		txt005_amount.setVisible(false);
		txt001_amount.setVisible(false);
		
		root.getChildren().addAll(txt500_amount, txt200_amount, txt100_amount, txt50_amount, txt20_amount, txt10_amount, txt5_amount, txt1_amount, txt05_amount, txt02_amount, txt01_amount, txt005_amount, txt001_amount);
		
		butOk.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent e) {
				//System.out.println(Double.parseDouble(txf.getText()));
				balance = Double.parseDouble(txf.getText());
				double rounded = ((double) (long) (balance * 20 + 0.5)) / 20;
				System.out.println(rounded);
				
				txt500_amount.setText("1x");
				txt200_amount.setText("1x");
				txt100_amount.setText("1x");
				txt50_amount.setText("1x");
				txt20_amount.setText("1x");
				txt10_amount.setText("1x");
				txt5_amount.setText("1x");
				txt1_amount.setText("1x");
				txt05_amount.setText("1x");
				txt02_amount.setText("1x");
				txt01_amount.setText("1x");
				txt005_amount.setText("1x");
				txt001_amount.setText("1x");
				
				txt500_amount.setVisible(false);
				txt200_amount.setVisible(false);
				txt100_amount.setVisible(false);
				txt50_amount.setVisible(false);
				txt20_amount.setVisible(false);
				txt10_amount.setVisible(false);
				txt5_amount.setVisible(false);
				txt1_amount.setVisible(false);
				txt05_amount.setVisible(false);
				txt02_amount.setVisible(false);
				txt01_amount.setVisible(false);
				txt005_amount.setVisible(false);
				txt001_amount.setVisible(false);
				
				txt500.setVisible(false);
				txt200.setVisible(false);
				txt100.setVisible(false);
				txt50.setVisible(false);
				txt20.setVisible(false);
				txt10.setVisible(false);
				txt5.setVisible(false);
				txt1.setVisible(false);
				txt05.setVisible(false);
				txt02.setVisible(false);
				txt01.setVisible(false);
				txt005.setVisible(false);
				txt001.setVisible(false);
				
				if(rounded >= 500) {
					txt500_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 500);
					txt500_amountINT += rounded / 500;
					txt500_amount.setText(Integer.toString(txt500_amountINT) + "x");
					txt500_amount.setVisible(true);
					txt500.setVisible(true);
					rounded -= (txt500_amountINT * 500);
					System.out.println("balance - 500's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 200) {
					txt200_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 200);
					txt200_amountINT += rounded / 200;
					txt200_amount.setText(Integer.toString(txt200_amountINT) + "x");
					txt200_amount.setVisible(true);
					txt200.setVisible(true);
					rounded -= (txt200_amountINT * 200);
					System.out.println("balance - 200's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 100) {
					txt100_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 100);
					txt100_amountINT += rounded / 100;
					txt100_amount.setText(Integer.toString(txt100_amountINT) + "x");
					txt100_amount.setVisible(true);
					txt100.setVisible(true);
					rounded -= (txt100_amountINT * 100);
					System.out.println("balance - 100's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 50) {
					txt50_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 50);
					txt50_amountINT += rounded / 50;
					txt50_amount.setText(Integer.toString(txt50_amountINT) + "x");
					txt50_amount.setVisible(true);
					txt50.setVisible(true);
					rounded -= (txt50_amountINT * 50);
					System.out.println("balance - 50's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 20) {
					txt20_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 20);
					txt20_amountINT += rounded / 20;
					txt20_amount.setText(Integer.toString(txt20_amountINT) + "x");
					txt20_amount.setVisible(true);
					txt20.setVisible(true);
					rounded -= (txt20_amountINT * 20);
					System.out.println("balance - 20's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 10) {
					txt10_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 10);
					txt10_amountINT += rounded / 10;
					txt10_amount.setText(Integer.toString(txt10_amountINT) + "x");
					txt10_amount.setVisible(true);
					txt10.setVisible(true);
					rounded -= (txt10_amountINT * 10);
					System.out.println("balance - 10's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 5) {
					txt5_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 5);
					txt5_amountINT += rounded / 5;
					txt5_amount.setText(Integer.toString(txt5_amountINT) + "x");
					txt5_amount.setVisible(true);
					txt5.setVisible(true);
					rounded -= (txt5_amountINT * 5);
					System.out.println("balance - 5's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 1) {
					txt1_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 1);
					txt1_amountINT += rounded / 1;
					txt1_amount.setText(Integer.toString(txt1_amountINT) + "x");
					txt1_amount.setVisible(true);
					txt1.setVisible(true);
					rounded -= (txt1_amountINT * 1);
					System.out.println("balance - 1's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 0.5) {
					txt05_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 0.5);
					txt05_amountINT += rounded / 0.5;
					txt05_amount.setText(Integer.toString(txt05_amountINT) + "x");
					txt05_amount.setVisible(true);
					txt05.setVisible(true);
					rounded -= (txt05_amountINT * 0.5);
					System.out.println("balance - 0.5's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 0.2) {
					txt02_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 0.2);
					txt02_amountINT += rounded / 0.2;
					txt02_amount.setText(Integer.toString(txt02_amountINT) + "x");
					txt02_amount.setVisible(true);
					txt02.setVisible(true);
					rounded -= (txt02_amountINT * 0.2);
					System.out.println("balance - 0.2's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 0.1) {
					txt01_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 0.1);
					txt01_amountINT += rounded / 0.1;
					txt01_amount.setText(Integer.toString(txt01_amountINT) + "x");
					txt01_amount.setVisible(true);
					txt01.setVisible(true);
					rounded -= (txt01_amountINT * 0.1);
					System.out.println("balance - 0.1's: " + rounded);
				}
				
				rounded = ((double) (long) (rounded * 20 + 0.5)) / 20;
				
				if(rounded >= 0.05) {
					txt005_amountINT = 0;
					//System.out.println(Integer.parseInt(txf.getText()) / 0.05);
					txt005_amountINT += rounded / 0.05;
					txt005_amount.setText(Integer.toString(txt005_amountINT) + "x");
					txt005_amount.setVisible(true);
					txt005.setVisible(true);
					rounded -= (txt005_amountINT * 0.05);
					System.out.println("balance - 0.05's: " + rounded);
				}
//				if(rounded > 0.01) {
//					txt001_amountINT = 0;
//					//System.out.println(Integer.parseInt(txf.getText()) / 0.01);
//					txt001_amountINT += rounded / 0.01;
//					txt001_amount.setText(Integer.toString(txt001_amountINT) + "x");
//					txt001_amount.setVisible(true);
//					txt001.setVisible(true);
//					rounded -= (txt001_amountINT * 0.01);
//					System.out.println("balance - 0.01's: " + rounded);
//				}
			}
        });
	}
	
	public void stop() {
		System.out.println("program exited");
	}

	public static void main(String[] args) {
		launch(args);
	}
}
