package Bai1_OOP;

public class NhanVien {
    String name;
    int age;
    String gender;
    String birthday;

    // Tạo hàm constructor có tên trùng với tên class
    public NhanVien(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    public void getInfo(){
        System.out.println("Tên: " + name);
        System.out.println("Giới tính: " + gender);
        System.out.println("Tuổi: " + age);

    }
}
