package com.codes.Object_oriented.Lambda;

import com.codes.Object_oriented.interfaces.CommandMode.ProcessArray;

public class CommandTaest {
    public static void main(String[] args) {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        pa.process(target, (int[] target1) -> {
            int sum = 0;
            for (int tmp : target1){
                sum += tmp;
            }
            System.out.println("数组元素的总和是：" + sum);
        });
    }
}
