package com.test.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Author:Created by chendaoqiang on 2017/3/24.
 * Describle:
 * Function:
 */

public class County extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
