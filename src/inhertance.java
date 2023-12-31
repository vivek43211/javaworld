class Animal{
    public void animalname(){

        System.out.println("name is dog ");
    }
}
class dog extends Animal{
    public void noise (){
        System.out.println("the sounds  make by him ");
    }
}
public class inhertance {

    public static void main(String[] args) {

        dog d = new dog();
        d.animalname();
        d.noise();

    }
}
