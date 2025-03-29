package Exercise_onl.BT1;

public class Monkey extends Animal {
    public Monkey(String name, int age) {
        super(name, age);
    }
    @Override
    public void getSound(){
        System.out.println("Chít chít");
    }
}
