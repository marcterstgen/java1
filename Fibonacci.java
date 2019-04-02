package a.b.c;

public class Test {
    public static void main(String[] args) {
        for (int i = 0; i< 5; i++){
            System.out.println(Fibo(i));
        }
        }

public  static int Fibo(int num){
    if(num <= 2){
        return 1;
    }
    else {
        return Fibo (num-1) + Fibo(num-2);
    }
  }
}
