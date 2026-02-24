package Oops.Constructor;

public class StudentTest {
    public static void main(String[] args){
    Student student = new Student("ram", 2, 23);
    System.out.println(student.getAge());
    System.out.println(student.getName());
    System.out.println(student.getRollNumber());

    Student student1 = new Student("Shayam");
    System.out.println(student1.getName());
}
}
