package com.hands.on.hoteisapi.hoteis.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data
@Builder
@RequiredArgsConstructor
@AllArgsConstructor
public class Hotel {

    private String name;
    private String cityName;
    private List<Room> rooms;


}

