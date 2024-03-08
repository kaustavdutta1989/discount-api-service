package com.riko.discount.service.implementation;

import com.riko.discount.model.GlobalOffer;
import com.riko.discount.model.dto.GlobalOfferMinDTO;
import com.riko.discount.repo.GlobalOfferRepository;
import com.riko.discount.service.GlobalOfferService;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class GlobalOfferServiceImpl implements GlobalOfferService {

    private final GlobalOfferRepository globalOfferRepository;

    @Override
    public GlobalOffer createGlobalOffer(GlobalOfferMinDTO globalOfferMinDTO) {
        return globalOfferRepository.save(GlobalOffer.builder()
                .name(globalOfferMinDTO.getName().toUpperCase().replace(" ", "_"))
                .percentage(globalOfferMinDTO.getPercentage())
                .description(globalOfferMinDTO.getDescription())
                .build());
    }

    @Override
    public List<GlobalOffer> getAllOffers() {
        return globalOfferRepository.findAll();
    }

    @Override
    public GlobalOffer deleteGlobalOffer(Long offerId) {
        GlobalOffer deletingOffer = globalOfferRepository.findById(offerId)
                .orElseThrow(() -> new EntityNotFoundException("offer not found with id: " + offerId));
        log.info("deleting offer: {}", deletingOffer);
        globalOfferRepository.delete(deletingOffer);
        return deletingOffer;
    }
}
