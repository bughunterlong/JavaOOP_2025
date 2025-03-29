package Exercise_onl.BT1;

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Sư tử", 20);
        Elephant elephant = new Elephant("Voi", 21);
        Monkey monkey = new Monkey("Khỉ", 22);
        lion.getSound();
        elephant.getSound();
        monkey.getSound();
    }
}
