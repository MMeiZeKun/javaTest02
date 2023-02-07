package com.may.test;

import java.util.Scanner;

/**
 * @author 1
 */
public class MathodTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("第一个数");
        int x = scan.nextInt();
        System.out.println("第二个数");
        int y = scan.nextInt();
        int sum = sum(x, y);
        System.out.println("计算结果： "+sum);
    }

    public static int sum(int x, int y) {
        if(x == y){
            return x + y;
        } else if (x > y) {
            return x - y;
        } else {
            return x * y;
        }

    }

    //方法重载 方法名相同，实参参数个数，顺序不同

}
