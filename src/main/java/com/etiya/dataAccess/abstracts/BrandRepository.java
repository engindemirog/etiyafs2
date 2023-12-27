package com.etiya.dataAccess.abstracts;

import com.etiya.entities.Brand;

import java.util.List;
import java.util.Optional;

public interface BrandRepository {
    Brand add(Brand brand);

    List<Brand> getAll();

    Optional<Brand> getByName(String name);
}
