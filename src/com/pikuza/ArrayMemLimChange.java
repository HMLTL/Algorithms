package com.pikuza;

/**
 * Created by m.pikuza on 30.01.2016.
 */
public class ArrayMemLimChange {
    private int[] array;
    private int firstPos;
    private int secPos;
    private int arrSize;

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

    public void showElments(){
        System.out.println("Elements: " + array[firstPos] + ", " + array[secPos]);
    }

}
