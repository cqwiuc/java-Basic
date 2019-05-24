package com.neuedu.a;

import java.util.Scanner;

public class TestSeven {
    public static void main(String[] args) {
        System.out.println("请输入一串字符");
        Scanner scanner = new Scanner(System.in);
        String str =scanner.nextLine();
        if(str!=null){
            char[] strChar = str.toCharArray();
            for(int i=0;i<strChar.length;i++){
                if((int)strChar[i]>64&&(int)strChar[i]<91){
                    System.out.println("第"+(i+1)+"个字符为大写字母");
                }else if ((int)strChar[i]>96&&(int)strChar[i]<123){
                    System.out.println("第"+(i+1)+"个字符为小写字母，转学为大写"+(strChar[i]+"").toUpperCase());

                }
            }
        }
        System.out.println("转化后的字符"+str.toUpperCase());
    }
}

