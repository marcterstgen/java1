package a.b.c;

import sun.nio.ch.sctp.MessageInfoImpl;

public class Test{
    public static void main(String[] args) {
        String msg ="Hello World" + new Person(15,"messi");
        System.out.println(msg);
    }
        public static void fun(Object obj) {
        System.out.println(obj.toString());
        }
    }

class Stundent{

}
class Person{
    private int age;
    private String name;
    public Person(int age,String name){
        this.name =name ;
        this.age = age;
    }

    @Override
    public String toString() {
        return "姓名: "+name+"年龄: " +age;

    }

    public String getName() {
        return name;
    }
    public  int getAge(){
        return age;
    }
}
