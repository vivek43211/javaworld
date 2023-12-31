 class Student {
     private String name;
     private int age;

     public Student(String name, int age) {
         this.name = name;
         this.age = age;

     }

     public void studentshow() {
         System.out.println("name:" + this.name);
         System.out.println("age:" + this.age);
     }
 }
public class accessmodifer {
    public static void main(String [] args ){
    Student ss = new Student("geeks", 10781);
        ss.studentshow();
}

}
