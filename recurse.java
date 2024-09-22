public class recurse {
    public static long Fact(int n){
        if(n==1) return 1;
 
        return n*Fact(n-1);
         
     }
     public static void fib(int a, int b,int n){
        if(n==0) return;
        System.out.print(a+ " ");
        fib(b,a+b,n-1);

     }
     public static long pow(int x, int n){
        int m=1000000007;
        if(n==0) return 1;
        long a=pow(x,n/2);
        a=(a*a)%m;
        if(n%2==0) return a;
        return (a*x)%m;
     }
     public static void main(String[] args) {
         {
             // FACTORIAL
             long n=Fact(44);
             System.out.println(n);
         }
         {
            // Fibonacci Series
            int n=25;
            fib(0,1,n-2);
         }
         System.out.println();
         {
            // pow(x,n)
            int x=125,n=25;
            long res=pow(x,n);
            System.out.println(res);
         }
     }
}
