package com.liangge.coolweather.gson;

/**
 * Created by 梁哥 on 2018/5/5.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
