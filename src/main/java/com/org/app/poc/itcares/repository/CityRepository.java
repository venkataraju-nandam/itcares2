package com.org.app.poc.itcares.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.org.app.poc.itcares.bean.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

}