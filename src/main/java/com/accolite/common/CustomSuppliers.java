package com.accolite.common;

import com.accolite.model.Developer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class CustomSuppliers<T>{

    public Supplier<List<T>> supplier(){
        return ArrayList :: new;
    }

    public static Developer factory(Supplier <? extends Developer> s){
        Developer developer = s.get();
        if (developer.getName() == null || "".equals(developer.getName())) {
            developer.setName("default");
        }
        developer.setSalary(BigDecimal.ONE);
        developer.setStart(LocalDate.of(2017, 8, 8));

        return developer;
    }
}
