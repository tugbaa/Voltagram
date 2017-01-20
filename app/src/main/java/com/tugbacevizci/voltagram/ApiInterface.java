package com.tugbacevizci.voltagram;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by tugbacevizci on 19/01/17.
 */
public interface ApiInterface {

    @GET("/services/rest/?method=flickr.photos.search&api_key=ef61c0a25853f39fcaf7c1d3931e9338&format=json&nojsoncallback=1&text=cats&extras=url_oc")
    Call<Photo> getJsonValues();

}
