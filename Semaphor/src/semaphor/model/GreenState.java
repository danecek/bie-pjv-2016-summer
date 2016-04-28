/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.model;

import javafx.scene.paint.Color;

public class GreenState extends SemaphorState{
    
    public static SemaphorState instance = new GreenState();

    public GreenState() {
        super(Color.GREEN);
    }

    @Override
    SemaphorState next() {
        return YellowState.instance;
    }
    
}
