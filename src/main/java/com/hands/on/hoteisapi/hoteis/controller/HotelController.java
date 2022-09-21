package com.hands.on.hoteisapi.hoteis.controller;

import com.hands.on.hoteisapi.hoteis.model.Hotel;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/")
public class HotelController {

    @GetMapping("/hoteis/{codigoCidade}")
    public ResponseEntity<List<Hotel>> getHoteis() {
        var type = new ParameterizedTypeReference<List<Hotel>>() {};
        String url = "https://cvcbackendhotel.herokuapp.com/hotels/avail/1032";
        RestTemplate restTemplate = new RestTemplate();

       var hoteis = restTemplate.exchange(url, HttpMethod.GET, null, type).getBody();
        return ResponseEntity.ok(hoteis);
    };
}
