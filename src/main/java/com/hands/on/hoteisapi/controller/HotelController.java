package com.hands.on.hoteisapi.controller;

import com.hands.on.hoteisapi.domain.Hoteis;
import com.hands.on.hoteisapi.domain.Price;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Controller
@RestController
@RequestMapping("/")
public class HotelController {

    @GetMapping("/hoteis")
    public List<Hoteis> getHoteis() {
        String url = "https://cvcbackendhotel.herokuapp.com/hotels/avail/1032";
        RestTemplate restTemplate = new RestTemplate();

        Hoteis[] hoteis = restTemplate.getForObject(url, Hoteis[].class);

        return Arrays.asList(hoteis);

    };
}
