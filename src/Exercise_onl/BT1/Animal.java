package Exercise_onl.BT1;

public class Animal {
    public String name;
    public int age;

    public Animal(String name, int age){
        this.name = name;
        this.age= age;
    }
    protected void getSound(){
        System.out.println("Động vật kêu");
    }
    public void getAnimal(){
        System.out.println("Name: " +name);
        System.out.println("Age: " + age);
    }
}
