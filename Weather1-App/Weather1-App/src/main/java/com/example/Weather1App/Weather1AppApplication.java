package com.example.Weather1App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Weather1AppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Weather1AppApplication.class, args);
	}

	@Autowired
	private WeatherService weatherService;

	@Override
	public void run(String... args) throws Exception {
		Weather weather = new Weather();
		weather.setId(1);
		weather.setLocation("Bangalore");
		weather.setCondition("Clody");
		weather.setTemperature(18.58);
		weather.setHumidity(0.5);
		weatherService.save(weather);

		Weather weather1 = new Weather();
		weather1.setId(2);
		weather1.setLocation("Chennai");
		weather1.setCondition("Raining");
		weather1.setTemperature(25.9);
		weather1.setHumidity(4.3);
		weatherService.save(weather1);

		Weather weather2 = new Weather();
		weather2.setId(3);
		weather2.setLocation("Hyderabad");
		weather2.setCondition("Thunder");
		weather2.setTemperature(15.7);
		weather2.setHumidity(7.3);
		weatherService.save(weather2);

		Weather weather3 = new Weather();
		weather3.setId(4);
		weather3.setLocation("Pune");
		weather3.setCondition("Partly");
		weather3.setTemperature(19.1);
		weather3.setHumidity(0.1);
		weatherService.save(weather3);

		Weather weather4 = new Weather();
		weather4.setId(5);
		weather4.setLocation("New Delhi");
		weather4.setCondition("Foggy");
		weather4.setTemperature(11.7);
		weather4.setHumidity(3.0);
		weatherService.save(weather4);

		Weather weather5 = new Weather();
		weather5.setId(6);
		weather5.setLocation("Varanasi");
		weather5.setCondition("Raining");
		weather5.setTemperature(21.4);
		weather5.setHumidity(8.1);
		weatherService.save(weather5);
	}

}
