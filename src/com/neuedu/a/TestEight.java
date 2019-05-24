package com.neuedu.a;

import javax.swing.*;

public class TestEight {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 200; i++) {
            if (1 % 3 == 0) {
                num += i;
            }
        }
        System.out.println("和为：" + num);
    }
}

