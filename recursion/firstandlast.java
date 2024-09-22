package recursion;
import java.util.*;
public class firstandlast {
    public static int first=-1;
    public static int last=-1;
    
    public static void Occurrences(String s, int idx, char ch){
        if(idx==s.length()-1){
            return;
        }

        if(s.charAt(idx)==ch){
            if(first==-1){
                first=idx;
            }
            last=idx;
        }
        Occurrences(s, idx+1, ch);
    }


    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("enter string:");
            String s=sc.next();
            System.out.print("enter char:");
            char ch=sc.next().charAt(0);
            Occurrences(s, 0, ch);
            System.out.println(first);
            System.out.println(last);

        }
    }
}
