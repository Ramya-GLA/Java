import java.util.*;
public class leapyear{
    public static void main(String[]arg){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the year we want to check" );
        int yr=sc.nextInt();
        if((yr%4==0)&&(yr%100!=0)||(yr%400==0)){
            System.out.println("It's a Leap year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
