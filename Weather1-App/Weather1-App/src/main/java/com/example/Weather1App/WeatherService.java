package com.example.Weather1App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WeatherService {

	@Autowired
	private static WeatherRepository weatherRepository;

	@Autowired
	public WeatherService(WeatherRepository weatherRepository) {
		this.weatherRepository = weatherRepository;
	}

	public Weather save(Weather weather) throws Exception {

		return weatherRepository.save(weather);

	}

	public Weather findByLocation(String location) {
		return weatherRepository.findByLocation(location);
	}

}
