package com.etiya.dataAccess.concretes;

import com.etiya.dataAccess.abstracts.BrandRepository;
import com.etiya.entities.Brand;

public class BrandRepositoryImplHibernate implements BrandRepository {
    @Override
    public Brand add(Brand brand) {
        //Jpa kodları
        System.out.println("Brand added to db by BrandRepositoryImplHibernate");
        brand.setId(11);
        return brand;
    }
}
