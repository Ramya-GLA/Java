//Sum of all the odd numbers in the given range
import java.util.*;
public class oddsum {
   public static void main (String[] args){
    Scanner sc= new Scanner(System.in);
    int A = sc.nextInt();
    int sum=0;
    for(int i =1;i<=A;i++){
        if (i% 2 !=0){
            sum+=i;

        }
    }
    System.out.println(sum);
   }
}
