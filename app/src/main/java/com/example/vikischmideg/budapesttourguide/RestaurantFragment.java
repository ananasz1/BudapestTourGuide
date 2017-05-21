package com.example.vikischmideg.budapesttourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by viki.schmideg on 2017.05.20..
 */

public class RestaurantFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.mosselen, R.string.mosselen_desc, R.drawable.mosselen, R.string.mosselen_loc));
        places.add(new Place(R.string.koronakert, R.string.koronakert_desc, R.drawable.koronakert, R.string.koronakert_loc));
        places.add(new Place(R.string.mazeltov, R.string.mazeltov_desc, R.drawable.mazeltov, R.string.mazeltov_loc));
        places.add(new Place(R.string.costes, R.string.costes_desc, R.drawable.costes, R.string.costes_loc));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);


        return rootView;
    }
}
