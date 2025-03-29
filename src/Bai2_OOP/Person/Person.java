package Bai2_OOP.Person;

public class Person {
    public String name;
    public int age;
    public String gender;
    String address;
    String phone;

    public Person(String name, int age, String gender, String address, String phone){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phone = phone;
    }
    public Person(String name, int age, String gender){
        this.name = name;
        this.age= age ;
        this.gender = gender;
    }
    public void getBasicInfo(){
        System.out.println("Tên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Tuổi: " + age);
    }


    public void getInfo(){
        System.out.println("Tên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Tuổi: " + age);
        System.out.println("Địa chỉ: " + address);
        System.out.println("SĐT: " +phone);
    }
}
