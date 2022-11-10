public class Ar_method_practice
{
    public static void multiply(int n)
    {
        int x=1;
        while (x<=10)
        {
            System.out.println(n+"  * "+x+ "= "+n*x);
            x++;
        }
    }
    public static void pattern(int x)
    {
        for(int i=x;i>=0;i--)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    public static int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
            return n + sum(n - 1);

    }
    public static int average(int n)
    {
        int m;
        m=n;
        if(n==0)
        {
            return 0;
        }
        return (n + sum(n - 1))/m;

    }
    public static int add(int x)
    {
        int j=0;
        for(int i=1;i<=x;i++)
        {
            j=j+i;
        }
        return j;
    }
    public static int fibo(int x)
    {
       // int y=0; int z=1;
        if (x==1 || x==2)
        {
            return x-1;
        }
        else
        {
          return fibo(x-1)+ fibo(x-2);
        }
    }
    public static float tempconvert(float x)
    {
        return (x * 9/5) + 32;

    }
    public static void pattern1(int x)
    {
        int y;
        y=x;
            while(y>0) {
                System.out.print("* ");
                y--;
            }
        System.out.println("");
        if(x==0)
        {
            return;
        }
            pattern1(x-1);

        }
        public static void pattern2(int x)
        {
            for(int i=1;i>0;i--)
            {
                System.out.print("* ");
            }
            System.out.println();
            if(x==0)
            {return;}
            pattern2(x-1);
        }
        //Write a function to print the nth term of the Fibonacci series using recursion.

    public static void main(String[] args)
    {
        //multiply(6);
        //pattern(5);
       // System.out.println("Total is "+sum(5));
       // System.out.println("Average is "+average(5));
       // System.out.println("Addition is "+add(5) );
        //System.out.println("Fibo number 5 "+ fibo(1,0,1 ));
        //System.out.println("Temp in feranite is "+tempconvert(44.06f));
        //pattern1(5);
       // pattern2(5);
        System.out.println(""+fibo(5));
    }
}
