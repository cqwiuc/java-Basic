package com.neuedu.a;

public class Rectangle {
    //定义长宽属性
    private int iWidth;
    private int iHeight;
    //构造器1
    public Rectangle(){
        this.iHeight = 1;
        this.iWidth = 1;
    }
    //构造器2
    public Rectangle(int iIndex){
        this.iWidth = iIndex;
        this.iHeight = iIndex;
    }
    //构造器3
    public Rectangle(int iWidth, int iHeight){
        this.iHeight = iHeight;
        this.iWidth = iWidth;
    }
    //求周长
    public int getLength(){
        return 2*(this.iHeight+this.iWidth);
    }
    //求面积
    public int getSquare(){
        return this.iHeight*this.iWidth;
    }


}



