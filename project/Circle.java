package project;

import java.util.Scanner;

class Circle extends Shape {
    private float radius;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        radius = sc.nextFloat();
    }

    public void compute() {
        area = 3.141f * radius * radius;
    }
}
