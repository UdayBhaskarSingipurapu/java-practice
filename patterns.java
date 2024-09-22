import java.util.*;

public class patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int rows=sc.nextInt();
        System.out.println("enter number of columns:");
        int cols=sc.nextInt();
        
        //solid rectangle pattern
        /*
            ****
            ****
            ****
         */
        for(int i=0;i<rows;i++){  
            for(int j=0;j<cols;j++){                  
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        //hollow rectangle
        /*
            *****
            *   *
            *   *
            *****
         */
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || j==0 || i==rows-1 || j==cols-1){
                    System.out.print("*");
                }
                else System.out.print(" ");
               
            }
            System.out.println();
        }
        System.out.println();

        //half pyramid
        /*
          *
          **
          ***
          ****
         */
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        //inverted half pyramid
        /*
          *****
          ****
          ***
          **
          *
         */
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols-i;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        //rotated inverted half pyramid
        /*
               *
              **
             ***
            ****  
         */
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols-i-1;j++){
                System.out.print(' ');
            }
            for(int j=cols-i-1;j<cols;j++){
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println();

        //number half pyramid
        /*
          1
          12
          123
          1234
         */
        for(int i=0;i<rows;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        System.out.println();

        //inverted number half pyramid
        /*
          12345
          1234
          123
          12
          1
         */
        for(int i=0;i<rows;i++){
            int z=0;
            for(int j=cols;j>i;j--){
                System.out.print(z+1);
                z++;
            }
            System.out.println();
        }
        System.out.println();

        //floyd triangle
        /*
          1
          2 3
          4 5 6
          7 8 9 10
          11 12 13 14 15
         */
        int z=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(z++ + " ");
                
            }
            System.out.println();
        }
        System.out.println();

        //0-1 triangle
        /*
          1
          0 1
          1 0 1
          0 1 0 1
          1 0 1 0 1
         */
        int num;
        for(int i=0;i<rows;i++){
            if(i%2==0) num=1;
            else num=0;
            for(int j=0;j<i+1;j++){
                if(num==1){
                    System.out.print(num + " ");
                    num=0;
                }
                else {
                    System.out.print(num + " ");
                    num=1;
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
