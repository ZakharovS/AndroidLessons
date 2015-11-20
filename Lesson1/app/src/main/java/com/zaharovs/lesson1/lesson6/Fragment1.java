package com.zaharovs.lesson1.lesson6;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Fragment1 extends ListFragment {

    String[] articles =  {"About Dog", "About Cat", "About me"};

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter(getActivity(), android.R.layout.simple_list_item_1, articles);
        setListAdapter(arrayAdapter);
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        OnSelectedItemListener listener = (OnSelectedItemListener) getActivity();
        listener.onButtonSelected(position);
    }

    public interface OnSelectedItemListener {
        void onButtonSelected(int itemPosition);
    }

}
