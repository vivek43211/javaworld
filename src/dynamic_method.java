class phone{
    public void showtime(){
        System.out.println("time is 1 am");
    }
    public void name(){
        System.out.println("my name is phone");
    }
}
class smartphone extends phone{
    public void music (){
        System.out.println("play the music ");
    }
    @Override
    public void name(){
        System.out.println("my name is smartphone");
    }
}

public class dynamic_method {
    public static void main(String[] args) {
        phone obj = new smartphone(); // allowed
        //smartphone obj1 = new phone(); not allowed
        obj.name();
        obj.showtime();
//        obj.music(); not allowed
    }
}
// dynamic method dispatch = run time polymoriphism
// to called to resolve the overridden method at run time rather than complier time
//dynamic method dispatch is based on upcasting
// upcasting is technique in which a superclass reference variable refers to the object of the subclass