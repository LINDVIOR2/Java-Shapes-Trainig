package com.sub.menucalculate;


import com.figure.Shape;
import com.util.Data;

import java.util.Scanner;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Calculs {
    public void resultOfCalculs() {
        AtomicInteger i = new AtomicInteger(1);
        List<Shape> shapes = Data.shapes;
        Scanner scan = new Scanner(System.in);

        shapes.forEach(shape -> System.out.println(i.getAndIncrement() + ") " + shape));
        System.out.println("Select object from list:");
        Shape shape = shapes.get(scan.nextInt() - 1);

        System.out.println("Area for selected object is:" + shape.area());
        System.out.println("Perimeter for selected object is:" + shape.perimeter() + "\n");
    }
}

