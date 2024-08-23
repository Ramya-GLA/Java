//Java program to reverse a string
import java.util.*;
public class reversing {
    public static void main(String[]arg){
        Scanner sc= new Scanner(System.in);
         String Word=sc.nextLine();
          String revWord=" ";
          for(int i =0;i<Word.length();i++){
            revWord=Word.charAt(i)+revWord;
          }
          System.out.println(revWord);

    }
    
}
