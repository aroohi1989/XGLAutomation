import java.sql.SQLOutput;
import java.util.Scanner;

public class ConvertToLowerCase
{
    public static void main(String[] args) {

        System.out.println("Please enter string to be converted to lower case");
        Scanner sc= new Scanner(System.in);
        String st=sc.nextLine();
        int len;
        
        len=st.length();
        String str1="";
        for(int i=0;i<len;i++)
        {
            char ch= st.charAt(i);
            if(ch>=65 && ch<=90)
            {
                ch= (char)(ch+32);
            }
            str1= str1+ch;
        }
        System.out.println("Lower case is : "+str1);
    }
}
