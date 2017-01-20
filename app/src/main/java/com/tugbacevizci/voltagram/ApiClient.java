package com.tugbacevizci.voltagram;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by tugbacevizci on 19/01/17.
 */
public class ApiClient {

    private final static String API_KEY = "ef61c0a25853f39fcaf7c1d3931e9338";
    public final static String BASE_URL = "https://api.flickr.com/services/rest/";
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

