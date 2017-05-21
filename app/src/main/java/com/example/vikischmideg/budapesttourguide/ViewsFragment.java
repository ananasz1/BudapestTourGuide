package com.example.vikischmideg.budapesttourguide;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ViewsFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> bars = new ArrayList<>();
        bars.add(new Place(R.string.boldog, R.string.boldog_desc, R.drawable.view_boldog, R.string.boldog_loc));
        bars.add(new Place(R.string.csergezan, R.string.csergezan_desc, R.drawable.view_csergezan, R.string.csergezan_loc));
        bars.add(new Place(R.string.kaan, R.string.kaan_desc, R.drawable.view_kaan, R.string.kaan_loc));
        bars.add(new Place(R.string.elizabeth, R.string.elizabath_desc, R.drawable.view_erzsebet, R.string.elizabeth_loc));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), bars);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}
