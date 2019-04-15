package a.b.c;


import java.lang.Math;
class Change{
    public void fun(int num){
        int[] number = new int[32];
        double var = 1;int i = 0;
        double result = 0;
        for (;i <= 31;i++){
            number[i] = num%10;
            num = num/10;
            if(num==0)
                break;
        }
        int value = i;
        for(int j = 0;j - value <= j;j++){
            var = number[value];
            var = var*Math.pow(10,j);
            result = var+result;
            value--;
        }
        System.out.println((int)result);
    }
}
public class Test{
    public static void main(String[] args) {
        Change change = new Change();
        change.fun(-123);
    }
}
