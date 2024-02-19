package com.dsinnovators.liquibase.controllers;

import com.dsinnovators.liquibase.entities.Country;
import com.dsinnovators.liquibase.services.CountryService;
import com.dsinnovators.liquibase.utilities.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CountryController {

    private CountryService countryService;

    public CountryController(CountryService countryRepository) {
        this.countryService = countryRepository;
    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("currentPage", page);
        model.addAttribute("countries", countryService.getCountries(page));

        return "index";
    }

    @GetMapping("/countries")
    public String countries(Model model, @RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "2") int size) {
        var totalCountries = countryService.getCountries().size();
        var countries = countryService.getCountriesWithPage(new Pageable(page, size));

        model.addAttribute("currentPage", page);
        model.addAttribute("pageSize", size);
        model.addAttribute("totalPages", (totalCountries / size) + (totalCountries % size));
        model.addAttribute("countries", countries);

        for (var c : countries) {
            System.out.println(c.getName());
        }

        return "index2";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("country", new Country());

        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute("country") Country country) {
        countryService.saveCountry(country);

        return "redirect:/";
    }

}
