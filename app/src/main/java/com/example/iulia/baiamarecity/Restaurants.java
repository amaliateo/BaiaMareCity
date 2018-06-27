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
public class Restaurants extends Fragment {


    public Restaurants() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_city, container, false);
        final ArrayList<Tourist> restaurants = new ArrayList<Tourist>();
        restaurants.add(new Tourist(R.drawable.bizo, R.string.bizo, R.string.bizo_description, R.string.bizo_link));
        restaurants.add(new Tourist(R.drawable.butoiasucubere, R.string.butoisu, R.string.butoiasu_description, R.string.butoiasu_link));
        restaurants.add(new Tourist(R.drawable.centro_restaurant, R.string.centro, R.string.centro_description, R.string.centro_link));
        restaurants.add(new Tourist(R.drawable.lumiere, R.string.lumiere, R.string.lumiere_description, R.string.lumiere_link));
        restaurants.add(new Tourist(R.drawable.palincie, R.string.palincie, R.string.palincie_description, R.string.palincie_link));
        restaurants.add(new Tourist(R.drawable.pressco, R.string.pressco, R.string.pressco_description, R.string.pressco_link));
        TouristAdapter itemsAdapter = new TouristAdapter(getActivity(), restaurants);
        ListView gridView = (ListView) rootView.findViewById(R.id.listView_hotel);
        gridView.setAdapter(itemsAdapter);
        return rootView;
    }

}
