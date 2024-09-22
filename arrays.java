import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();

        int num[]=new int[size];
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<size;i++){
            sum+=num[i];
        }
        System.out.println(sum);


        sc.close();
    }
}
