package a.b.c;

public class Test {
    public static void main(String[] args) {
        for (int i =100; i < 1000 ; i++){
            int x = i % 10;
            int y = i/10 % 10;
            int z = i/100%10;
            if(x*x*x+y*y*y+z*z*z == i){
                System.out.println(i);
            
            }
        }
    }
}

