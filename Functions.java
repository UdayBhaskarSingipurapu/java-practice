/**
 * Functions
 * return_type fn_name(type arg1, type arg2...){
 *   //operations
 * }
 */
import java.util.*;
public class Functions {
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static int add(int a, int b) {
        return a+b;
    }

    public static int fact(int c){
        int f=1;
        for(int i=1;i<=c;i++) f*=i;
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt(),b=sc.nextInt();
        System.out.println("Sum is: "+ add(a,b));
        int c=sc.nextInt();
        System.out.println("factorial of "+c +" is : "+ fact(c));
        String s=sc.next();
        printName(s);
        sc.close();
    }
}