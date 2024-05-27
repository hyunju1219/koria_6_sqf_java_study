package com.study.java_study.ch01_변수와_자료형;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        int[] a1 = {1, 5, 2, 6, 3, 7, 4};
        int[][] a2 = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int size = a2.length;
        int[] answer = new int[size];

        for(int i = 0; i < a2.length; i++) {
            int a = Integer.valueOf(a2[i][0]);
            int b = Integer.valueOf(a2[i][1]);
            int c = Integer.valueOf(a2[i][2]);
            int[] temp = new int[b - a + 1];
            int cnt = 0;

            for(int j = a - 1; j < b; j++) {
                temp[cnt++] = a1[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[c - 1];

        }
        for(int num : answer) {
            System.out.print(num + " ");
        }



    }
}

