package com.tugbacevizci.voltagram;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    private final static String API_KEY = "ef61c0a25853f39fcaf7c1d3931e9338";
    // secret : 824136bc9f855732

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        requestWindowFeature(Window.FEATURE_INDETERMINATE_PROGRESS);
        requestWindowFeature(Window.FEATURE_PROGRESS);

        setContentView(R.layout.activity_main);

        ArrayAdapter<Photo> arrayAdapter =
                new ArrayAdapter<Photo>(this,
                        android.R.layout.simple_list_item_1,
                        android.R.id.text1,
                        new ArrayList<Photo>());
        setListAdapter(arrayAdapter);
        setProgressBarIndeterminateVisibility(true);
        setProgressBarVisibility(true);

    }
}
