package com.neuedu.a;

public class TestFour {
    public static void main(String[]args){
        int sum=0;
        for (int i=1;i<=10;i++){//求1-10之间数的和
            sum=sum+i;
        }
        for(int i=1;i<=100;i++){//求1-100之间偶数和
            if(i%2==0){
                sum=sum+i;
            }
        }
        for(int i=1;i<=100;i++){//求1-100之间奇数和
            if(i%2==1){
                sum=sum+i;
            }
        }
        System.out.println("求sum的值："+sum);
    }
}

