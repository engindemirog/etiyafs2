package com.etiya.dataAccess.concretes;

import com.etiya.dataAccess.abstracts.BrandRepository;
import com.etiya.entities.Brand;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public class BrandRepositoryImpl implements BrandRepository {
    List<Brand> brands;
    public BrandRepositoryImpl()
    {
        Brand brand1 = new Brand();
        brand1.setId(1);
        brand1.setName("BMW");
        brand1.setCreatedDate(LocalDateTime.now());

        Brand brand2 = new Brand();
        brand2.setId(2);
        brand2.setName("Mercedes");
        brand2.setCreatedDate(LocalDateTime.now());

        Brand brand3 = new Brand();
        brand3.setId(3);
        brand3.setName("Alfa Romeo");
        brand3.setCreatedDate(LocalDateTime.now());

        brands = new ArrayList<>();
        brands.add(brand1);
        brands.add(brand2);
        brands.add(brand3);
    }

    @Override
    public Brand add(Brand brand){
        //Jpa kodları

        brand.setId((int)Math.random());
        brands.add(brand);

        return brand;
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }

    @Override
    public Optional<Brand> getByName(String name) {
        Optional<Brand> currentBrand = this.brands.stream().filter(brand -> brand.getName().equals(name)).findFirst();
        return currentBrand;
    }
}
