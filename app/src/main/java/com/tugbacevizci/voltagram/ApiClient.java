package com.tugbacevizci.voltagram;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tugbacevizci on 19/01/17.
 */
public class ApiClient {
    public final static String BASE_URL = "https://api.flickr.com/services/feeds/photos_public.gne";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

