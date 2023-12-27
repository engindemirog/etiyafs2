package com.etiya;

import com.etiya.business.concretes.BrandServiceImpl;
import com.etiya.business.dtos.requests.CreateBrandRequest;
import com.etiya.business.dtos.responses.CreatedBrandResponse;
import com.etiya.business.dtos.responses.GetAllBrandResponse;
import com.etiya.core.utilities.mapping.ModelMapperManager;
import com.etiya.dataAccess.concretes.BrandRepositoryImpl;
import com.etiya.dataAccess.concretes.BrandRepositoryImplHibernate;
import com.etiya.entities.Brand;
import com.etiya.entities.Car;
import com.etiya.entities.Model;
import org.modelmapper.ModelMapper;

import java.util.List;

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
        request.setName("Opel");
        BrandServiceImpl brandService=new BrandServiceImpl(new BrandRepositoryImpl(),new ModelMapperManager(new ModelMapper()));
        CreatedBrandResponse response = brandService.add(request);
        System.out.println(response.getName());
        System.out.println("--------------------------------------");

        List<GetAllBrandResponse> allBrands = brandService.getAll();

        for (var brand:allBrands) {
            System.out.println(brand.getId()+"/"+ brand.getName()+"/"+brand.getCreatedDate());
        }

    }
}