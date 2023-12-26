package com.etiya.entities;

import com.etiya.core.entities.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Car extends BaseEntity<Integer> {
    private String plate;
    private double dailyPrice;
    private Model model;
    private Transmission transmission;
    private Fuel fuel;


}
