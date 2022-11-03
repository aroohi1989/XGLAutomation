public class Ar_LeapYear
{
    public static void main(String[] args) {

        int year=1600;
        if (year%4==0 )
        {
            if(year%100==0 )
            {
                if(year%400==0)
                 {
                         System.out.println("Its a leap year");
                 }
                else
                {
                    System.out.println("Its not a leap year");
                }
            }
            else
            {
                System.out.println("Its a leap year");
            }
        }
        else {
            System.out.println("Its not a leap year");
        }

        String str= "www.facebook.com";

        if(str.endsWith(".com"))
        {
            System.out.println("Its a commercial website");
        } else if (str.endsWith(".in")) {
            System.out.println("Its a Indian website");
        } else if (str.endsWith(".org")) {
            System.out.println("Its a Organizational website");
        }

    }
}
