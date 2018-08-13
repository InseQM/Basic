package com.codes.java_collections.Enumeration;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationTest {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("雪");
        v.add("月");
        v.add("花");
        Hashtable hashtable = new Hashtable();
        hashtable.put("风", 55);
        hashtable.put("月", 45);
        Enumeration en = v.elements();
        while (en.hasMoreElements()){
            System.out.print(en.nextElement() + "\t");
        }
        System.out.println();
        Enumeration em = hashtable.keys();
        while (em.hasMoreElements()){
            Object key = em.nextElement();
            System.out.print(key + "-->" + hashtable.get(key) + "\t");
        }
    }
}
