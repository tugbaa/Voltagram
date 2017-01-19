package com.tugbacevizci.voltagram;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.lang.reflect.Method;
import java.text.Format;

/**
 * Created by tugbacevizci on 19/01/17.
 */
public class Photo {

    @SerializedName("method")
    @Expose
    public Method method;
    @SerializedName("format")
    @Expose
    public Format format;
    @SerializedName("api_key")
    @Expose
    public ApiKey apiKey;
    @SerializedName("stat")
    @Expose
    public String stat;


}

