package com.tugbacevizci.voltagram;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private final int COLUMN_NUMBER=3;
    private static final String TAG = MainActivity.class.getSimpleName();;
    List<Photo> photoList = new ArrayList<>();
    RecyclerView recyclerView;
    PhotoAdapter photoAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        photoAdapter = new PhotoAdapter(photoList,R.layout.card_view_layout,getApplicationContext());
        recyclerView = (RecyclerView) findViewById(R.id.photo_recycler_view);
        recyclerView.setLayoutManager(new GridLayoutManager(this, COLUMN_NUMBER));
        recyclerView.setAdapter(photoAdapter);

        ApiInterface apiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<Photo> call = apiInterface.getPhotos();

        call.enqueue(new Callback<Photo>() {


            @Override
            public void onResponse(Call<Photo> call, Response<Photo> response) {
                if (response != null && response.errorBody() != null) {

                    photoList = Arrays.asList(response.body());

                }
            }

            @Override
            public void onFailure(Call<Photo> call, Throwable t) {

                Log.e(TAG, "HATA: " + t.toString());
            }
        });

    }


}
