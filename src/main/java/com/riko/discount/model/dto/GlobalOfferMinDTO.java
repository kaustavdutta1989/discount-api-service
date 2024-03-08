package com.riko.discount.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GlobalOfferMinDTO {
    private String name;
    private Integer percentage;
    private String description;
}
