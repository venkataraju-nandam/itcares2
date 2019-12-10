package com.org.app.poc.itcares.controller;


import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.org.app.poc.itcares.bean.City;
import com.org.app.poc.itcares.service.ICityService;



@Component
public class CityRunner implements CommandLineRunner {

    @Autowired
    private ICityService cityService;
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void run(String... args) throws Exception {

        long id1 = 2L;
        logger.info("**********  CityRunner  ***** RUN  ***** ");
        cityService.findById(id1).ifPresent(System.out::println);
        logger.info("**********  CityRunner  ***** RUN  ***** " + cityService.findById(id1));

        long id2 = 24L;
        Optional<City> city = cityService.findById(id2);

        if (city.isPresent()) {
        	 logger.info("**********  CityRunner  ***** RUN  *****  "+city.get());
        } else {
        	 logger.info("**********  CityRunner  ***** RUN  *****   - No city found with id %d%n" + id2);
        }
    }
}