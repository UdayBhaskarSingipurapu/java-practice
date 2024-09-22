


public class bitmanipulation {
    public static void main(String[] args) {
        
        {
            // GET BIT
            int n=20,i=4;
            // bit of n at pos 4
            int bit=((n>>i)&1);    // 0 or 1
            System.out.println(bit);
        }
        {
            // SET BIT
            /*
               BIT MASK : i<<i
               OPERATION : OR
             */
            int n=20,i=3;
            int bit=((1<<i)|n);
            System.out.println(bit);
        }
        {
            // CLEAR BIT  ->  Make a bit 0
            /*
               BIT MASK : i<<i
               OPERATION : AND with NOT
             */
            int n=20,i=2;
            int bit=((~(1<<i))&n);
            System.out.println(bit);
        }
        {
            // UPDATE BIT  ->  0 to 1 / 1 to 0
            /*
               BIT MASK : i<<i
               OPERATION : XOR
             */
            int n=20,i=0;
            int bit=((1<<i)^n);
            System.out.println(bit);
        }

    }
}
