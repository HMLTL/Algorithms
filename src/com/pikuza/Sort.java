package com.pikuza;

/**
 * Created by m.pikuza on 31.01.2016.
 */
public class Sort {

    private int[] intArr;

    public Sort(){
        intArr = new Utils().random1dIntArrInit(10);
    }

    public Sort(int[] intArr){
        this.intArr = intArr;
    }

    public void selectionSort(){
        for(int i = 0; i < intArr.length; i++){
            for(int j = i + 1; j < intArr.length; j++){
                if(intArr[i] > intArr[j]) {
                    intArr[i] = intArr[j] + intArr[i];
                    intArr[j] = intArr[i] - intArr[j];
                    intArr[i] = intArr[i] - intArr[j];
                }
            }
        }
    }

    public void bubbleSort(){
        for(int i = 0, j = i + 1; j < intArr.length; i++){
//            ...
        }
    }

    public void printIntArr(){
        for(int i = 0; i < intArr.length; i++){
            System.out.print(intArr[i] + ",");
        }
        System.out.println();
    }

    public void generate(){
        intArr = new Utils().random1dIntArrInit(10);
    }

}
