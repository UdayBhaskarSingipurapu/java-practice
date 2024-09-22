package recursion;
import java.util.*;
public class towerOfHanoi {

    public static void TowerOfHanoi(int n, String src, String aux, String dest){
        if(n==1){
            System.out.println("Transfer disk "+ n + " from "+ src + " to " + dest);
            return;
        }
        TowerOfHanoi(n-1, src, dest, aux);
        System.out.println("Transfer disk "+ n + " from "+ src + " to " + dest);
        TowerOfHanoi(n-1, aux, src, dest);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n=sc.nextInt();
            TowerOfHanoi(n, "src", "aux", "dest");
        }
    }
}
