package com.example.rjfreund.timestamp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.List;

public class ListViewTimestampAdapter extends ArrayAdapter<Timestamp>{

    public ListViewTimestampAdapter(Context context, int textViewResourceId, List<Timestamp> timestamps) {
        super(context, textViewResourceId, timestamps);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        return null;
    }
}
