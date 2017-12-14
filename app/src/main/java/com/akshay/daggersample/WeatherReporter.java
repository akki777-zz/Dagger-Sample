package com.akshay.daggersample;

import com.akshay.daggersample.service.LocationService;
import com.akshay.daggersample.service.WeatherService;

import javax.inject.Inject;

/**
 * Created by akshaymahajan on 13/12/17.
 */

public class WeatherReporter {

    private static final String TAG = WeatherReporter.class.getSimpleName();

    @Inject
    WeatherService weatherService;

    @Inject
    LocationService locationService;

    public WeatherReporter(WeatherService weatherService, LocationService locationService) {
        this.weatherService = weatherService;
        this.locationService = locationService;
    }

    String getWeatherReport() {
        return locationService.getCurrentLocation() + ": " + weatherService.getTemperature();
    }

    void report() {
        Logger.log(TAG, "Weather:- " + weatherService.printTemperature() + " at Location: " + locationService.getCurrentLocation() + "\n"
                + weatherService.printHumidity(locationService.getCurrentLocation()));
    }
}
