package com.etiya.business.concretes;

import com.etiya.business.dtos.requests.CreateBrandRequest;
import com.etiya.business.dtos.responses.CreatedBrandResponse;
import com.etiya.dataAccess.abstracts.BrandRepository;
import com.etiya.dataAccess.concretes.BrandRepositoryImpl;
import com.etiya.entities.Brand;

public class BrandServiceImpl {

    private BrandRepository brandRepository;
    //dependency injection
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public CreatedBrandResponse add(CreateBrandRequest createBrandRequest){
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        Brand createdBrand = brandRepository.add(brand);

        CreatedBrandResponse createdBrandResponse = new CreatedBrandResponse();
        createdBrandResponse.setId(createdBrand.getId());
        createdBrandResponse.setName(createdBrand.getName());
        createdBrandResponse.setCreatedDate(createdBrand.getCreatedDate());

        return createdBrandResponse;
    }
}
