package com.test.coolweather.gson;

/**
 * Author:Created by chendaoqiang on 2017/3/25.
 * Describle:
 * Function:描述空气质量
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
        public String qlty;
    }

}
