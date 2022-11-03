import java.util.Scanner;

public class AR_SwitchPractice
{
    public static void main(String[] args) {
        byte x;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the day number of the week from 1-7");
        x=sc.nextByte();
        switch (x)
        {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
           default:
               System.out.println("Hurry its the best day");
        }
    }
}
