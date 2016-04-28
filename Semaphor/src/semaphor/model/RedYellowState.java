/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.model;

import javafx.scene.paint.Color;

public class RedYellowState extends SemaphorState {

    public static SemaphorState instance = new RedYellowState();

    public RedYellowState() {
        super(Color.RED, Color.YELLOW);
    }

    @Override
    SemaphorState next() {
        return GreenState.instance;
    }

}
