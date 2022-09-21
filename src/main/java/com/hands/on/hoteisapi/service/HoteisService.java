package com.hands.on.hoteisapi.service;

import com.hands.on.hoteisapi.domain.Hoteis;
import com.hands.on.hoteisapi.domain.Price;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HoteisService{
    private Hoteis hoteis;
    private Price price;

    public List<Hoteis> listAll(){
        return new ArrayList<>();
    }

    public float listPrice(){

        return price.getChild()+price.getAdult();

    }


}
