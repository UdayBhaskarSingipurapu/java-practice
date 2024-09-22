package recursion;

import java.util.Scanner;

public class keypad {
    
    public static String[] mapping={".", "abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printcomb(String s, int idx, String combination){
        
        if(idx==s.length()){
            System.out.println(combination);
            return;
        }

        char curr=s.charAt(idx);
        String key=mapping[curr-'0'];
        for(int i=0;i<key.length();i++){
            printcomb(s, idx+1, combination+key.charAt(i));
        }
    }


    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter number string: ");
            String s=sc.next();
            printcomb(s, 0, "");
        }
    }
}
