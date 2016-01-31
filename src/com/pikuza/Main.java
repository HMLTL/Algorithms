package com.pikuza;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private static int boxMaths = 12;
    private static int add = 4;

    public static void main(String[] args)   {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();
//        int a = 4;



        out.println(getCountOfMatch(a));
        out.flush();
    }

    private static int getCountOfMatch(int input){
        if(input == 0) return 0;
        if(input == 1) return boxMaths;
        if(input == 2) return boxMaths-add;
        if(input > 0) return boxMaths*2+add*(input-2);
        else return 0;
    }
}
