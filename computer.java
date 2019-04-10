package a.b.c;
 interface Computer{
    int Computer(int m,int n);
 }

 class Jia  implements Computer{
    public int Computer(int n , int m){
        return n + m;
    }


 }
 class Jian implements Computer{
    public int Computer(int n, int m) {
        return n-m;
    }


 }
 class Cheng implements Computer{
    public int Computer(int n, int m) {
        return n*m;
    }

 }
class Chu implements Computer{
    public int Computer(int n, int m) {
        if(m!=0) {
            return n/m;
        }else {
            System.out.println("分母不能为零");
            return 0;
        }
    }

}

class UseCompute{
    public void usecom(Computer com,int n,int m) {
        System.out.println(com.Computer(n, m));
    }
}
public class Test {
    public static void main(String[] args) {
        UseCompute useCompute = new UseCompute();
        useCompute.usecom(new Jia(), 10, 20);
        useCompute.usecom(new Jian(), 10, 20);
        useCompute.usecom(new Cheng(), 10, 20);
        useCompute.usecom(new Chu(), 10, 20);
        useCompute.usecom(new Chu(), 10, 0);
    }
}
