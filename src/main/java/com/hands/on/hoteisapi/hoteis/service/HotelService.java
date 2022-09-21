package com.hands.on.hoteisapi.hoteis.service;

import com.hands.on.hoteisapi.hoteis.model.Hotel;
import com.hands.on.hoteisapi.hoteis.model.Price;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelService {
    private Hotel hotel;
    private Price price;

    public List<Hotel> listAll(){
        return new ArrayList<>();
    }
}
