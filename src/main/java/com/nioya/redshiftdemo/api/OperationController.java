package com.nioya.redshiftdemo.api;
import com.nioya.redshiftdemo.model.City;
import com.nioya.redshiftdemo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
public class OperationController {

    @Autowired
    private CityRepository cityRepository;

    @PostMapping("/save")
    @ResponseBody
    public void saveCity(@RequestParam() String notebook)
    {
        City city = new City();
        Random rand = new Random();
        city.setCity(notebook);
        city.setCityid(rand.nextInt());
        cityRepository.save(city);
        city.setCityid(rand.nextInt());
        cityRepository.save(city);
    }

    @GetMapping("/save")
    @ResponseBody
    public List<City> getCities(@RequestParam() String notebook)
    {
        City city = new City();
        Random rand = new Random();
        city.setCity(notebook);
        city.setCityid(rand.nextInt());
        cityRepository.save(city);
        city.setCityid(rand.nextInt());
        cityRepository.save(city);
        return cityRepository.findAll();
    }
}
