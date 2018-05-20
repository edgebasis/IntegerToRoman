package com.edgebasis;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int num=20;
        Boolean valid = true;
        if((num> 3999 && num <1)) throw new IllegalArgumentException();

        int number=0;
        int[] ints = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] romans = new String[]{"I", "IV", "V", "IX" , "X", "XL","L", "XC", "C", "CD","D", "CM","M"};

        int index=0;
        StringBuilder str = new StringBuilder();
        while(num>0) {

                if ((num - ints[ints.length-index-1]) >= 0) {
                    str.append(romans[ints.length-index-1]);
                    num -= ints[ints.length-index-1];

                }else{
                    index++;
                }

        }

        if(valid) System.out.println(str.toString());

    }
}
