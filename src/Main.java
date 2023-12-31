class Cylinder {
    private int radius , hieght ;
    public void setname (int radius , int hieght ) {
        this.radius = radius ;
        this.hieght= hieght;
    }
    public void getname() {
        System.out.println("the raduis of cylinder is :"+radius);
        System.out.println("the raduis of cylinder is :"+hieght);

    }
    double  area ;
    public void getarea(){
        area = 3.14 *radius*radius*hieght;
        System.out.println("the area of cyliinder is:"+area);
    }
}
public class Main {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setname(2,4);
        c1.getname();
        c1.getarea();


        System.out.println("Hello world!");
    }
}