package a.b.c;

public class Test {
    public static void main(String[] args) {
        System.out.println("桃子的总数是："+peach(1));
    }
    public static int peach(int n) {
        //n表示第几天
        if (n == 10) {
            return 1;
        }
        return (peach(n+1)+1)*2;
    }
}

