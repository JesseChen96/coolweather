package com.test.coolweather.utils;

/**
 * Author:Created by chendaoqiang on 2017/3/16.
 * Describle:
 * Function:
 */

import android.util.Log;

public class L {

        //开关
        public static final  boolean SWITCH = true;
        //TAG
        public static final String TAG = "CoolWeather";

        //四个等级  DIWE

        public static void d(String text){
            if(SWITCH){
                Log.d(TAG,text);
            }
        }

        public static void i(String text){
            if(SWITCH){
                Log.i(TAG,text);
            }
        }

        public static void w(String text){
            if(SWITCH){
                Log.w(TAG,text);
            }
        }

        public static void e(String text){
            if(SWITCH){
                Log.e(TAG,text);
            }
        }
}
