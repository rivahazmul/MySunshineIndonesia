package com.riva.example.mysunshineindonesia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView weatherDayTitle;
    ImageView ImgWeather;
    TextView weatherDesc;
    TextView weatherTemperature;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weatherDayTitle= (TextView) findViewById(R.id.weather_day_title);
        ImgWeather= (ImageView) findViewById(R.id.img_weather);
        weatherDesc= (TextView) findViewById(R.id.weather_desc);
        //weatherTemperature= (TextView) findViewById(R.id.);

        weatherDayTitle.setText("Hari Minggu");
        weatherDesc.setText("cerah sekaleee");

        ImgWeather.setImageResource(R.drawable.ic_launcher_foreground);

    }
}
