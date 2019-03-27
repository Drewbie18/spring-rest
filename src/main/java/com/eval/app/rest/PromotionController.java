package com.eval.app.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PromotionController {

    private final PromoRequestHandler handler = new PromoRequestHandler();


    @GetMapping(value = "/promo", produces = "application/json" )
    public ResponseEntity getPromotion(
            @RequestParam(value = "date") String date,
            @RequestParam(value = "type", required = false) String type,
            @RequestParam(value = "city", required = false) String city) {

        return handler.getBasicPromotionHandler(date, type, city);
    }
}
