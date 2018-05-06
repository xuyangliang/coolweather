package com.liangge.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 梁哥 on 2018/5/5.
 */

public class Now {
    @SerializedName("tmp")
    public String temperture;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
