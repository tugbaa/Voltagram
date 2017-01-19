package com.tugbacevizci.voltagram;

import retrofit2.Callback;
import retrofit2.http.GET;

/**
 * Created by tugbacevizci on 19/01/17.
 */
public interface ApiInterface {

    @GET("/servejson")
    void getJsonValues(Callback<Photo[]> response);
}
