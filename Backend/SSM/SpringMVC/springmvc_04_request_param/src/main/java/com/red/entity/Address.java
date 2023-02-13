package com.red.entity;

public class Address {
    private String x;
    private String y;

    @Override
    public String toString() {
        return "Address{" +
                "x='" + x + '\'' +
                ", y='" + y + '\'' +
                '}';
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
