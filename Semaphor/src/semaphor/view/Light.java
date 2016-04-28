/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.view;

import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Light extends StackPane {
    
    Color color;
    boolean on;
    double radius;
    private final Circle c;
    
    public Light(Color color, double radius) {
        this.color = color;
        this.radius = radius;
        getChildren().add(c = new Circle(radius, color));
    }
    
    void setOn(boolean on) {
        if (on) {
            c.setFill(color);
        } else {
            c.setFill(Color.DARKGREY);
        }
    }
    
}
