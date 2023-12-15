package Assigment3;

import java.util.Scanner;

class Shape {
    protected String name;
    protected int numOfEdges;
    protected int numOfVertices;

    public Shape() {
        accept();
    }

    public void accept() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name of the shape: ");
        name = input.nextLine();
        System.out.print("Enter the number of edges: ");
        numOfEdges = input.nextInt();
        System.out.print("Enter the number of vertices: ");
        numOfVertices = input.nextInt();
    }

    public void display() {
        System.out.println("Shape: " + name);
        System.out.println("Number of Edges: " + numOfEdges);
        System.out.println("Number of Vertices: " + numOfVertices);
    }

    public double area() {
        return 0.0; // Default implementation, to be overridden by subclasses
    }
}

class Circle extends Shape {
    private double radius;

    public Circle() {
        super();
        accept();
    }

    @Override
    public void accept() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        radius = input.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    private double height;
    private double width;

    public Square() {
        super();
        accept();
    }

    @Override
    public void accept() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the height of the square: ");
        height = input.nextDouble();
        System.out.print("Enter the width of the square: ");
        width = input.nextDouble();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
    }

    @Override
    public double area() {
        return height * width;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Shape circle = new Circle();
        System.out.println("\nCircle Details:");
        circle.display();

        System.out.println("\n----------------\n");

        Square square = new Square();
        System.out.println("\nSquare Details:");
        square.display();
    }
}
