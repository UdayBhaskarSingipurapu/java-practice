package recursion;

import java.util.Scanner;
public class Subsequences {

    public static void printSequences(String s, int idx, String ans){

        if(idx==s.length()){
            System.out.println(ans);
            return;
        }

        char ch=s.charAt(idx);
        // PICK
        printSequences(s, idx+1, ans+ch);

        // NOT PICK
        printSequences(s, idx+1, ans);
    }


    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("enter string: ");
            String s=sc.next();
            printSequences(s,0,"");
        }
    }
}
