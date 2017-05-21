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

public class SightFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.buda_castle, R.string.budacastle_desc, R.drawable.buda_castle, R.string.budacastle_loc));
        places.add(new Place(R.string.fishermans_bastion, R.string.fishermans_desc, R.drawable.fishermans, R.string.fishermans_loc));
        places.add(new Place(R.string.chain_bridge, R.string.chainbridge_desc, R.drawable.chainbridge, R.string.chainbridge_loc));
        places.add(new Place(R.string.heroes_square, R.string.heroes_desc, R.drawable.heroessquare, R.string.heroes_loc));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);


        return rootView;
    }
}
