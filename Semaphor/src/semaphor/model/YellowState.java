/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.model;

import javafx.scene.paint.Color;

public class YellowState extends SemaphorState {

    public static SemaphorState instance = new YellowState();

    private YellowState() {
        super(Color.YELLOW);
    }

    @Override
    SemaphorState next() {
        return RedState.instance;
    }

}
