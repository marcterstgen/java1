package a.b.c;

interface IColor {
    public String getColor() ;
}
enum Color implements IColor{
    RED("红色"),GREEN("绿色"),BLUE("蓝色") ; // 如果定义有很多内容，枚举对象必须写在第一行
    private String title ;
    private Color(String title) { // 构造方法私有化
        this.title = title ;
    }
    @Override
    public String toString() {
        return this.title ;
    }
    @Override
    public String getColor() {
        return this.title ;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        IColor iColor = Color.BLUE ;
        System.out.println(iColor.getColor());
    }
}