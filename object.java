package a.b.c;

class Person{
    private int age;
    private  String name;
    public Person(int age , String name){
        this.age = age;
        this.name = name;
    }
    public String toString(){
        return "年龄: "+this.age+"姓名: "+ this.name;
    }
}
class Student{

}
public class Test{
    public static void main(String[] args) {
       fun(new Person(15, "Messi" ));
       fun("hello");
       }
       public static void fun(Object obj){
           System.out.println(obj.toString());
       }
}
