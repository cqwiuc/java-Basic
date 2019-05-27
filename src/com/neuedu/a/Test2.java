package com.neuedu.a;


    import java.util.Scanner;

    public class Test2 {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            double iRadius;
            Scanner sc = new Scanner(System.in);
            System.out.print("请输入圆的半径：");
            iRadius = sc.nextDouble();
            if(iRadius < 0){
                System.out.println("你输入的半径有误!");
            }
            else{
                Circle oCir = new Circle(iRadius);
                System.out.println("圆的周长为："+oCir.getLength());
                System.out.println("圆的面积为："+oCir.getArea());
            }


        }

    }

