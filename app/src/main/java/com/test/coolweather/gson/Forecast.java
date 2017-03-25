package com.test.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author:Created by chendaoqiang on 2017/3/25.
 * Describle:
 * Function:
 */

public class Forecast {
    public String date;
    @SerializedName("cond")
    public Sun sun;
    public class Sun{
        @SerializedName("txt_d")
        public String sun;
    }
    @SerializedName("tmp")
    public Temperature temperature;
    public class Temperature{
        public String max;
        public String min;
    }

}
