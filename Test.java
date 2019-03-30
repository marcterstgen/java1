package a.b.c;


enum Color{
    RED("红色"),GREEN("绿色"),BLUE("蓝色");
    private String title;
    private  Color (String title){
        this.title = title;
    }
    public String toString(){
        return this.title;
    }
 }

public class Test{
    public static void main(String[] args) {
        System.out.println(Color.BLUE);
    }
}