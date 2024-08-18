//GIven a stream of number,read a numbers till you read a -ve integer and print the sum of numbers you read so far.
import java.util.*;
class number{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num;
        int sum=0;
        System.out.print("Enter the numbers");
        do{
            
            num=sc.nextInt();
            sum+=num;
        }while(num>=0);
        System.out.println("Sum =" + sum);
    }

}
    

