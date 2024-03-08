package com.riko.discount.repo;

import com.riko.discount.model.GlobalOffer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GlobalOfferRepository extends JpaRepository<GlobalOffer, Long> {
}
