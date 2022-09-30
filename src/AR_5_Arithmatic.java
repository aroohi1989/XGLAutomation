import javax.security.auth.kerberos.EncryptionKey;
import java.util.Scanner;

public class AR_5_Arithmatic
{
    public static void main(String[] args)
    {
        /*char grade='B';
       // Encrypt
        int e=grade+8;
        System.out.println(e);
        //Decrypt
        char G=(char)(e-8);
        System.out.println(G);*/
        int x=57;
        System.out.println("Please enter an integer");
        Scanner sc= new Scanner(System.in);
        int y =sc.nextInt();
        if (x>y)
        {
            System.out.println(x+" is greater than inputted value "+y);
        } else if (x<y) {
            System.out.println(y+" inputted value is greater than "+x);
        }
        else {
            System.out.println("Both numbers are equal");
        }
    }
}
