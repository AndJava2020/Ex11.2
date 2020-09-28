package ru.AndJava2020.Ex11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    public void showAlertWithoutHeaderText(Button btn) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Округ");

        // Header Text: null
        alert.setHeaderText(null);
        String s = btn.getText();
        alert.setContentText(s);
        alert.showAndWait();
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane root = new GridPane();
        Scene scene=new Scene(root,1000,500);
        primaryStage.setScene(scene);
        primaryStage.show();

        BorderPane mainPane=new BorderPane();
        HBox hbox1 =new HBox();
        HBox hbox2 =new HBox();
        HBox hbox3 =new HBox();
        hbox1.setSpacing(5);
        hbox2.setSpacing(5);
        hbox3.setSpacing(5);
        mainPane.setMinHeight(300);
        mainPane.setMinWidth(300);
//        vbox.setMinHeight(50);
//        vbox.setMinWidth(50);
//        vbox.setMaxHeight(200);
//        vbox.setMaxWidth(200);
        //mainPane.setCenter(hbox1);





        Button btn1=new Button("NW");
        Button btn2=new Button("N");
        Button btn3=new Button("NE");
        Button btn4=new Button("W");
        Button btn5=new Button("Center");
        Button btn6=new Button("E");
        Button btn7=new Button("SW");
        Button btn8=new Button("S");
        Button btn9=new Button("SE");


        root.setGridLinesVisible(true);
        root.add(btn1, 0, 0);
        root.add(btn2, 1, 0);
        root.add(btn3, 2, 0);
        root.add(btn4, 0, 1);
        root.add(btn5, 1, 1);
        root.add(btn6, 2, 1);
        root.add(btn7, 0, 2);
        root.add(btn8, 1, 2);
        root.add(btn9, 2, 2);





//        hbox1.getChildren().addAll(btn1,btn2,btn3);
//        hbox2.getChildren().addAll(btn4,btn5,btn6);
//        hbox3.getChildren().addAll(btn7,btn8,btn9);

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlertWithoutHeaderText(btn1);
            }
        });
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlertWithoutHeaderText(btn2);
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlertWithoutHeaderText(btn3);
            }
        });
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlertWithoutHeaderText(btn3);
            }
        });
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlertWithoutHeaderText(btn4);
            }
        });
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlertWithoutHeaderText(btn5);
            }
        });
        btn6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlertWithoutHeaderText(btn6);
            }
        });
        btn7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlertWithoutHeaderText(btn7);
            }
        });
        btn8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlertWithoutHeaderText(btn8);
            }
        });
        btn9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showAlertWithoutHeaderText(btn9);
            }
        });
//        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//
//            }
//        });
    }
    public static void main(String[] args) {
        launch(args);
    }
}
