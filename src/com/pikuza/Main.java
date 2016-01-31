package com.pikuza;

import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static int boxMaths = 12;
    private static int add = 4;

    public static void main(String[] args)   {
        Scanner in = new Scanner(System.in);
        in.useLocale(new Locale("US"));
        PrintWriter out = new PrintWriter(System.out);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        double r1 = in.nextDouble();
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double r2 = in.nextDouble();
//        int x1 = 0;
//        int y1 = 0;
//        int r1 = 5;
//        int x2 = 5;
//        int y2 = 0;
//        int r2 = 1;



        out.println(getCountOfMatch(x1,y1,r1,x2,y2,r2));
        out.flush();
    }

    private static int getCountOfMatch(double x1, double y1, double r1, double x2, double y2, double r2){
        double x = x1 - x2;
        double y = y1 - y2;

//        if(x<0){x= x*(-1);}
//        if(y<0){y= y*(-1);}

        double d = Math.sqrt(x*x+y*y);

        if(d == r1 + r2) return 1;
        if(d > r1 + r2) return 0;
        if(d < r1 + r2) return 2;
        if(x1 == x2 && y1 == y2 && r1 == r2) return -1;

        return -1;
    }
}
