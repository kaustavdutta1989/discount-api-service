package com.riko.discount.service;

import com.riko.discount.model.GlobalOffer;
import com.riko.discount.model.dto.GlobalOfferMinDTO;

import java.util.List;

public interface GlobalOfferService {
    GlobalOffer createGlobalOffer(GlobalOfferMinDTO globalOfferMinDTO);

    List<GlobalOffer> getAllOffers();
    GlobalOffer deleteGlobalOffer(Long offerId);
}
