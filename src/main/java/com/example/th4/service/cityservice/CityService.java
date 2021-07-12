package com.example.th4.service.cityservice;


import com.example.th4.model.City;
import com.example.th4.repo.ICityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CityService implements ICityService{

    @Autowired
    private ICityRepo cityRepo;


    @Override
    public Iterable<City> findAll() {
        return cityRepo.findAll();
    }

    @Override
    public Optional<City> findById(Long id) {
        return cityRepo.findById(id);
    }

    @Override
    public void save(City city) {
        cityRepo.save(city);
    }

    @Override
    public void remove(Long id) {
        cityRepo.deleteById(id);
    }
}
