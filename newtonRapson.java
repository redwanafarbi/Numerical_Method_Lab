import static java.lang.Math.abs;

public class newtonRapson {
    private double initialvalue;
    private double epsilon ;

    public newtonRapson(double initialvalue, double epsilon) {
        this.initialvalue = initialvalue;
        this.epsilon = epsilon;
    }

    private double fun(double x)
    {
        return ((x*x) - (2*x) + 1);
    }

    private double derivative_fun(double x)
    {
        return ((2*x)-2);
    }

    public void newton()
    {
        int iteration = 1 ;
        double root = initialvalue ;

        do{
            System.out.print("Iteration: " + iteration + " | ");
            double fun_value = fun(root);
            double derivative_value = derivative_fun(root);

            root = root - (fun_value / derivative_value);
            System.out.println("root = " + root);

            iteration++ ;

        }while(abs(fun(root)) > epsilon);

        System.out.println("Final root = " + root);


    }
}
