package com.example.rjfreund.timestamp;

import android.widget.ArrayAdapter;

/**
 * Created by rjf5742 on 15-08-22.
 */
public class ListViewTimestampAdapter extends ArrayAdapter<Timestamp>{

    public ListViewTimestampAdapter(Context context, List<Timestamp> timestamps) {
        super(context, R.layout.timestamp_item_main, timestamps);
    }
}
