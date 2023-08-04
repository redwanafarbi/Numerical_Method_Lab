import static java.lang.Math.abs;

public class falsePosition {
    private double a ;
    private double b ;
    private double epsilon ;

    public falsePosition(double a, double b, double epsilon) {
        this.a = a;
        this.b = b;
        this.epsilon = epsilon;
    }

    private double fun(double x)
    {
        return ((x*x*x) - (2*x) + 1) ;
    }

    private boolean isValid(double x , double y)
    {
        if((x * y) < 0)  return  true;
        else return false;
    }

    public void falsePos()
    {
        if(!isValid(fun(a),fun(b)))
        {
            System.out.println("Invalid output");
            return;
        }

        double root = 0;
        double count = 0 ;

        do{
            count++ ;
            System.out.print("Iteration: " + count + " | ");

            double f_a = fun(a);
            double f_b = fun(b) ;

            root = (a*f_b - b*f_a)/(f_b - f_a);
            System.out.println("Root = " + root);

            if(fun(a) * fun(root) < 0)
            {
                b = root;
            }
            else
            {
                a = root ;
            }


        }while (abs(fun(root)) > epsilon);

        System.out.println("Final Root = " + root);

    }

}
