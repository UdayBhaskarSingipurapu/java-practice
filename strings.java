import java.util.*;


public class strings {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String a=sc.nextLine();
            String b=sc.nextLine();
            {
                //CONCATENATION
                String fullName=a+" "+b;
                System.out.println(fullName);
            }
            {
                //LENGTH
                int n=a.length();
                System.out.println(n);
            }
            {
                //Printing by character
                for(int i=0;i<a.length();i++){
                    System.out.print(a.charAt(i)+ " ");
                }
            }
            System.out.println();
            {
                //COMPARE STRINGS
                if(a.compareTo(b)==0){
                    System.out.println("strings are equal");
                }
                else {
                    System.out.println("strings are not equal");
                }
                if(a==b){
                    System.out.println("strings are equal");
                }
                else {
                    System.out.println("strings are not equal");
                }
                if(new String("tony")==new String("tony")){
                    System.out.println("strings are equal");                    //this won't work
                }
                else {
                    System.out.println("strings are not equal");
                }
            }
            {
                //SUBSTRINGS
                /*
                * we use sustring function
                * a.substring(beg index,end index)
                * end index is exclusive...if end index isn't given then beg index to end of string will become substring.
                */
                String sub="UdayBhaskar";
                System.out.println(sub.substring(0,4));
            }
        }
    }
}
