package Oops.Constructor;

public class Student {
    private String name;
    private int rollNumber;
    private int age;


    // Constructors

    public Student(String name, int rollNumber, int age){
        this.age = age;
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public Student(String name){
        this.name = name;
    }
    

    
    // Getter / Setter

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollNumber() {
        return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        if(age < 0){
            age = 0;
        }
        this.age = age;
    }

}
