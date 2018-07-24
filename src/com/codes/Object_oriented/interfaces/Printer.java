package com.codes.Object_oriented.interfaces;

public class Printer implements Product, Output {
    private String[] printData = new String[Max_CACHE_LINE];
    private int dataNum = 0;
    @Override
    public int getProduceTime() {
        return 45;
    }

    @Override
    public void out() {
        while (dataNum > 0){
            System.out.println("打印机打印：" + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum >= Max_CACHE_LINE){
            System.out.println("输出队列已满，添加失败");
        }else{
            printData[dataNum++] = msg;
        }
    }

    public static void main(String[] args) {
        Output o = new Printer();
        o.getData("java讲义");
        o.getData("疯狂java");
        o.out();
        o.getData("疯狂Android");
        o.getData("疯狂Ajax");
        o.out();
        o.print("猪八戒", "孙悟空", "白骨精");
        o.test();
        Product p = new Printer();
        System.out.println(p.getProduceTime());
        Object obj = p;
    }
}
