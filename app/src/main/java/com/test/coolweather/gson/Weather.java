package com.test.coolweather.gson;

import java.util.List;

/**
 * Author:Created by chendaoqiang on 2017/3/25.
 * Describle:
 * Function:
 */

public class Weather {
    public String status;
    public Now now;
    public Suggestion suggestion;
    public AQI aqi;
    public Basic basic;
    public List<Forecast> forecasts;
}
