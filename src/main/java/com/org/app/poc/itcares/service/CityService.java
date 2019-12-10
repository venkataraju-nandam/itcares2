package com.org.app.poc.itcares.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.app.poc.itcares.bean.City;
import com.org.app.poc.itcares.repository.CityRepository;

import java.util.Optional;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository cityRepository;

//    @Override
    public Optional<City> findById(Long id) {

        return cityRepository.findById(id);
    }
}