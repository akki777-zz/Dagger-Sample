package com.akshay.daggersample.service;

import com.akshay.daggersample.api.WeatherApi;

/**
 * Created by akshaymahajan on 13/12/17.
 */

public class WeatherService {

    private WeatherApi weatherApi;

    public WeatherService(WeatherApi weatherApi) {
        this.weatherApi = weatherApi;
    }


    public String getTemperature() {
        return "" + weatherApi.getTemperature() + "\u00B0C";
    }

    public String printTemperature() {
        return "Current Temperature is " + weatherApi.getTemperature() + "degrees Celsius";
    }

    public String printHumidity(String location) {
        return "Humidity in " + location + " is " + weatherApi.getHumidity();
    }
}
