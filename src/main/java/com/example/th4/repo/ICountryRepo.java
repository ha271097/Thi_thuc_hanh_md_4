package com.example.th4.repo;

import com.example.th4.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICountryRepo extends JpaRepository<Country, Long> {
}
