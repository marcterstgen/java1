package a.b.c;

public class Test {
    public static void main(String[] args) {
        Father.Child child = new Father().new Child();
        child.intoFather();
    }
}

class Father{
    private String name = "zhangjun";
    class Child{
        public void intoFather(){
            System.out.println(name);
        }
    }
}
