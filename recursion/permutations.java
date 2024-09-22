package recursion;
import java.util.*;
public class permutations {

    public static void printPerm(String s, String current, Boolean[] visited){

        if(current.length()==s.length()){
            System.out.println(current);
            return;
        }

        for(int i=0;i<s.length();i++){
            if(!(visited[i])){
                visited[i]=true;
                printPerm(s, current+s.charAt(i), visited);
                visited[i]=false;
            }
        }
    }


    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.print("enter a string: ");
            String s=sc.next();
            Boolean[] visited=new Boolean[s.length()];
            Arrays.fill(visited, false);
            printPerm(s,"",visited);
        }
    }
}
