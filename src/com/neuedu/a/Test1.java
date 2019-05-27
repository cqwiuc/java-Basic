package com.neuedu.a;

    public class Test1 {
        public static void main(String[] args) {
            // TODO Auto-generated method stub
            Rectangle oRec1 = new Rectangle();
            System.out.println("默认长方形的周长为："+oRec1.getLength());
            System.out.println("默认长方形的面积为："+oRec1.getSquare());

            Rectangle oRec2 = new Rectangle(2);
            System.out.println("一个参数长方形的周长为："+oRec2.getLength());
            System.out.println("一个参数长方形的面积为："+oRec2.getSquare());

            Rectangle oRec3 = new Rectangle(2,3);
            System.out.println("两个参数长方形的周长为："+oRec3.getLength());
            System.out.println("两个参数长方形的面积为："+oRec3.getSquare());

        }

    }

