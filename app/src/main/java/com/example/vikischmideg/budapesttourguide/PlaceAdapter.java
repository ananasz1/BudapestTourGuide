package com.example.vikischmideg.budapesttourguide;

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

import butterknife.ButterKnife;


class PlaceAdapter extends ArrayAdapter<Place> {

    PlaceAdapter(@NonNull Activity context, ArrayList<Place> places) {
        super(context, 0 ,places);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // check if the current view is reused else inflate the view
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        //get the object located at position
        Place place_item = getItem(position);

        //find the textview in list_item
        TextView placeNameTextView = ButterKnife.findById(listItemView,R.id.place_name);
        TextView descriptionTextView = ButterKnife.findById(listItemView,R.id.place_description);
        ImageView mImageView = ButterKnife.findById(listItemView,R.id.place_image);
        TextView placeLocation = ButterKnife.findById(listItemView,R.id.place_location);

        assert place_item != null;
        placeNameTextView.setText(place_item.getPlaceName());
        descriptionTextView.setText(place_item.getDescription());
        mImageView.setImageResource(place_item.getImageResourceId());
        placeLocation.setText(place_item.getPlaceLocation());

        return listItemView;
    }
}
