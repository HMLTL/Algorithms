package com.pikuza;

import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    private static int digitCounter = 0;

    public static void main(String[] args)   {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int a = in.nextInt();

        getCountOfDigits(a);

        out.println(digitCounter);
        out.flush();
    }

    private static void getCountOfDigits(int input){

        if (input/10>0){
            getCountOfDigits(input/10);
        }
        digitCounter++;

    }
}
