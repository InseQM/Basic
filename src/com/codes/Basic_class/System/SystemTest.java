package com.codes.Basic_class.System;

import java.io.FileOutputStream;
import java.util.Map;
import java.util.Properties;

public class SystemTest {
    public static void main(String[] args) throws Exception{
        //获取系统所有环境变量
        Map<String, String> env = System.getenv();
        for (String name : env.keySet()){
            System.out.println(name + "--->" + env.get(name));
        }
        //获取指定环境变量的值
        System.out.println(System.getenv("JAVA_HOME"));
        //获取所有的系统属性
        Properties prop = System.getProperties();
        //将所有系统属性保存到prop.txt中
        prop.store(new FileOutputStream("prop.txt"), "System Propertiers");
        //输出特定的系统属性
        System.out.println(System.getProperty("os.name"));
    }
}
