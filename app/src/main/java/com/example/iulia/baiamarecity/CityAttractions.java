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
public class CityAttractions extends Fragment {


    public CityAttractions() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_city, container, false);

        final ArrayList<Tourist> city = new ArrayList<Tourist>();
        city.add(new Tourist(R.drawable.art_museum, R.string.art_museum, R.string.art_museum_description, R.string.art_museum_link));
        city.add(new Tourist(R.drawable.bastion_baiamare, R.string.bastion, R.string.bastion_description, R.string.bastion_link));
        city.add(new Tourist(R.drawable.stephen_s_tower, R.string.tower, R.string.tower_description, R.string.tower_link));
        city.add(new Tourist(R.drawable.village_museum, R.string.village_museum, R.string.village_museum_description, R.string.village_museum_link));
        city.add(new Tourist(R.drawable.planetarium, R.string.planetarium, R.string.planetarium_description, R.string.planetarium_link));
        //initialize an adapter for the new arraylist
        TouristAdapter itemsAdapter = new TouristAdapter(getActivity(), city);
        ListView listView = (ListView) rootView.findViewById(R.id.listView_hotel);
        listView.setAdapter(itemsAdapter);

        return rootView;
    }

}
