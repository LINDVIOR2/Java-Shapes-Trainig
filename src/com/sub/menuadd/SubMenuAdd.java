package com.sub.menuadd;

import com.figure.Circle;
import com.figure.Rectangle;
import com.figure.Triangle;
import com.util.Data;

import java.util.Scanner;

public class SubMenuAdd {

    public void newSubMenu() {


        SubMenuMethod submenu = new SubMenuMethod();
        submenu.subMenu();

        Scanner scan = new Scanner(System.in);
        int addPosition = scan.nextInt();

        AddEnumeration enumFun = AddEnumeration.getAddByPosition(addPosition);

        switch (enumFun) {
            case Circle:
                System.out.println("Set radius:");
                double radius = scan.nextDouble();
                Circle circle = new Circle(radius);
                Data.shapes.add(circle);

                break;
            case Rectangle:
                System.out.println("Set width:");
                double width = scan.nextDouble();
                System.out.println("Set length:");
                double length = scan.nextDouble();
                Rectangle rectangle = new Rectangle(width, length);
                Data.shapes.add(rectangle);

                break;
            case Triangle:
                System.out.println("Set a:");
                double a = scan.nextDouble();
                System.out.println("Set b:");
                double b = scan.nextDouble();
                System.out.println("Set c:");
                double c = scan.nextDouble();
                Triangle triangle = new Triangle(a, b, c);
                Data.shapes.add(triangle);

            case Return:
                break;
        }
    }
}
