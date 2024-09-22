package recursion;

import java.util.*;

public class uniqueSubsequences {

    public static void Unique(String s, int idx, String ans, HashSet<String> set){
        if(idx==s.length()){
            if(!(set.contains(ans))){
                System.out.println(ans);
                set.add(ans);
            }
            return;
        }

        char curr=s.charAt(idx);

        // PICK
        Unique(s, idx+1, ans+curr, set);

        // Not PICK
        Unique(s, idx+1, ans, set);
    }


    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("enter a string: ");
            String s=sc.next();
            HashSet<String> set=new HashSet<>();
            Unique(s, 0, "", set);
        }
    }
}
