package com.build.menu;


public enum EnumFunctions {
    Add(1),
    Edit(2),
    Calculate(3),
    Exit(4);

    private int position;

    public int getPosition() {
        return this.position;
    }

    EnumFunctions(int i) {
        this.position = i;
    }

    public static EnumFunctions getByPosition(int i) {
        for (int j = 0; j < values().length; j++) {
            if (values()[j].getPosition() == i) {
                return values()[j];
            }
        }
        return null;
    }
}

