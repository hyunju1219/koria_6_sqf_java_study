package com.study.java_study.sort;

public class Bubble {
    public static void main(String[] args) {
        int[] a = {1, 3, 9, 0, 7, 8, 6};
        bubbleSort(a);
    }

//    static void bubbleSort(int[]a) {
//        int comp = 0;
//        int exchange = 0;
//        for(int i = 0; i < a.length - 1; i++) {
//            int cnt = 0; // 비교, 교환하면 +1
//            for(int j = i + 1; j < a.length; j++) {
//                comp++;
//                if (a[i] > a[j]) {
//                    int temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                    cnt++;
//                    exchange++;
//                }
//                System.out.println("cnt : " + cnt + " exchange : " + exchange);
//                if(cnt == exchange) {
//                    break;
//                }
//            }
//        }
//        for(int i : a) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.println(exchange + " " + comp);
//    }
    //2



        static void bubbleSort(int a[]) {
            int comp = 0; //비교
            int exchange = 0; //교환
            for(int i = 0; i < a.length - 1; i++) { //패스
                int cnt = 0;
                System.out.println("패스 : " + (i + 1));
                for(int j = a.length - 1; j > i; j--) { // 비교
                    if(a[j - 1] > a[j]) {
                        swap(a,j -1, j);
                        cnt++;
                        exchange++;
                    }
                    for(int k = 0; k < a.length; k++) {
                        System.out.print(a[k] + " ");
                    }
                    System.out.println();
                    comp++;
                }
                if(cnt == 0) {
                    break;
                }
            }

            System.out.println("비교횟수 : " + comp);
            System.out.println("교환횟수 : " + exchange);
        }

    static void swap(int[] a, int m, int n) {
        int tmp = a[n];
        a[n] = a[m];
        a[m] = tmp;

    }
    }


