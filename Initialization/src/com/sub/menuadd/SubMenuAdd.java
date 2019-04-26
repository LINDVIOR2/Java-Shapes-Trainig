package com.sub.menuadd;

import java.util.Scanner;

public class SubMenuAdd {

    public void newSubMenu() {
        SubMenuMethod submenu = new SubMenuMethod();
        submenu.subMenu();

        Scanner scan = new Scanner(System.in);
        int addPosition;

        do {
            addPosition = scan.nextInt();

            AddEnumeration enumFun = AddEnumeration.getAddByPosition(addPosition);

            switch (enumFun) {
                case Circle:
                    System.out.println("Set radius:");
//                    int radius = scan.nextInt();
//                    Circle circle = new Circle(radius,);
                   break;
                case Square:
                    System.out.println("Set x:");
                    break;
                case Triangle:
                    System.out.println("Set x and y:");
                    break;
                case Return:

                    break;
            }
        } while (addPosition != 4);
    }
}