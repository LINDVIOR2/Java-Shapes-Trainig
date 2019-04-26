package com.build.menu;

import java.util.Scanner;
import com.sub.menuadd.SubMenuAdd;


public class Main {

//    public static void cls()
//    {
//        try
//        {
//            new ProcessBuilder("t","/c","cls").inheritIO().start().waitFor();
//        }catch(Exception E)
//        {
//            System.out.println(E);
//        }
//    }



    public static void main(String[] args) {

        MenuMethod menu = new MenuMethod();


        Scanner scan = new Scanner(System.in);
        int postion;

        do {
//            cls();
            menu.Menu();
            postion = scan.nextInt();

            EnumFunctions enumFun = EnumFunctions.getByPosition(postion);

            switch (enumFun) {
                case Add:
                    new SubMenuAdd().newSubMenu();
                    break;
                case Edit:
                    System.out.println("anyMethod1");
                    break;
                case Calculate:
                    System.out.println("anyMethod2");
                    break;
                case Exit:
                    System.out.println("anyMethod3");
                    break;
            }
        } while (postion != 4);
    }
}
