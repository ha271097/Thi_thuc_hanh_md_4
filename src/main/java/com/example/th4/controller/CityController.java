package com.example.th4.controller;


import com.example.th4.model.City;
import com.example.th4.model.Country;
import com.example.th4.service.cityservice.CityService;
import com.example.th4.service.countryservice.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @Autowired
    private CountryService countryService;

    @ModelAttribute("country")
    public List<Country> countries() {
        return (List<Country>) countryService.findAll();
    }

    @GetMapping()
    public ModelAndView listCity(){
        ModelAndView mav = new ModelAndView("/city/list");
        mav.addObject ( "list", cityService.findAll());
        return mav;
    }


    @GetMapping("/create")
    public ModelAndView showFormCreate(){
        ModelAndView mav = new ModelAndView("/city/create");
        mav.addObject("city", new City());
        return mav;
    }

    @PostMapping("/create")
    public ModelAndView createCity(@Validated City city, BindingResult bindingResult){
        if(!bindingResult.hasErrors()) {
            cityService.save(city);
            return new ModelAndView("redirect:/city");
        }
        return new ModelAndView("redirect:/city/create");
    }


    @GetMapping("/edit/{id}")
    public ModelAndView showFormEdit(@PathVariable Long id){
        ModelAndView mav =  new ModelAndView("/city/edit");
        mav.addObject("city", cityService.findById(id));
        return mav;
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showFormDelete(@PathVariable Long id){
        ModelAndView mav = new ModelAndView("/city/delete");
        mav.addObject("city", cityService.findById(id));
        return mav;
    }

    @PostMapping("/delete")
    public ModelAndView deleteCity(City city){
        cityService.remove(city.getId());
        return new ModelAndView("redirect:/city");
    }

    @GetMapping("/view/{id}")
    public ModelAndView viewCity(@PathVariable Long id){
        return new ModelAndView("/city/view", "city", cityService.findById(id));
    }

}
