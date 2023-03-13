package com.ll;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class Calc{
    public static int run(String exp){

        exp = exp.replaceAll("- ", "+ -");

        String[] bits = exp.split(" \\+ ");

        int sum = 0;

        for(int i = 0; i<bits.length; i++){
            sum += Integer.parseInt(bits[i]);
        }

        return sum;

        //throw new RuntimeException("올바른 계산식이 아닙니다.");
    }

}