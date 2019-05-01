package com.build.menu;

import java.util.Scanner;

import com.sub.menuadd.SubMenuAdd;
import com.sub.menucalculate.Calculs;
import com.sub.menuedit.SubMenuEdit;


public class Main {

    public static void main(String[] args) {

        MenuMethod menu = new MenuMethod();

        Scanner scan = new Scanner(System.in);
        int postion;

        do {
            menu.Menu();
            postion = scan.nextInt();

            EnumFunctions enumFun = EnumFunctions.getByPosition(postion);

            switch (enumFun) {
                case Add:
                    new SubMenuAdd().newSubMenu();
                    break;
                case Edit:
                    new SubMenuEdit().editList();
                    break;
                case Calculate:
                    new Calculs().resultOfCalculs();
                    break;
                case Exit:
                    System.out.println("Closed");
                    break;
                case Reselect:
                default:
                    break;
            }
        } while (postion != 4);
    }
}
