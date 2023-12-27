package com.etiya.business.rules;

import com.etiya.dataAccess.abstracts.BrandRepository;
import com.etiya.entities.Brand;

public class BrandBusinessRules {
    BrandRepository brandRepository;

    public BrandBusinessRules(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public void brandNameCanNotBeDuplicated(String name){
        this.brandRepository.getByName(name).ifPresent(brand->{
            throw new RuntimeException("Marka ismi tekrar edemez. " + brand.getName());
        });
    }

}
