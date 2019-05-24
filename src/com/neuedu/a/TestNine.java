package com.neuedu.a;

import java.util.Scanner;

public class TestNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        boolean flag = false;
        int temp = 0;
        while (input%10>0){
            temp += input%10;
            input = input/10;
        }
        temp =temp + input;
        if(temp%9==0){
            flag = true;
        }
        System.out.println(flag+"能整除:不能整除");
    }
}

