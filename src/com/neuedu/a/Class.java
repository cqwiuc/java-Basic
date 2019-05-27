package com.neuedu.a;
import java.util.Scanner;
public class Class {
    public static void main(String args[]) {
        while (true) {
            System.out.println("请输入第一个数字：");
            Scanner sc = new Scanner(System.in);
            int num1=sc.nextInt();
            System.out.println("请输入运算符号：");
            String token=sc.next();
            System.out.println("请输入第二个数字：");
            int num2=sc.nextInt();
            String result="";

        if(token.equals("+")){
            result=(num1+num2+"");
        }else if(token.equals("-")){
            result=(num1-num2+"");

        }else if(token.equals("*")){
            result=(num1*num2+"");

        }else if(token.equals("/")){
            result=(num1/num2+"");
        }else{
            System.out.println("输入有误，请输入正确的运算符号！");
        }
            System.out.println("计算结果为："+num1+token+num2+"="+result+";");

            System.out.println("是否继续运算？y/n");
            String s=sc.next();

            if(s.equals("y")){
            }else if(s.equals("n")){
                break;
            }else{
                System.out.println("输入有误！请输入y/n");
                System.out.println("是否继续运算？y/n");
                s=sc.next();
                if (s.equals("n")){
                    break;
                }
            }
        }
    }
}


