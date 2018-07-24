package com.codes.Basic_class.internationaliztion.I18N;

import java.util.Locale;

public class LocaleList {
    public static void main(String[] args) {
        Locale[] localeList = Locale.getAvailableLocales();
        Locale[] var2 = localeList;
        int var3 = localeList.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            Locale loacle = var2[var4];
            System.out.println(loacle.getDisplayCountry() + "=" + loacle.getCountry() + " " + loacle.getDisplayLanguage() + "=" + loacle.getLanguage());
        }

    }
}
