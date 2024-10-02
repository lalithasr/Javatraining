package com.careerit.cj.day19.innerpackages;

public class OuterClass {
    int x = 10;
    private class  InnerClass {
        int y = 20;

    }

    public int getInnerY() {
        InnerClass obj = new InnerClass();
        return obj.y;
    }
}
