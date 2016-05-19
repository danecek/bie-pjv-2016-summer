/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import semaphor.model.SemaphorController;
import semaphor.model.SemaphorModel;
import semaphor.view.Semaphor;

/**
 *
 * @author danecek
 */
public class Main extends Application {

 
    @Override
    public void start(Stage primaryStage) {
        Semaphor s = new Semaphor(30.0, Color.RED, Color.YELLOW, Color.GREEN);
        SemaphorModel sm = new SemaphorModel(s);
        s.setSm(sm);
        Button nextBtn = new Button();
        nextBtn.setText("Next");
        SemaphorController  sc = new SemaphorController(sm);
        nextBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                sm.next();
            }
        });
        Button startBtn = new Button("Start");
        startBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("weffffffffffffffffffffffffffffffffffffff");
                sc.start();
            }
        });

        Button stopBtn = new Button("Stop");
        startBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                if (sc != null) {
                    sc.stop();
                }
            }
        });

        BorderPane root = new BorderPane();
        root.setCenter(s);
        root.setBottom(new HBox(nextBtn, startBtn, stopBtn));

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
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
