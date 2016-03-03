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
public class EvalPI {

    static double dist(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    static Result evalPiOo(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("");
        }
        int inCounter = 0;
        long beg = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            Point p = new Point();
            if (p.inCircle()) {
                inCounter++;
            }

        }
        long totalTime = System.currentTimeMillis() - beg;
        //    System.out.println(totalTime);
        return new Result(n, (double) inCounter / n * 4, totalTime);

    }

    static Result evalPi(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("");
        }
        int inCounter = 0;
        long beg = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            double x = Math.random();
            double y = Math.random();
            if (dist(x, y) < 1) {
                inCounter++;
            }
        }
        long totalTime = System.currentTimeMillis() - beg;
    //    System.out.println(totalTime);
        return new Result(n, (double) inCounter / n * 4, totalTime);

    }

    public static void main(String[] args) {

        int n = 10000000;
//        System.out.printf("Value of pi from %d experiments is %f\n", n, evalPi(n));
//        System.out.printf("Value of pi from %d experiments is %f\n", n, evalPiOo(n));
        System.out.println(evalPi(n));
    }

}
