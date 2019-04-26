package com.sub.menuadd;

public enum AddEnumeration {
    Circle(1),
    Square(2),
    Triangle(3),
    Return(4),
    ;

    private int addPosition;

    public int getAddPosition() {
        return this.addPosition;
    }
    AddEnumeration(int i){
        this.addPosition = i;
    }

    public static AddEnumeration getAddByPosition(int i) {
        for (int j = 0; j < values().length; j++) {
            if (values()[j].addPosition == i){
                return values()[j];
            }
        }
        return null;
    }
}
