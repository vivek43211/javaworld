class Area{
    // the area of rectangle
    int area , breadth , length ;
    public void setter(int br,int lr){
        breadth= br;
        length = lr;
    }
    public void getter(){
        area = length * breadth ;
        System.out.println("area of rectangle :"+area) ;
    }
}

public class praticeq1 {
    public static void main(String[] args) {
        Area a1= new Area();
        a1.setter(2,7);
        a1.getter();


    }
}
