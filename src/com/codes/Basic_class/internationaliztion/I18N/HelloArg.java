package com.codes.Basic_class.internationaliztion.I18N;

import java.text.MessageFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

public class HelloArg {
    public static void main(String[] args) {
        Locale locale = null;
        if (args.length == 2) {
            locale = new Locale(args[0], args[1]);
        } else {
            locale = Locale.getDefault(Locale.Category.FORMAT);
        }

        ResourceBundle bundle = ResourceBundle.getBundle("com\\codes\\Basic_class\\internationaliztion\\I18N\\myMess", locale);
        String msg = bundle.getString("msg");
        System.out.println(MessageFormat.format(msg, "InseQM", new Date()));
    }
}
