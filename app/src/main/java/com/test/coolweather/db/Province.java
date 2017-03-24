package com.test.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Author:Created by chendaoqiang on 2017/3/24.
 * Describle:
 * Function:
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String province) {
        this.provinceName = province;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
