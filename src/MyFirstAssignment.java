import java.util.Scanner;

public class MyFirstAssignment
{
    public static void main(String[] args)
    {
        byte math;byte science; byte geography; byte english; byte hindi;
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter marks in Math");
        math=sc.nextByte();
        System.out.println("Please enter marks in Science");
        science=sc.nextByte();
        System.out.println("Please enter marks in Geography");
        geography =sc.nextByte();
        System.out.println("Please enter marks in english");
        english =sc.nextByte();
        System.out.println("Please enter marks in hindi");
        hindi =sc.nextByte();
        float total;
        total= math+science+geography+english+hindi;
        float percentage= (total/500)*100;
        System.out.println("Total is "+total);
        System.out.println("The percentage is "+percentage);

    }
}
