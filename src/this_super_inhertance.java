class ekclass{
    int x;
    public int getx(){
        return x;
    }
    //contructor with one parameter
    ekclass(int x){
        //x=x;   // then it give error or shoe 0 value

        this.x=x;    // this keyword use to referencce the object of the class which is bieng creted

    }
}
 class child1 extends ekclass{
    child1 (int x,int y){
        super(7);
        System.out.println(+y);
    }
 }

public class this_super_inhertance {
    public static void main(String[] args) {

        child1 ec = new child1(8,9);
        System.out.println(ec.getx());
    }
}
