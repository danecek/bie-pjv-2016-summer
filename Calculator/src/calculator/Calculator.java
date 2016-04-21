/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.StringReader;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author danecek
 */
public class Calculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Evaluate");
        TextField input = new TextField();
        Text result = new Text();
        btn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                try {
                    Parser p = new Parser(new StringReader(input.getText()));
                    result.setText(Integer.toString(p.term()));
                } catch (Exception ex) {
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setResizable(true);
                    a.setContentText(ex.toString());
                    a.show();
                }
            }
        });
        input.setOnAction(btn.getOnAction());

        GridPane gp = new GridPane();
        gp.setPadding(new Insets(20));
        gp.setHgap(10);
        gp.setVgap(10);
        gp.add(new Label("Input:"), 0, 0);
        gp.add(input, 1, 0);
        gp.add(new Label("Result:"), 0, 1);
        gp.add(result, 1, 1);
        gp.add(btn, 0, 2, 2, 1);
        StackPane root = new StackPane(gp);
        Scene scene = new Scene(root);

        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
