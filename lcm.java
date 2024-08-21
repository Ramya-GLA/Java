//Calculation of LCM
import java.util.*;

public class lcm {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        int A=sc.nextInt();
        int B =sc.nextInt();
        int LCM=(A>B)? A:B;
        while(LCM % A != 0 || LCM % B != 0) {
            LCM++;
        }

      
        System.out.println(LCM);

     
    }
}
