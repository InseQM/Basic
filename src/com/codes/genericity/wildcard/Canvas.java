package com.codes.genericity.wildcard;

import java.util.List;

public class Canvas {
    public void drawAll(List<? extends Shape> shapes){
        for (Object obj : shapes){
            Shape a = (Shape) obj;
            a.draw(this);
        }
    }
}
