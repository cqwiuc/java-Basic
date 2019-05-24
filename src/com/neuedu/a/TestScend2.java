package com.neuedu.a;

public class TestScend2 {
    public static void main(String[] args){
        int n = 80;
        grade(n);
    }
    //成绩等级计算
    private static void grade(int n){
        if(n>100 || n<0)
            System.out.println("输入无效");
        else{
            String str = (n>=90)?"分，属于A等":((n>60)?"分，属于B等":"分，属于C等");
            System.out.println(n+str);
        }
    }
}
