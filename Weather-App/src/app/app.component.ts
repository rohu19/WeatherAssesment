import { Component, OnInit } from '@angular/core';
import { WeatherService } from './weather.service';
import { Weather } from './weather.model';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title(title: any) {
    throw new Error('Method not implemented.');
  }

  locationName: string="";
  weatherData: Weather[] = [];

  constructor(private weatherService: WeatherService) {}

  ngOnInit() {}

  searchWeather() {
    if (this.locationName) {
      this.weatherService.getWeatherByLocation(this.locationName).subscribe(
        (response) => {
          this.weatherData = [response];
        },
        (error) => {
          console.error('Error fetching weather data:', error);
        }
      );
    }
  }
}