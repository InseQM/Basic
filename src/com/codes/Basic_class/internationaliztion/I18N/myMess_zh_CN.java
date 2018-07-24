package com.codes.Basic_class.internationaliztion.I18N;

import java.util.ListResourceBundle;

public class myMess_zh_CN extends ListResourceBundle {
    private final Object[][] myData = new Object[][]{{"msg", "{0}，你好！今天的日期是{1}"}};

    public myMess_zh_CN() {
    }

    public Object[][] getContents() {
        return this.myData;
    }
}