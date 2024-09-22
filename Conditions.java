import java.util.*;

public class Conditions {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age >= 18){
            System.out.println("can cast your vote");
        } else {
            System.out.println("can't cast your vote");
        }
        int z=sc.nextInt();
        if(z%2==0){
            System.out.println(z+" is even");
        } else {
            System.out.println(z+" is odd");
        }

        //else-if
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x==y){
            System.out.println("equal");
        }
        else if(x>y){
            System.out.println("x is greater than y");
        }
        else {
            System.out.println("y is greater than x");
        }
       

        //switch
        int a=sc.nextInt();
        int b=sc.nextInt();
        char c=sc.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println("sum is "+( a+b));
                break;
            case '-':
                System.out.println("diff is "+ (a-b));
                break;
            case '*':
                System.out.println("product is " + (a*b));
                break;
            case '/':
                System.out.println("quotient is " + (a/b));
                break;
            default:
                System.out.println("invalid operation");
                break;
        }
        sc.close();

    }
}
