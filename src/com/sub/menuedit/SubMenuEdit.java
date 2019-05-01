package com.sub.menuedit;

import com.figure.Circle;
import com.figure.Rectangle;
import com.figure.Shape;
import com.figure.Triangle;
import com.util.Data;

import java.util.Scanner;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SubMenuEdit {
    public void editList() {
        AtomicInteger i = new AtomicInteger(1);
        List<Shape> shapes = Data.shapes;
        Scanner scan = new Scanner(System.in);

        shapes.forEach(shape -> System.out.println(i.getAndIncrement() + ") " + shape));


        System.out.println("Select object from list to edit:");

        Shape shape = shapes.get(scan.nextInt() - 1);

        if(shape instanceof Circle) {
            System.out.println("Change Radius:");
            double radius = scan.nextDouble();
            ((Circle) shape).setRadius(radius);

        } else if(shape instanceof Triangle) {
            System.out.println("Change A:");
            double a = scan.nextDouble();
            ((Triangle) shape).setA(a);
            System.out.println("Change B:");
            double b = scan.nextDouble();
            ((Triangle) shape).setB(b);
            System.out.println("Change C:");
            double c = scan.nextDouble();
            ((Triangle) shape).setC(c);
        } else if( shape instanceof Rectangle) {
            System.out.println("Change Width:");
            double width = scan.nextDouble();
            ((Rectangle) shape).setWidth(width);
            System.out.println("Change Length:");
            double length = scan.nextDouble();
            ((Rectangle) shape).setLength(length);
        }
    }
}
