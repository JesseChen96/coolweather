package com.test.coolweather.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Author:Created by chendaoqiang on 2017/3/20.
 * Describle:
 * Function:
 */

public class MyToast {
    public static void show(Context context, String content){
        Toast.makeText(context,content,Toast.LENGTH_SHORT).show();
    }
}
