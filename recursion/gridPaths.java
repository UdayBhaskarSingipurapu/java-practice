package recursion;

import java.util.Scanner;

public class gridPaths {
    public static int countPaths(int i, int j, int n, int m){
        if(i==n || j==m) 
            return 0;
        if(i==n-1 && j==m-1)
            return 1;

        return countPaths(i+1, j, n, m)+countPaths(i, j+1, n, m);
    }


    public static void main(String[] args) {
        // WE CAN MOVE ONLY RIGHT OR DOWN
        try(Scanner sc=new Scanner(System.in)){
            int n=sc.nextInt(),m=sc.nextInt();
            int res=countPaths(0,0,n,m);
            System.out.println(res);
        }
    }
}
