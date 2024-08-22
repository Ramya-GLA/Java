import java.util.*;
public class fac {
    public static void main (String[] arg){
        Scanner sc=new Scanner(System.in);
        int Num=sc.nextInt();
        int factorial=1;
        for(int i = 1;i<=Num;i++){
            factorial*=i;

        }
        System.out.println(factorial);

    }
}
