package com.akshay.daggersample.di.module;

import com.akshay.daggersample.WeatherReporter;
import com.akshay.daggersample.api.WeatherApi;
import com.akshay.daggersample.service.LocationService;
import com.akshay.daggersample.service.WeatherService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by akshaymahajan on 14/12/17.
 */

@Module
public class WeatherModule {

    @Provides
    public WeatherReporter provideWeatherReporter(WeatherService weatherService, LocationService locationService) {
        return new WeatherReporter(weatherService, locationService);
    }

    @Provides
    public WeatherService provideWeatherService(WeatherApi weatherApi) {
        return new WeatherService(weatherApi);
    }

    @Provides
    public WeatherApi provideWeatherApi() {
        return new WeatherApi();
    }
}
