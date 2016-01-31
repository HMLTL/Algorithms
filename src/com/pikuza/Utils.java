package com.pikuza;

/**
 * Created by m.pikuza on 30.01.2016.
 */
public class Utils {
    public int randomWithRange(int minValue, int maxValue){
        int range = (maxValue - minValue) + 1;
        return (int)(Math.random() * range) + minValue;
    }

    public int[][] randomArrInitializer(int minValue, int maxValue, int xSize, int ySize){
        int[][] arr = new int[xSize][ySize];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = randomWithRange(minValue, maxValue);
            }
        }
        return arr;
    }

    public int[][] randomArrInitializer(int minValue, int maxValue){
        return randomArrInitializer(minValue, maxValue, randomWithRange(10, 50), randomWithRange(10, 50));
    }

    public int[][] randomArrInitializer(){
        return randomArrInitializer(randomWithRange(0, 100), randomWithRange(0, 100));
    }

    public static class TimeCounter{
        long startTime;
        long estimatedTime;

        public void start(){ startTime = System.nanoTime(); }

        public void stop(){ estimatedTime = System.nanoTime() - startTime; }

        public String getEstimateTime(){ return  String.format("Estimated time is %f sec",(double) estimatedTime / 1000000000.0);}

    }

}
