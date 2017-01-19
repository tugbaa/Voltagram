package com.tugbacevizci.voltagram;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by tugbacevizci on 19/01/17.
 */
public class Photos {

    @SerializedName("page")
    @Expose
    public Integer page;
    @SerializedName("pages")
    @Expose
    public Integer pages;
    @SerializedName("perpage")
    @Expose
    public Integer perpage;
    @SerializedName("total")
    @Expose
    public Integer total;
    @SerializedName("photo")
    @Expose
    public List<Photo_> photo = null;
}
