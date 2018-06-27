package com.example.iulia.baiamarecity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class DayTrips extends Fragment {


    public DayTrips() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_city, container, false);
        final ArrayList<Tourist> dayTrips = new ArrayList<Tourist>();
        dayTrips.add(new Tourist(R.drawable.barsana_monastery, R.string.barsana_monastery, R.string.barsana_monastery_description, R.string.barsana_monastery_link));
        dayTrips.add(new Tourist(R.drawable.horses_waterfall, R.string.horses_waterfall, R.string.horses_waterfall_description, R.string.horses_waterfall_link));
        dayTrips.add(new Tourist(R.drawable.memorial_victims_of_communism, R.string.memorial_victims_communism, R.string.merry_cemetery_description, R.string.memorial_victims_communism_link));
        dayTrips.add(new Tourist(R.drawable.merry_cemetery, R.string.merry_cemetery, R.string.merry_cemetery_description, R.string.merry_cemetery_link));
        dayTrips.add(new Tourist(R.drawable.vaser_train, R.string.vaser, R.string.vaser_description, R.string.vaser_link));

        TouristAdapter itemsAdapter = new TouristAdapter(getActivity(), dayTrips);
        ListView listView = (ListView) rootView.findViewById(R.id.listView_hotel);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
