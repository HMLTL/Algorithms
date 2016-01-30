package com.pikuza;

/**
 * Created by m.pikuza on 30.01.2016.
 */
public class Utils {
    public int randomWithRange(int min, int max){
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
}
