package com.hands.on.hoteisapi.domain;

public class Price {
    private float adult;
    private float child;

    public Price(float adult, float child) {
        this.adult = adult;
        this.child = child;
    }

    public Price() {
    }

    public float getAdult() {
        return adult;
    }

    public void setAdult(float adult) {
        this.adult = adult;
    }

    public float getChild() {
        return child;
    }

    public void setChild(float child) {
        this.child = child;
    }
}
