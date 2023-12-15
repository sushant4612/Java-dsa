package Assigment3;

import java.util.ArrayList;

// Define the superclass Person
class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

// Define the subclass Student
class Student extends Person {
    private ArrayList<String> courses;
    private ArrayList<String> grades;

    public Student(String name, String address) {
        super(name, address);
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Method to add a course and grade
    public void addCourse(String course, String grade) {
        courses.add(course);
        grades.add(grade);
    }

    // Method to print course-wise grades
    public void printGrades() {
        System.out.println("Student: " + getName());
        for (int i = 0; i < courses.size(); i++) {
            System.out.println("Course: " + courses.get(i) + ", Grade: " + grades.get(i));
        }
    }
}

// Define the subclass Teacher
class Teacher extends Person {
    private ArrayList<String> coursesTaught;

    public Teacher(String name, String address) {
        super(name, address);
        this.coursesTaught = new ArrayList<>();
    }

    // Method to add a course taught
    public void addCourseTaught(String course) {
        coursesTaught.add(course);
    }

    // Method to remove a course taught
    public void removeCourseTaught(String course) {
        coursesTaught.remove(course);
    }

    // Method to print allotted courses
    public void printCoursesTaught() {
        System.out.println("Teacher: " + getName());
        System.out.println("Courses Taught: " + String.join(", ", coursesTaught));
    }
}

public class Q1 {
    public static void main(String[] args) {
        // Create instances of students and teachers
        Student student1 = new Student("Alice", "123 Main St");
        Student student2 = new Student("Bob", "456 Elm St");
        Teacher teacher1 = new Teacher("Mr. Smith", "789 Oak St");
        Teacher teacher2 = new Teacher("Ms. Johnson", "101 Pine St");

        // Add courses and grades for students
        student1.addCourse("Math", "A");
        student1.addCourse("History", "B");
        student2.addCourse("Science", "A");

        // Add courses taught for teachers
        teacher1.addCourseTaught("Math");
        teacher1.addCourseTaught("Science");
        teacher2.addCourseTaught("English");

        // Print student grades and teacher courses taught
        student1.printGrades();
        student2.printGrades();
        teacher1.printCoursesTaught();
        teacher2.printCoursesTaught();
    }
}
