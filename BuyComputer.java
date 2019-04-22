package a.b.c;

import java.util.Scanner;
interface Computer{
    void printComputer();
}

class Macbook implements Computer{
    @Override
    public void printComputer() {
        System.out.println("This is a Macbook");
    }
}
class Surface implements  Computer{
    @Override
    public void printComputer() {
        System.out.println("This is a Surfacebook");
    }
}

class Computerfactory{
    public static Computer getInstance(String type){
        Computer computer = null ;
        if(type.equals("macbook")){
            computer = new Macbook();
        }
        else if(type.equals("Surface")){
            computer = new Surface();
        }
        return computer;
    }
}
class Test{
    public void BuyComputer(Computer computer){
        computer.printComputer();
        }
    public static void main(String[] args) {
        Test t1 =new Test();
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入您想要的电脑型号...");
        String type =scanner.nextLine();
        Computer computer = Computerfactory.getInstance(type);
        t1.BuyComputer(computer);

    }
}
