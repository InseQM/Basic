package com.codes.Object_oriented.interfaces.SimpleFactory;

import com.codes.Object_oriented.interfaces.Output;

public class BetterPrinter implements Output {
    private String[] printData = new String[Max_CACHE_LINE * 2];
    private int dataNum = 0;
    @Override
    public void out() {
        while (dataNum > 0){
            System.out.println("高速打印机正在打印：" + printData[0]);
            System.arraycopy(printData, 1, printData, 0, --dataNum);
        }
    }

    @Override
    public void getData(String msg) {
        if (dataNum >= Max_CACHE_LINE * 2){
            System.out.println("输出队列已满，添加失败");
        }else{
            printData[dataNum++] = msg;
        }
    }
}
