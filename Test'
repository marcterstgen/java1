package a.b.c;

enum Sex {
    MALE("男"),FEMALE("女") ;
    private String title ;
    private Sex(String title) {
        this.title = title ;
    }
    @Override
    public String toString() {
        return this.title ;
    }

}
class Person {
    private String name ;
    private int age ;
    private Sex sex ;
    public Person(String name, int age, Sex sex) {
        super();
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Person per = new Person("张三", 20, Sex.MALE) ;
        System.out.println(per);
    }
}
