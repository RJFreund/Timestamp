package com.example.rjfreund.timestamp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class ListViewTimestampAdapter extends ArrayAdapter<Timestamp>{

    public ListViewTimestampAdapter(Context context, int textViewResourceId, List<Timestamp> timestamps) {
        super(context, textViewResourceId, timestamps);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.timestamp, parent, false);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        convertView.setTag(textView);

        Timestamp timestamp = getItem(position);
        textView.setText(timestamp.getNote());

        return convertView;
    }
}
