/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxhw;

import java.util.Date;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.text.Text;

public class MyHandler implements EventHandler<ActionEvent> {

    private final Text t;

    public MyHandler(Text t) {
        this.t = t;
    }

    @Override
    public void handle(ActionEvent event) {
        t.setText(new Date().toString());
    }

}
