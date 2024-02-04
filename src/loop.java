public class loop {
    public static void main(String[] args) {
        // conditinal opertor in which we give condition to choice between
        // (if else , if elseif else , ternary operator ,
        int x=23,y= 17,z= 20;
        if(x<y){
            if(z<x){
                System.out.println(z+" "+x+" "+y);
            }
            else if(z>y) {
                System.out.println(x+" "+y+" "+z);
            }
            else {
                System.out.println(y+" "+z+" "+x);
            }
        }
        else{
            if(z<y){
                System.out.println(z+" "+y+" "+x);
            }
            else if(z>x) {
                System.out.println(y+" "+x+" "+z);
            }
            else {
                System.out.println(y+" "+z+" "+x);
            }

        }
    }
}
