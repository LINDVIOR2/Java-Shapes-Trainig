package com.build.menu;


import java.util.Arrays;

public enum EnumFunctions {
    Add(1),
    Edit(2),
    Calculate(3),
    Exit(4),
    Reselect(5);

    private int position;

    public int getPosition() {
        return this.position;
    }

    EnumFunctions(int i) {
        this.position = i;
    }

    public static EnumFunctions getByPosition(int i) {
       return Arrays.stream(values()).filter(v -> v.getPosition() == i).findFirst().orElse(values()[4]);

    }
}

