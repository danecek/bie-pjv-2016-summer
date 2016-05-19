/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaphor.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danecek
 */
public class SemaphorController implements Runnable {

    SemaphorModel semaphorModel;
    private boolean runFl;

    public SemaphorController(SemaphorModel semaphorModel) {
        this.semaphorModel = semaphorModel;
    }

    public void start() {
        runFl = true;
        new Thread(this).start();
    }

    public void stop() {
        runFl = false;
    }

    public void next() {
        semaphorModel.next();
    }

    @Override
    public void run() {
            System.out.println("*******************************************");
        while (runFl) {
            System.out.println("*******************************************");
            try {
                Thread.sleep(1000);
                semaphorModel.next();
            } catch (InterruptedException ex) {
                Logger.getLogger(SemaphorController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
