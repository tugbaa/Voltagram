package com.tugbacevizci.voltagram;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by tugbacevizci on 19/01/17.
 */
public class Photo_ {

    @SerializedName("id")
    @Expose
    public String id;
    @SerializedName("owner")
    @Expose
    public String owner;
    @SerializedName("secret")
    @Expose
    public String secret;
    @SerializedName("server")
    @Expose
    public String server;
    @SerializedName("farm")
    @Expose
    public Integer farm;
    @SerializedName("title")
    @Expose
    public String title;
    @SerializedName("ispublic")
    @Expose
    public Integer ispublic;
    @SerializedName("isfriend")
    @Expose
    public Integer isfriend;
    @SerializedName("isfamily")
    @Expose
    public Integer isfamily;
    @SerializedName("ispublihttps://api.flickr.com/services/rest/?method=flickr.photos.search&api_key=ef61c0a25853f39fcaf7c1d3931e9338&format=json&nojsoncallback=1&text=cats&extras=url_oc")
    @Expose
    public Integer ispublihttpsApiFlickrComServicesRestMethodFlickrPhotosSearchApiKeyEf61c0a25853f39fcaf7c1d3931e9338FormatJsonNojsoncallback1TextCatsExtrasUrlOc;

}
