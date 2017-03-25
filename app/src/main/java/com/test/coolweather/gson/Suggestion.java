package com.test.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author:Created by chendaoqiang on 2017/3/25.
 * Describle:
 * Function:
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    public class Comfort{
        public String txt;
    }

    public Sport sport;
    public class Sport{
        public String txt;
    }
    @SerializedName("drsg")
    public Clothes clothes;
    public class Clothes{
        public String txt;
    }

}
