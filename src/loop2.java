public class loop2 {
    public static void main(String[] args) {
        // threee type of loop in java - for , while, do-while
        // for loops use to print muttiplication table
        /*int n=5;
        for (int i=1;i<=10;i++){
            System.out.println(n+"*"+i+"="+n*i);
        }
        int n1=7;
        for (int i=10;i>0;i--){
            System.out.println(n1+"*"+i+"="+n1*i);
        }

         */
        //use for loop to print pyarmid
        int k= 6;
        for(int i=1;i<=k;i++){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //use for loop to print reverse pyarmid
        for(int i=k;i>1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // use for loop to print right hand triangle
        for(int i=1;i<=k;i++){
            for (int z = 1; z <=k - i; z++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // reverse pyramid
        for(int i=k;i>1;i--){
            for (int z = 1; z <=k - i; z++) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
