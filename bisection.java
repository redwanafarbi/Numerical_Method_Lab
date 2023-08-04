import static java.lang.Math.abs;

public class bisection {

    private double left ;
    private double right ;
    private double epsilon ;

    public bisection(double left, double right, double epsilon) {
        this.left = left;
        this.right = right;
        this.epsilon = epsilon;
    }

    private double fun(double x)
    {
        return ((x*x*x) - (2*x) + 1) ;
    }

    private boolean isValid(double left, double right)
    {
        if((left * right) < 0)
            return true ;
        else
            return false ;
    }

    public void bisect()
    {

        if(!isValid(fun(left), fun(right)))
        {
            System.out.println("No root exist between the given range");
            return;
        }

        double root = 0 ;
        int iteration = 1 ;

        do{
            System.out.print("Iteration no: " + iteration + " | a = " + left + " b = " + right + " ");
            root = (left+right)/2 ;
            System.out.println("Root = " + root);

            if(fun(left) * fun(root) < 0)
            {
                right = root ;
            }
            else
            {
                left = root ;
            }

            iteration++ ;

        }while(abs(fun(root)) > epsilon) ;

        System.out.format("Final root = " + "%.3f", root);

    }
}
