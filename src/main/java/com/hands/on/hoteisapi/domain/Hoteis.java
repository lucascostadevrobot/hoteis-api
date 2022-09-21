package com.hands.on.hoteisapi.domain;


import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

public class Hoteis {

    private String name;
    private String cityName;
    private float valorTotal;


    public Hoteis(String name, String cityName, float valorTotal) {
        this.name = name;
        this.cityName = cityName;
        this.valorTotal = valorTotal;
    }

    public Hoteis() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public float getValorTotal() {
        Price price = new Price();
        valorTotal = price.getAdult()+price.getChild();
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

}

