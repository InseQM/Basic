package com.codes.Basic_class.internationaliztion.I18N;

import java.util.Locale;
import java.util.ResourceBundle;

public class Love {
    public static void main(String[] args) {
        Locale myLocale = Locale.getDefault(Locale.Category.FORMAT);
        ResourceBundle bundle = ResourceBundle.getBundle("com/codes/Basic_class/internationaliztion/I18N/mess", myLocale);
        System.out.println(bundle.getString("love"));
    }
}
