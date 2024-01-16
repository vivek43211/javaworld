import javax.sound.midi.Soundbank;

public class type_ofconverion {
    public static void main(String[] args) {
        // type of conversion of datatyopes of variable
        // automatic and manually
        // automatic = from small to big one , manulally = from vice versa
        // widenning casting
        byte a= 123;
        int b = a;
        System.out.println(b);

        // narrowing casting
        int i = 345;
        byte y = (byte)i;
        System.out.println(y);

        float f = 5.6f;
        int w = (int )f;
        System.out.println(w);

        //  type promotion = when opertion on two operands ad thier result is out of range then java promote the result
        byte c =10;
        byte d= 30;
        int result = c*d;
        System.out.println(result);


    }
}
