package com.example.th4.service.cityservice;

import com.example.th4.model.City;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ICityService {

    Iterable<City> findAll();

    Optional<City> findById(Long id);

    void save(City city);

    void remove(Long id);
}
