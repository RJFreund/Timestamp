package com.example.rjfreund.timestamp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListViewTimestampAdapter extends ArrayAdapter<Timestamp>{

    private final ArrayList<Timestamp> timestamps;

    public ListViewTimestampAdapter(Context context, int textViewResourceId, ArrayList<Timestamp> inputTimestamps) {
        super(context, textViewResourceId, inputTimestamps);
        timestamps = inputTimestamps;
        timestamps.add(new Timestamp("hey"));
        timestamps.add(new Timestamp("you"));
        timestamps.add(new Timestamp("What's"));
        timestamps.add(new Timestamp("up?"));
        timestamps.add(new Timestamp("yayayaya"));
        timestamps.add(new Timestamp("hello how are you? You look nice today."));
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent)
    {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.timestamp, parent, false);
        TextView createDate = (TextView) convertView.findViewById(R.id.createDate);
        TextView note = (TextView) convertView.findViewById(R.id.note);
        Button deleteButton = (Button) convertView.findViewById(R.id.buttonDelete);

        Timestamp timestamp = getItem(position);
        createDate.setText(timestamp.getCreateDate().toString());
        note.setText(timestamp.getNote());
        deleteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                timestamps.remove(position);
                notifyDataSetChanged();
            }
        });

        return convertView;
    }

    public void addTimestamp(Timestamp timestamp)
    {
        this.timestamps.add(timestamp);
        notifyDataSetChanged();
    }
}
