import java.util.*;
public class pattern5 {
    public static void main (String arg[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
