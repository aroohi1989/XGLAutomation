import java.sql.SQLOutput;
import java.util.Scanner;

public class Ar_Ifelse_Practice {
    public static void main(String[] args) {
        float income;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your income");
        income = sc.nextFloat();
        float tax = 0;

        if (income <= 250000) {
            tax = tax + 0f;
        } else if (income > 250000 && income <= 500000) {
            tax = tax + ((income - 250000) * 0.05f);
        } else if (income > 500000 && income <= 1000000) {
            tax = tax + ((500000 - 250000) * 0.05f);
            tax = tax + ((income - 500000) * 0.2f);

        } else if (income >= 1000000) {
            tax = tax + ((500000 - 250000) * 0.05f);
            tax = tax + ((1000000 - 500000) * 0.2f);
            tax = tax + ((income - 1000000) * 0.3f);
        }
        System.out.println("Tax to be paid is " + tax);
    }
}

