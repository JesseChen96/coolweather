package com.test.coolweather.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Author:Created by chendaoqiang on 2017/3/24.
 * Describle:
 * Function:
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
