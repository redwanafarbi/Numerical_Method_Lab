public class Trapezoidal {
    private int arraySize;
    private double h ;
    private double x[];
    private double y[];

    public Trapezoidal(int arraySize, double h, double[] x, double[] y) {
        this.arraySize = arraySize;
        this.h = h;
        this.x = x;
        this.y = y;
    }

    public void trap()
    {
        double sum = 0;
        int Size = arraySize - 1 ;
        double last_value = y[0] + y[Size];

        double temp = 0 ;
        for(int i = 1 ; i<= arraySize-2 ; i++)
        {
            temp += y[i];
        }


        sum = (h/2) * (last_value + (2*temp)) ;

        System.out.println("Sum = " + sum);
    }

}
