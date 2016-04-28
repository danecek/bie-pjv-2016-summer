/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.view;

import java.util.ArrayList;
import java.util.List;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import semaphor.model.SemaphorModel;
import semaphor.model.SemaphorState;

/**
 *
 * @author danecek
 */
public class Semaphor extends VBox {

    private SemaphorModel sm;
    List<Light> lights = new ArrayList<>();

    public Semaphor(double radius, Color... colors) {
        for (Color c : colors) {
            lights.add(new Light(c, radius));
        }
        getChildren().addAll(lights);
    }

    public void myNotify() {
        SemaphorState ss = sm.getSemaphorState();
        for (Light l : lights) {
            l.setOn(ss.getColors().contains(l.color));
        }
    }

    /**
     * @return the sm
     */
    public SemaphorModel getSm() {
        return sm;
    }

    /**
     * @param sm the sm to set
     */
    public void setSm(SemaphorModel sm) {
        this.sm = sm;
    }

}
