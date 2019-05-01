package com.sub.menuadd;

import java.util.Arrays;

public enum AddEnumeration {
    Circle(1),
    Rectangle(2),
    Triangle(3),
    Return(4),
    ;

    private int addPosition;

    public int getAddPosition() {
        return this.addPosition;
    }

    AddEnumeration(int i) {
        this.addPosition = i;
    }

    public static AddEnumeration getAddByPosition(int i) {
        return Arrays.stream(values()).filter(v -> v.getAddPosition() == i).findFirst().orElse(values()[3]);
    }
}