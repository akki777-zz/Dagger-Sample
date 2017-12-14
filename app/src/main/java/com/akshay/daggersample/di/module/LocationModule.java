package com.akshay.daggersample.di.module;

import com.akshay.daggersample.GpsProvider;
import com.akshay.daggersample.service.LocationService;

import dagger.Module;
import dagger.Provides;

/**
 * Created by akshaymahajan on 14/12/17.
 */

@Module
public class LocationModule {

    @Provides
    public LocationService provideLocationService(GpsProvider gpsProvider) {
        return new LocationService(gpsProvider);
    }

    @Provides
    public GpsProvider provideGpsProvider() {
        return new GpsProvider();
    }
}
