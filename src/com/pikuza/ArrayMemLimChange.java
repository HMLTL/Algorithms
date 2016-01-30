package com.pikuza;

/**
 * Created by m.pikuza on 30.01.2016.
 */
public class ArrayMemLimChange {
    int[] array;
    int firstPos;
    int secPos;
    int arrSize;

    public ArrayMemLimChange(){
        arrSize = 10;
        firstPos = 2;
        secPos = 8;
        array = new int[arrSize];
        for(int i = 0; i < array.length; i++){
            array[i] = new Utils().randomWithRange(2,83);
        }
    }

    public ArrayMemLimChange(int arrSize, int firstPos, int secPos){

        if(arrSize > 0 && firstPos > 0 && secPos > 0 && arrSize > secPos && secPos > firstPos){
            this.arrSize = arrSize;
            this.firstPos = firstPos;
            this.secPos = secPos;
        }else {
            throw new IllegalArgumentException("Arg err!");
        }

        array = new int[arrSize];

        for(int i = 0; i < array.length; i++){
            array[i] = new Utils().randomWithRange(2,83);
        }
    }

    public void replace(){
        array[firstPos] += array[secPos];
        array[secPos] = array[firstPos] - array[secPos];
        array[firstPos] -= array[secPos];
    }

    public void showElBeforeChange(){
        System.out.println("Before: " + array[firstPos] + ", " + array[secPos]);
    }

    public void showElAfterChange(){
        System.out.println("After: " + array[firstPos] + ", " + array[secPos]);
    }

}
