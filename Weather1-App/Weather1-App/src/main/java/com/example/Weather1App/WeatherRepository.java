package com.example.Weather1App;

import org.springframework.data.repository.CrudRepository;

public interface WeatherRepository extends CrudRepository<Weather, Integer> {

	public Weather findByLocation(String location);

}
