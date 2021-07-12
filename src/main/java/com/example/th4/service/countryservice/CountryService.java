package com.example.th4.service.countryservice;

import com.example.th4.model.Country;
import com.example.th4.repo.ICountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CountryService implements ICountryService{

    @Autowired
    private ICountryRepo countryRepo;

    @Override
    public Iterable<Country> findAll() {
        return countryRepo.findAll();
    }

    @Override
    public Optional<Country> findById(Long id) {
        return countryRepo.findById(id);
    }

    @Override
    public void save(Country country) {
        countryRepo.save(country);
    }

    @Override
    public void remove(Long id) {
        countryRepo.deleteById(id);
    }
}
