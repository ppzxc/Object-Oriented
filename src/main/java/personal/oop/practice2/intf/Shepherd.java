package personal.oop.practice2.intf;

public class Shepherd implements BlackFur{

    @Override
    public void bite() {
        System.out.println("[Shepherd] bite.");
    }

    @Override
    public void eat() {
        System.out.println("[Shepherd] eat.");
    }

    @Override
    public void sleep() {
        System.out.println("[Shepherd] sleep.");
    }

    @Override
    public void blackMolting() {
        System.out.println("[Shepherd] blackMolting.");
    }

    public void test() {
        System.out.println("[Shepherd] test.");
    }
}
