package com.springcore.setterinjection;

public class A {
    int x;
    B ob;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public B getOb() {
        return ob;
    }

    public void setOb(B ob) {
        this.ob = ob;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", ob=" + ob +
                '}';
    }
}

class B {
        int y;
        public void setY(int x){
            y=x;
        }
        @Override
        public String toString() {
            return "y=" + y +
                    '}';
        }
    }

