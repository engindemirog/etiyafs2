package com.etiya;

import com.etiya.business.concretes.BrandServiceImpl;
import com.etiya.business.dtos.requests.CreateBrandRequest;
import com.etiya.dataAccess.concretes.BrandRepositoryImpl;
import com.etiya.dataAccess.concretes.BrandRepositoryImplHibernate;
import com.etiya.entities.Brand;
import com.etiya.entities.Car;
import com.etiya.entities.Model;

public class Main {
    public static void main(String[] args) {
        Brand brand1 = new Brand();
        brand1.setId(1);
        brand1.setName("BMW");

        Model model1 = new Model();
        model1.setId(1);
        model1.setName("Series 1");
        model1.setBrand(brand1);

        Car car1 = new Car();
        car1.setId(1);
        car1.setPlate("06ABC01");
        car1.setModel(model1);

        Car car2 = new Car();
        car2.setId(2);
        car2.setPlate("06ABC02");
        car2.setModel(model1);

        CreateBrandRequest request=new CreateBrandRequest();
        request.setName("BMW");
        BrandServiceImpl brandService=new BrandServiceImpl(new BrandRepositoryImplHibernate());
        brandService.add(request);
    }
}