import java.util.Random;
import java.util.Scanner;

public class AR_RockPaperSissors
{
    public static void main(String[] args)
    {
        int comp;int user;
        int userscore=0; int compscore=0;
        Random rd= new Random();
       comp= rd.nextInt(1,3);
       String compselction;
       if(comp==1)
       {
           compselction="Rock";
       }
       else if (comp==2)
       {
           compselction="Paper";
       }
       else {
           compselction="Scissors";
       }
        System.out.println("Computer selection "+compselction);
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter 1 for rock, 2 for paper, 3 for scissors");
        user=sc.nextInt();
        if(user!=comp)
        {
            if ((user==1 && comp==3)|| (user==2 && comp==1) || (user==3 && comp==2) )
            {
                System.out.println("User won");
            } else if ((comp==1 && user==3)||(comp==2 && user==1) || (comp==3 && user==2))
            {
                System.out.println("Computer won");
            }
        }
        else {
            System.out.println("Its a tie");
        }
    }
}
