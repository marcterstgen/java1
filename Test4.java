package a.b.c;
class Orange implements IFruit {
    @Override
    public void eat() {
        System.out.println("[Orange] 吃橘子 ");
    }
}
class FruitFactory {
    private FruitFactory() {}
    public static IFruit getInstance(String className) {
        if ("apple".equals(className)) {
            return new Apple() ;

        }else if ("orange".equals(className)) {
            return new Orange() ;
        }
        return null;
    }
}
