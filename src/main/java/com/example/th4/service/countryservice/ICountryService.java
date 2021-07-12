package com.example.th4.service.countryservice;

import com.example.th4.model.Country;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface ICountryService {

    Iterable<Country> findAll();

    Optional<Country> findById(Long id);

    void save(Country country);

    void remove(Long id);
}
