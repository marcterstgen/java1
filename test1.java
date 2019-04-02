package a.b.c;

public class Test {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.vehicle();
        Employee em = new Employee();
        em.play();
    }
}

 abstract class Role{
    private String Name;
    private  int Age;
    private  String Sex;
    public String getName(){
        return Name;
     }
     public  int getAge(){
        return Age;
     }
     public void setName(){
        this.Name = Name;
     }
     public void setAge(){
        this.Age = Age;
     }
     abstract void play();

     public Role() {
         System.out.println("嘤嘤嘤");
     }
     public Role(String Name, int Age) {
         this.Name = Name;
         this.Age = Age;
     }
}

  class Employee extends Role{
    private int salary;
    static int ID;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static int getID() {
        return ID;
    }

    public static void setID(int id) {
        ID = id;
    }

     public void play() {
         System.out.println("我在玩！！");

     }

     final public void sing() {
         System.out.println("我在唱歌！!");
     }

     public Employee() {
         System.out.println("Employee的无参构造器！");
     }
     public Employee(int salary) {
         super();
         this.salary = salary;
         System.out.println("Emoployee的有参构造器！");
     }

 }

class Manager extends Employee{
    final public void vehicle() {
        System.out.println("hahahahah!");
    }
}

