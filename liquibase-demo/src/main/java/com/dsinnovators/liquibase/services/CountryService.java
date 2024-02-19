package com.dsinnovators.liquibase.services;

import com.dsinnovators.liquibase.entities.Country;
import com.dsinnovators.liquibase.repositories.CountryRepository;
import com.dsinnovators.liquibase.utilities.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private CountryRepository countryRepository;

    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Page<Country> getCountries(int pageNo) {
        return countryRepository.findAll(PageRequest.of(pageNo, 2));
    }

    public List<Country> getCountriesWithPage(Pageable pageable) {
        List<Country> countryPage = countryRepository.getCountriesWithPagination(pageable.getPageNo() * pageable.getPageSize(), pageable.getPageSize());

        for (var country : countryPage) {
            System.out.println(country.getName());
        }

        return countryPage;
    }

    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

}
