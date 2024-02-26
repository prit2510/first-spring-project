package com.example.refrencType;

public class B {
    private int Y;

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
    public B() {
       super();
    }
    @Override
    public String toString(){
        return "B[y="+Y+"]";
    }
}
