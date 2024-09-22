import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for(int a=1;a<=100;a++){
            sum+=a;
        }
        System.out.println("sum is "+ sum);


        //while 
        int num=sc.nextInt();
        int temp=num;
        int drev=0;
        while(num > 0){
            int res=num%10;
            drev=drev*10+res;
            num/=10;
        }
        System.out.println("reverse of " + temp + " is :" + drev);


        //do-while
        int i=1,sum1=0;
        do {
            sum1+=i;
            i++;
        } while(i<=100);
        System.out.println(sum1);
        
        //Math-table
        int table=sc.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println(table+" x "+j+" = "+(j*table));
        }
        sc.close();
    }
}
