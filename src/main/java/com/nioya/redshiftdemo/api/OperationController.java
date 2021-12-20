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
    public void saveCity(@RequestParam() String cityName)
    {
        City city = new City();
        city.setId(new Random().nextInt(100));
        city.setName(cityName);
        cityRepository.save(city);

    }

    @GetMapping("/get")
    @ResponseBody
    public List<City> getCities()
    {
        return cityRepository.findAll();
    }
}
