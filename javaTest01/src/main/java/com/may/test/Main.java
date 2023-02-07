package com.may.test;

import java.util.Scanner;

/**
 * @author 1
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // while循环
        int i = 0;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }

        //计算1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 100
        int o = 0;
        int sum = 0;
        while (o <= 100) {
            sum += o;
            o++;
        }

        System.out.println(sum);

        // for循环
        for (int j = 0; j <= 100; j++) {
            System.out.println(j);
        }

        int sum02 = 0;
        for (int j = 0; j <= 100; j++) {
            sum02 += j;
        }
        System.out.println(sum02);

        //嵌套循环
        for (int m = 0; m <= 100; m++) {
            System.out.println(i);
        }


        //嵌套循环
        for (int m = 0; m <= 10; m++) {
            for (int n = 0; n <= 10; n++) {
                System.out.print(n);
            }
            System.out.print("\n");
        }

        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10; n++) {
                if (n%2 == 0) {
                    System.out.print("图\t");
                } else {
                    System.out.print("文\t");
                }
            }
            System.out.print("\n");
        }

        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < m; n++) {

                System.out.print("*\t");
            }
            System.out.print("\n");
        }

        for (int m = 0; m < 10; m++) {
            for (int n = 0; n < 10-m; n++) {

                System.out.print("*\t");
            }
            System.out.print("\n");
        }

        int num = 4;
        for (int m = 0; m < 5; m++) {
            for (int n = 0; n < 10; n++) {
                if (n>=num-m&&n<=num+m) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.print("\n");
        }

        for (int m = 0; m < 5; m++) {
            for (int n = 0; n < 5; n++) {
                if ((m + n)%2 == 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print("#\t");
                }
            }
            System.out.print("\n");
        }

        //break
        int count = 0;
        while (true) {
            int m = (int) (Math.random()*100);
            System.out.println(m);
            count++;
            if (m == 88) {
                break;
            }
        }
        System.out.println("一共循环次数："+count);

        // 把100-150之间不能被3整除的数输出，并且每行输出5个
        for (int m = 100; m <= 150; m++) {
            if (m%3 == 0){
                continue;
            }
            System.out.print(m + "\t");
            count++;
            if (count%5 == 0){
                System.out.println();
            }
        }

        // 抓动物小游戏 每次随机出现一个动物
        // 如果出现老虎，则游戏结束，出现老鹰，等待下一个动物出现
        // 如果出现小猫，小狗，小鸟，小乌龟等可以抓住，计数
        for (;;){
            int m = (int) (Math.random()*6);
            String animal = "";
            switch (m) {
                case 0:
                    animal = "tag";
                    break;
                case 1:
                    animal = "dog";
                    break;
                case 2:
                    animal = "cat";
                    break;
                case 3:
                    animal = "bird";
                    break;
                case 4:
                    animal = "fish";
                    break;
                case 5:
                    animal = "horse";
                    break;
                default:
                    animal = "未知";
                    break;
            }
            if ("tag".equals(animal)){
                break;
            }

            if ("horse".equals(animal)) {
                continue;
            }
            count++;
            System.out.println(animal);
            System.out.println(count);
        }


        //for循环打印a-z
        char c = 'a';
        for (int j = 0; j < 26; j++) {
            char temp = (char) (c + j);
            System.out.print(temp + "\t");
        }

        // 打印99乘法表
        for (int j = 0; j <= 9; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(k+"*"+j+"="+(k*j)+"\t");
            }
            System.out.println();
        }

        //年薪计算器
        Scanner scanner = new Scanner(System.in);
        System.out.println("年薪计算小软件");
        while(true){
            System.out.println("请输入月薪");
            Double monthSalary = scanner.nextDouble();

            System.out.println("请输入一年多少个月薪");
            Double daySalary = scanner.nextDouble();

            double v = monthSalary * daySalary;
            System.out.println("年薪："+ v);

            System.out.println("输入88退出，输入66继续");
            int countNum = scanner.nextInt();

            if (countNum == 88){
                break;
            }

            if (countNum == 66){
                continue;
            }

        }

    }
}