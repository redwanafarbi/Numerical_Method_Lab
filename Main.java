public class Main {
    public static void main(String[] args) {

        bisection Bisect = new bisection((Math.random() * (-.00001)) , (Math.random() * 5) , 0.001);
        Bisect.bisect();

//        newtonRapson newton = new newtonRapson((Math.random()), 0.001);
//        newton.newton();

//        falsePosition falseposi = new falsePosition(Math.random()*-5, Math.random()*5, 0.001);
//        falseposi.falsePos();

//        secant Secant = new secant(Math.random()*-5, Math.random()*5, 0.001);
//        Secant.sec();

//        double[] x = {0,0.5,1.00};
//        double[] y = {1.0000, 0.6667, 0.5} ;
//        Trapezoidal tape = new Trapezoidal(3,0.5,x,y);
//        tape.trap();

    }
}