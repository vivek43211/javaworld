class parent{
    parent(){
        System.out.println("the parent contructor is called ");
    }
    parent(int x){
        System.out.println("the parent contructor with paremter value of x as: " +x);
    }
}
class child extends parent{
    child (){
       // super(5);
        System.out.println("the child  contructor is called ");
    }
    child(int x , int y){
        super(2);
        System.out.println(" the child contructor with paremter value of y as: " +y);
    }
}
class grantchild extends child{
    grantchild (){
        // super(5);
        System.out.println("the child  contructor is called ");
    }
    grantchild(int x , int y,int z){
        super(2,7);
        System.out.println(" the child contructor with paremter value of z as: " +z);
    }
}

public class construtor_inhertance {
    public static void main(String[] args) {
       // parent p= new parent();
        child ch = new child(7,9);
    }
}
