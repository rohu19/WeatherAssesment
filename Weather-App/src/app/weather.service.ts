import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Weather } from './weather.model';
@Injectable({
  providedIn: 'root'
})
export class WeatherService {
  private apiUrl = 'http://localhost:9090/weather/weather/';

  constructor(private http: HttpClient) {}

  getWeatherByLocation(location: string): Observable<Weather> {
    return this.http.get<Weather>(this.apiUrl + location);
  }
}