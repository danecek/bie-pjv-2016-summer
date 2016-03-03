/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalpi;

/**
 *
 * @author danecek
 */
public class Result {
    int n;
    double resValue;
    long timeMs;

    public Result(int n, double resValue, long timeMs) {
        this.n = n;
        this.resValue = resValue;
        this.timeMs = timeMs;
    }
    
    
    public String toString() {
       return "result from " + n + " experiments was " + resValue + " in " + timeMs + " ms"; 
    }
    

}
