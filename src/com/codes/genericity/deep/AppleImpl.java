package com.codes.genericity.deep;

/**
 * 从泛型类派生子类
 */
public class AppleImpl extends Apple<String> {
    public String getInfo(){
        return "子类" + super.getInfo();
    }
}
