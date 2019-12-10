package com.org.app.poc.itcares.service;



import java.util.Optional;
import com.org.app.poc.itcares.bean.City;

public interface ICityService {

    Optional<City> findById(Long id);
}
