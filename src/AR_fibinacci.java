public class AR_fibinacci
{
    public static int fibonacci(int x, int y, int z)//x is number of times// y is 0, z is 1
    {

            int k;
            k=z;//2
            z=y+z;//z=3
        if(y==0)
        {
            System.out.print("0 ");
        }
        y=k;
            x--;
            System.out.print(y+" ");
            if(x==0)
            {
                return 0;
            }
        return z + AR_fibinacci.fibonacci(x, y, z);
    }
    public static void main(String[] args)
    {
        AR_fibinacci.fibonacci(15,0,1);

    }
}
