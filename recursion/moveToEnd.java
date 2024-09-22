package recursion;

import java.util.Scanner;

public class moveToEnd {
    public static String ans="";

    public static void movingCharToEnd(String s, int idx, char ch, int cnt){
        if(idx==s.length()){
            for(int i=0;i<cnt;i++){
                ans+=ch;
            }
            return;
        }
        if(s.charAt(idx)==ch){
            cnt++;
            movingCharToEnd(s, idx+1, ch, cnt);
        }
        else {
            ans+=s.charAt(idx);
            movingCharToEnd(s, idx+1, ch, cnt);
        }

    }


    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("Enter a string:");
            String s=sc.next();
            System.out.println("Enter character to move it end:");
            char ch=sc.next().charAt(0);
            movingCharToEnd(s, 0, ch,0);
            System.out.println(ans);
        }
    }
}
