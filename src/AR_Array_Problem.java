import java.util.Scanner;

public class AR_Array_Problem
{
    public static void main(String[] args)
    {
     /*float [] amt = {22.9f,22.4f,82.2f,77.0f,33.3f};
     float sum=0.0f;float total=0.0f;
     for (int i=0;i<amt.length;i++)
     {
         total=total+amt[i];
     }
        System.out.println("Total is "+total);
        for (float ele: amt)
        {
            sum=sum+ele;
        }
        System.out.println("Sum is "+sum );
    }
*/
/*// Problem 2:
        int [] arr={34,24,32,52,33};
        int x=152; boolean f=false;
        for (int ele:arr)
        {
             if(ele==x)
             {
                 System.out.println(x+" is present in the array");
                 f=true;
                 break;
             }
        }
        if(f==false)
        {
            System.out.println(x+" is not present in the array");
        }*/
/*
    float [] marks= new float[5];
    float sum=0.0f;
        Scanner sc= new Scanner(System.in);
    for(int i=0;i<marks.length;i++)
    {
        System.out.println("Please enter marks of student in physics");
        marks[i]=sc.nextFloat();
    }
        for (float ele:marks)
        {
            sum=sum+ele;
        }
        System.out.print("Sum is ");
        System.out.format("%.2f",sum);*/
        //Question 4
       /* Scanner sc= new Scanner(System.in);

        int [][] flats= new int[2][3];
        for(int i=0;i< flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                System.out.println("Please enter flat number");
             flats[i][j]=sc.nextInt();
            }
        }
        System.out.println("Output is");
        for(int i=0;i< flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
*/
        //Question 5
        /*int [] arr1= {25,30,35,40,45};
        int [] arr2= new int[5];
        int x=arr2.length-1;
        for(int i=0;i<arr1.length;i++)
        {
            if(x>=0)
            {
                arr2[x]=arr1[i];
            }
        x--;
        }
        for (int ele:arr2)
        {
            System.out.print(ele);
            System.out.println(" ");
        }*/
        int [] arr1= {25,30,35,40,45};
        int x=0;
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]>=x)
            {
                x=arr1[i];
            }
        }
        System.out.println(" highest in array is "+x);
    }}
