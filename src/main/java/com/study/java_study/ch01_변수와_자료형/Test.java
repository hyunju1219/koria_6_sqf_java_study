package com.study.java_study.ch01_변수와_자료형;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();

            LinkedList<Integer> queue = new LinkedList<>();

            for(int i = 1 ; i <= size ; i++) {
                queue.offer(i);
            }

            int cnt = sc.nextInt();
            int count = 0; //연산횟수
            for(int i = 0; i < cnt; i++) {
                int num = sc.nextInt();

                int index = 0 ; //반

                if(queue.size() % 2 == 0) index = queue.size() / 2;
                else index = queue.size() / 2 + 1;

                int c_index = queue.indexOf(num); //현재위치

                if(index > c_index) {
                    while(true) {
                        if(queue.peek() == num) {
                            queue.poll();
                            break;
                        }
                        queue.offer(queue.poll());
                        count++;
                    }
                } else {
                    while(true) {
                        if(queue.peek() == num) {
                            queue.poll();
                            break;
                        }
                        queue.offerFirst(queue.pollLast());
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

