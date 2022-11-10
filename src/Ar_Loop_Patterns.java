public class Ar_Loop_Patterns
{
    public static void main(String[] args)
    {
        //for (int i=4;i>=1;i--)
        //{
          //  for(int j=i;j>=1;j--)
            //{
              //  System.out.print("*");
            //}
            //System.out.println();
        //}

       // int k= 25;
       /* int l=0;
        while(k>l)
        {
           l= l+2;
           if(l>k)
           {
               break;
           }
            System.out.println("Even numbers are");
            System.out.println(l);
        }*/
       /* int i=4;
        while(i>=1)
        {
            int j;
            j=i;
            while(j>=1)
            {
                System.out.print("*");
                j--;
            }
            i--;
            System.out.println();
        }*/
        // Factorial of a number
        int x=4;int y=1;
        for(int i=x;i>=1;i--)
        {
            y=i*y;
        }
        System.out.println("Factorial of "+x+" is " +y);
    }
}
