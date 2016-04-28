/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javafx.scene.paint.Color;

/**
 *
 * @author danecek
 */
public abstract class SemaphorState {

    private Set<Color> colors;

    public SemaphorState(Color... lights) {
        this.colors = new HashSet(Arrays.asList(lights));
    }

    abstract SemaphorState next();

    /**
     * @return the colors
     */
    public Set<Color> getColors() {
        return colors;
    }

}
