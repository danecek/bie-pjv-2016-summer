/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.model;

import semaphor.view.Semaphor;

/**
 *
 * @author danecek
 */
public class SemaphorModel {

    private SemaphorState semaphorState = RedState.instance;
    
    Semaphor semaphor;

    public SemaphorModel(Semaphor semaphor) {
        this.semaphor = semaphor;
    }

    public void reset() {
        semaphorState = RedState.instance;
    }

    public void next() {
        semaphorState = semaphorState.next();
        System.out.println(semaphorState);
        semaphor.myNotify();
    }

    /**
     * @return the semaphorState
     */
    public SemaphorState getSemaphorState() {
        return semaphorState;
    }

}
