package a.b.c;

import java.util.Scanner;
interface Computer {
    void printComputer();
}
class MacbookProComputer implements Computer {
    public void printComputer() {
        System.out.println("This is a MacbookPro");
    }
}
class SurfaceBookComputer implements Computer {
    public void printComputer() {
        System.out.println("This is a SurfaceBook");
    }
}
interface OperatingSystem {
    void printSystem();
}
class MacOsSystem implements OperatingSystem {
    public void printSystem() {
        System.out.println("This is a mac os");
    }
}
class Windows8System implements OperatingSystem {
    public void printSystem() {
        System.out.println("This is a windows10");
    }
}
interface ProductionFactory {
    Computer createComputer();
    OperatingSystem createSystem();
}
class AppleFactory implements ProductionFactory {
    public Computer createComputer() {
        return new MacbookProComputer();
    }
    public OperatingSystem createSystem() {
        return new MacOsSystem();
    }
}
class MsFactory implements ProductionFactory {
    public Computer createComputer() {
        return new SurfaceBookComputer();
    }
    public OperatingSystem createSystem() {
        return new Windows8System();
    }
}
public class Test {
    public void buyComputer(Computer computer) {
        computer.printComputer();
    }
    public void use(OperatingSystem s) {
        s.printSystem();
    }
    public static void main(String[] args) {
        Test test = new Test();
        ProductionFactory factory = new AppleFactory();
        Computer computer = factory.createComputer();
        OperatingSystem system = factory.createSystem();
        test.buyComputer(computer);
        test.use(system);
    }
}
