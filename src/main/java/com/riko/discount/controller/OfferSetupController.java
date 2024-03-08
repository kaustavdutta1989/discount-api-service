package com.riko.discount.controller;

import com.riko.discount.model.GlobalOffer;
import com.riko.discount.model.dto.GlobalOfferMinDTO;
import com.riko.discount.service.GlobalOfferService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/offer/")
public class OfferSetupController {

    private final GlobalOfferService globalOfferService;

    @PostMapping("/global")
    public ResponseEntity<GlobalOffer> createGlobalOffer(@RequestBody GlobalOfferMinDTO globalOfferMinDTO) {
        return ResponseEntity.ok(globalOfferService.createGlobalOffer(globalOfferMinDTO));
    }

    @DeleteMapping("/global/{id}")
    public ResponseEntity<GlobalOffer> createGlobalOffer(@PathVariable Long id) {
        return ResponseEntity.ok(globalOfferService.deleteGlobalOffer(id));
    }
}
