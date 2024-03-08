package com.riko.discount.controller;

import com.riko.discount.model.GlobalOffer;
import com.riko.discount.service.GlobalOfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/offer")
public class OfferController {

    private final GlobalOfferService globalOfferService;

    @GetMapping("/global")
    public ResponseEntity<List<GlobalOffer>> getAllGlobalOffers() {
        return ResponseEntity.ok(globalOfferService.getAllOffers());
    }
}
