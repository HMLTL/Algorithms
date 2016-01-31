package com.pikuza;

/**
 * Created by m.pikuza on 30.01.2016.
 */
public class Utils {
    public int randWithRange(int minValue, int maxValue){
        int range = (maxValue - minValue) + 1;
        return (int)(Math.random() * range) + minValue;
    }

    public int[] random1dIntArrInit(int minVal, int maxVal, int size ){
        int[] intArr = new int[size];
        for (int i = 0; i < intArr.length; i++){
            intArr[i] = randWithRange(minVal, maxVal);
        }
        return intArr;
    }

    public int[] random1dIntArrInit(int size ){
        return random1dIntArrInit(randWithRange(0, 50), randWithRange(51, 100), size);
    }

    public int[][] rand2dIntArrInit(int minVal, int maxVal, int xSize, int ySize){
        int[][] intArr = new int[xSize][ySize];
        for(int i = 0; i < intArr.length; i++){
            for(int j = 0; j < intArr[i].length; j++){
                intArr[i][j] = randWithRange(minVal, maxVal);
            }
        }
        return intArr;
    }

    public int[][] rand2dIntArrInit(int minVal, int maxVal){
        return rand2dIntArrInit(minVal, maxVal, randWithRange(10, 50), randWithRange(10, 50));
    }

    public int[][] random2dIntArrInit(){
        return rand2dIntArrInit(randWithRange(0, 50), randWithRange(51, 100));
    }

    public static class TimeCounter{
        long startTime;
        long estimatedTime;

        public void start(){ startTime = System.nanoTime(); }

        public void stop(){ estimatedTime = System.nanoTime() - startTime; }

        public String getEstimateTime(){ return  String.format("Estimated time is %f sec",(double) estimatedTime / 1000000000.0);}

    }

}
