package Exercise_onl.BT3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private double gpa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 18){
            this.age = age;
        }else{
            System.out.println("Tuổi không hợp lệ");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if(gpa >= 0.0 && gpa <=4.0){
            this.gpa = gpa;
        }else{
            System.out.println("GPA không hợp lệ ");
        }
    }
    public void displayInfo(){
        System.out.println("ID của student: " + id);
        System.out.println("Tên của student: " + name);
        System.out.println("Tuổi của student: " + age);
        System.out.println("GPA của student: " + gpa);
    }

    public static void main(String[] args) {
        Student student = new Student();
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập id: ");
        student.setId(input.nextLine());
        System.out.print("Nhập tên: ");
        student.setName(input.nextLine());
        do{
            System.out.print("Nhập tuổi: ");
            student.setAge(input.nextInt());
        }while(student.getAge() < 18);

        do {
            System.out.print("Nhập GPA: ");
            student.setGpa(input.nextFloat());
        }while(student.getGpa() <= 0.0 || student.getGpa() >=4.0);

        student.displayInfo();


    }
}
