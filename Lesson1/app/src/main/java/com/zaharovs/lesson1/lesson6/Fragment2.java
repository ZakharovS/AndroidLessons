package com.zaharovs.lesson1.lesson6;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.zaharovs.lesson1.R;

public class Fragment2 extends Fragment {

    private TextView mInfoTextView;
    private ImageView mCatImageView;
    private String[] articlesDescriptionArray;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment2, container, false);

        mInfoTextView = (TextView) rootView.findViewById(R.id.textView1);
        mCatImageView = (ImageView) rootView.findViewById(R.id.imageView1);

        articlesDescriptionArray = getResources().getStringArray(R.array.articles);
        return rootView;
    }
    public void setDescription(int buttonIndex) {
        String catDescription = articlesDescriptionArray[buttonIndex];
        mInfoTextView.setText(catDescription);

        switch (buttonIndex) {
            case 0:
                mInfoTextView.setText(articlesDescriptionArray[0]);
                break;
            case 1:
                mInfoTextView.setText(articlesDescriptionArray[1]);
                break;
            case 2:
                mInfoTextView.setText(articlesDescriptionArray[2]);
                break;
            default:
                break;
        }
    }
}
