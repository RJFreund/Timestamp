package com.example.rjfreund.timestamp;

import android.app.ListFragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.security.Timestamp;
import java.util.Date;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends ListFragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_main, container, false);
        Button addTimestampBtn = (Button) fragmentView.findViewById(R.id.addTimestampButton);
        final TextView timestampTextView = (TextView) fragmentView.findViewById(R.id.timestampTextView);
        addTimestampBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date now = new Date();
                timestampTextView.setText(now.toString());
            }
        });

        //this.setListAdapter();
        return fragmentView;
    }
}
