package com.example.iulia.baiamarecity;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TouristAdapter extends ArrayAdapter<Tourist> {
    private Tourist currentTourist;

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tourist_list, parent, false);
        }
        currentTourist = getItem(position);
        ImageView selectedHotel = (ImageView) listItemView.findViewById(R.id.hotel_image);
        selectedHotel.setImageResource(currentTourist.getHotelImage());
        TextView title = (TextView) listItemView.findViewById(R.id.title_details);
        title.setText(currentTourist.getHotelName());
        TextView description = (TextView) listItemView.findViewById(R.id.description_details);
        description.setText(currentTourist.getHotelDescription());
        TextView webPage = (TextView) listItemView.findViewById(R.id.link_details);
        webPage.setText(currentTourist.getHotelLink());
        return listItemView;
    }

    public TouristAdapter(Activity context, ArrayList<Tourist> tourists) {
        super(context, 0, tourists);
    }
}
