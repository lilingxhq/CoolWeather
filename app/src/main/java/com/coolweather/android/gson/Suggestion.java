package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 1 on 2020/4/15.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;  //舒适度

    @SerializedName("cw")
    public CarWash carWash; //洗车建议

    public Sport sport; //运动建议

    public class Comfort {
        @SerializedName("txt")
        public String info;


    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }

    public class Sport {
        @SerializedName("txt")
        public String info;
    }

}
