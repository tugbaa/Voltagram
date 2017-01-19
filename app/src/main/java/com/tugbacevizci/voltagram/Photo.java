package com.tugbacevizci.voltagram;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tugbacevizci on 19/01/17.
 */
public class Photo {


    @SerializedName("photos")
    @Expose
    public Photos photos;
    @SerializedName("stat")
    @Expose
    public String stat;


}

