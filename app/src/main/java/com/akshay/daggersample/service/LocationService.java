package com.akshay.daggersample.service;

import com.akshay.daggersample.GpsProvider;

/**
 * Created by akshaymahajan on 13/12/17.
 */

public class LocationService {

    private final GpsProvider gpsProvider;

    public LocationService(GpsProvider gpsProvider) {
        this.gpsProvider = gpsProvider;
    }

    public String getCurrentLocation() {
        return gpsProvider.getCurrentLocation();
    }

    public String getLocationLatitude() {
        return null;
    }

}
