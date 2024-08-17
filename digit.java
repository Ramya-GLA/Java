// Given an integer and print the number of digits it has
import java.util.*;
public class digit {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
        int digits=0;

        while(num>0){
            num/=10;
            digits++;
        }
        System.out.println(digits);

    }

    
}
