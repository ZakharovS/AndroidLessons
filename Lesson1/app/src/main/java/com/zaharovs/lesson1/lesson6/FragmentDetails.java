package com.zaharovs.lesson1.lesson6;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.zaharovs.lesson1.R;

/**
 * Created by 555 on 15.11.2015.
 */
public class FragmentDetails extends Fragment {

    String name[] = new String[]{"HIIIIII", "HELLOOOOO", "BYYYYYYYYYYYY"};
    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_two_sixth_ht, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = (TextView) view.findViewById(R.id.sixth_ht_description);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() instanceof SixthActivityTwo) {
            Bundle bundle = getArguments();
            int position = bundle.getInt("position");
            textView.setText(name[position]);
        }
    }
}
