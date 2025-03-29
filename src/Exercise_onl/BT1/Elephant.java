package Exercise_onl.BT1;

public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public void getSound(){
        System.out.println("Ù ù");
    }
}
