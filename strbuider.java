import java.util.*;

public class strbuider {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("uday");
        {
            //PRINT
            System.out.println(sb);
        }
        {
            // LENGTH
            sb.length();
        }
        {
            // CHAR AT INDEX
            System.out.println(sb.charAt(0));
        }
        {
            // SET CHAR AT INDEX
            sb.setCharAt(0, 'v');
            System.out.println(sb);
            sb.setCharAt(0, 'u');
        }
        {
            // INSERTING
            sb.insert(0, 'u');
            System.out.println(sb);
        }
        {
            // DELETE PART OF STRING
            sb.delete(0, 1);    //end index is exclusive
            System.out.println(sb);
        }
        {
            // APPENDING CHARACTER
            sb.append('y');   
            sb.append('y');    //adds char at end of string
            System.out.println(sb);
        }
        {
             // REVERSE A STRING
            for(int i=0;i<sb.length()/2;i++){
                char t=sb.charAt(i);
                sb.setCharAt(i, sb.charAt(sb.length()-1-i));
                sb.setCharAt((sb.length()-1-i), t);
            }
            System.out.println(sb);
        }
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder SB=new StringBuilder(s);
        s=SB.reverse().toString();
        System.out.println(s);
        sc.close();
    }
}
