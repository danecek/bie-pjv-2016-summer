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
public class Point {

    double x;
    double y;

    Point() {
        x = Math.random();
        y = Math.random();
    }

    boolean inCircle() {
        return Math.sqrt(x * x + y * y) < 1;
    }
}
