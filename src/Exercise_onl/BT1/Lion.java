package Exercise_onl.BT1;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void getSound(){
        System.out.println("Gầm gừ");
    }



}
