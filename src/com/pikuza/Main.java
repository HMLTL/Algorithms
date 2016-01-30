package com.pikuza;

public class Main {

    public static void main(String[] args) {
        ArrayMemLimChange arrayMemLimChange = new ArrayMemLimChange();
        arrayMemLimChange.showElBeforeChange();
        arrayMemLimChange.replace();
        arrayMemLimChange.showElAfterChange();
        ArrayMemLimChange arrayMemLimChange2 = new ArrayMemLimChange(34, 6, 33);
        arrayMemLimChange2.showElBeforeChange();
        arrayMemLimChange2.replace();
        arrayMemLimChange2.showElAfterChange();
    }
}
