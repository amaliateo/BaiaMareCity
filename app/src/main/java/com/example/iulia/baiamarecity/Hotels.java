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
public class Hotels extends Fragment {


    public Hotels() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_city, container, false);
        
        final ArrayList<Tourist> hotels = new ArrayList<Tourist>();
        hotels.add(new Tourist(R.drawable.casteltransilvania, R.string.castel_transilvania, R.string.castel_transilvania_description, R.string.castel_transilvania_link));
        hotels.add(new Tourist(R.drawable.hotelmara, R.string.hotel_mara, R.string.hotel_mara_description, R.string.hotel_mara_link));
        hotels.add(new Tourist(R.drawable.eurohotel, R.string.eurohotel, R.string.eurohotel_description, R.string.eurohotel_link));
        hotels.add(new Tourist(R.drawable.hoteldiafan, R.string.hotel_diafan, R.string.hotel_diafan_description, R.string.hotel_diafan_link));
        hotels.add(new Tourist(R.drawable.hoteleuropa, R.string.hotel_europa, R.string.hotel_europa_description, R.string.hotel_europa_link));
        hotels.add(new Tourist(R.drawable.hotelromanita, R.string.hotel_romanita, R.string.hotel_roamita_description, R.string.hotel_romanita_link));

        //initialize an adapter for the new arraylist
        TouristAdapter itemsAdapter = new TouristAdapter(getActivity(), hotels);
        ListView gridView = (ListView) rootView.findViewById(R.id.listView_hotel);
        gridView.setAdapter(itemsAdapter);

        return rootView;
    }


}
