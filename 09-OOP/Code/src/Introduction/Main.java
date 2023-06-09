package Introduction;

public class Main {

    public static void main(String[] args) {
        Student student1; // Declare
        student1 = new Student();//Initialize

        Student student2 = new Student(13,"sushant",88.5f); //In one line

//        student1.rno = 1;
//        student1.name = "Sushant";
//        student1.marks = 99.8f;

        System.out.println(student2.rno);
        System.out.println(student2.name);
        System.out.println(student2.marks);

        Student one = new Student();
        Student two = one;

        //Changing made by one refrence variable can lead to change in second reference varialbe

        two.name = "something something";

    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
        // this is how we call one constructer from another constructer
        this (12,"default person",100.0f);
    }

    Student(Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }

    public Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}