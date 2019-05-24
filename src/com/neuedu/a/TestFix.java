package com.neuedu.a;

import java.util.Scanner;

  public class TestFix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入需要判定的年份");
        int  year = sc.nextInt();
        if(year%4==0 || year%400==0){
            System.out.println(year+"是闰年");
        }else{
            System.out.println(year+"不是是闰年");
        }
    }
}
