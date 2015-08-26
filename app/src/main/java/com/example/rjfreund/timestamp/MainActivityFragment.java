package com.example.rjfreund.timestamp;

import android.app.ListFragment;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private List<String> timestamps;

    public MainActivityFragment() {
        timestamps = new ArrayList<String>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.fragment_main, container, false);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                getActivity(), R.layout.timestamp, R.id.textView, timestamps
        );
        Button addTimestampBtn = (Button) fragmentView.findViewById(R.id.addTimestampButton);
        addTimestampBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Date createDate = new Date();
                timestamps.add(createDate.toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });

        ListView listView = (ListView) fragmentView.findViewById(R.id.listView);
        listView.setAdapter(arrayAdapter);
        return fragmentView;
    }
}
