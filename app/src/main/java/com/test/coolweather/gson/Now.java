package com.test.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author:Created by chendaoqiang on 2017/3/25.
 * Describle:
 * Function:
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    public Wind wind;
    public class Wind{
        @SerializedName("sc")
        public String degree;
        @SerializedName("dir")
        public String direction;
    }
    @SerializedName("con")
    public Condition condition;
    public class Condition{
        public String code;
        public String txt;
    }
}
