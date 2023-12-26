package com.etiya.dataAccess.abstracts;

import com.etiya.entities.Brand;

import java.util.List;

public interface BrandRepository {
    Brand add(Brand brand);

    List<Brand> getAll();
}
