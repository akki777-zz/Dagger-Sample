package com.akshay.daggersample.di.component;

import com.akshay.daggersample.MainActivity;
import com.akshay.daggersample.WeatherReporter;
import com.akshay.daggersample.di.module.LocationModule;
import com.akshay.daggersample.di.module.WeatherModule;
import com.akshay.daggersample.service.LocationService;

import dagger.Component;

/**
 * Created by akshaymahajan on 14/12/17.
 */

@Component(modules = {LocationModule.class, WeatherModule.class})
public interface AppComponent {
    WeatherReporter getWeatherReporter();
}
