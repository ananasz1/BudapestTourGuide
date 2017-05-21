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
 * A simple {@link Fragment} subclass.
 */
public class WithKidsFragment extends Fragment {


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.zoo, R.string.zoo_desc, R.drawable.zoo, R.string.zoo_loc));
        places.add(new Place(R.string.miniversum, R.string.miniversum_desc, R.drawable.miniversum, R.string.miniversum_loc));
        places.add(new Place(R.string.zoocafe, R.string.zoocafe_desc, R.drawable.zoocafe, R.string.zoocafe_loc));
        places.add(new Place(R.string.csopa, R.string.csopa_desc, R.drawable.csopa, R.string.csopa_loc));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);


        return rootView;
    }

}
