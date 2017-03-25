package com.test.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author:Created by chendaoqiang on 2017/3/25.
 * Describle:
 * Function:
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("prov")
    public String provinceName;
    @SerializedName("id")
    public String weatherId;
    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
