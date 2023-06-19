package com.example.Weather1App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("weather")
@CrossOrigin
public class WeatherController {
	@Autowired
	private WeatherService weatherService;

	@PostMapping
	public ResponseEntity<Weather> save(@RequestBody Weather weather) throws Exception {
		return ResponseEntity.ok(weatherService.save(weather));

	}

	@GetMapping("/weather/{location}")
	public ResponseEntity<Weather> findByLocation(@PathVariable String location) {
		return ResponseEntity.ok(weatherService.findByLocation(location));
	}

}
