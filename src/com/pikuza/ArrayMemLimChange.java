package com.pikuza;

/**
 * Created by m.pikuza on 30.01.2016.
 */
public class ArrayMemLimChange {
    private int[] intArr;
    private int firstPos;
    private int secPos;
    private int intArrSize;

    public ArrayMemLimChange(){
        intArrSize = 10;
        firstPos = 2;
        secPos = 8;
        intArr = new int[intArrSize];
        for(int i = 0; i < intArr.length; i++){
            intArr[i] = new Utils().randWithRange(2, 83);
        }
    }

    public ArrayMemLimChange(int intArrSize, int firstPos, int secPos){

        if(intArrSize > 0 && firstPos > 0 && secPos > 0 && intArrSize > secPos && secPos > firstPos){
            this.intArrSize = intArrSize;
            this.firstPos = firstPos;
            this.secPos = secPos;
        }else {
            throw new IllegalArgumentException("Arg err!");
        }

        intArr = new int[intArrSize];

        for(int i = 0; i < intArr.length; i++){
            intArr[i] = new Utils().randWithRange(2, 83);
        }
    }

    public void replace(){
        intArr[firstPos] += intArr[secPos];
        intArr[secPos] = intArr[firstPos] - intArr[secPos];
        intArr[firstPos] -= intArr[secPos];
    }

    public void showElments(){
        System.out.println("Elements: " + intArr[firstPos] + ", " + intArr[secPos]);
    }

}
