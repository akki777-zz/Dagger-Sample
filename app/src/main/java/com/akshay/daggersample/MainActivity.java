package com.akshay.daggersample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

import com.akshay.daggersample.di.component.AppComponent;
import com.akshay.daggersample.di.component.DaggerAppComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();

    private WeatherReporter weatherReporter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AppComponent appComponent = DaggerAppComponent.create();
        weatherReporter = appComponent.getWeatherReporter();

        TextView tvWeather = findViewById(R.id.tv_weather);

        Button button = findViewById(R.id.btn_check);
        button.setOnClickListener(v -> {
            weatherReporter.report();
            tvWeather.setText(weatherReporter.getWeatherReport());
        });
    }
}
