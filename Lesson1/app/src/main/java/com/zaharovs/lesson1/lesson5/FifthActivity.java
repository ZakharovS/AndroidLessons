package com.zaharovs.lesson1.lesson5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.zaharovs.lesson1.R;

/**
 * Created by 555 on 07.11.2015.
 */
public class FifthActivity extends AppCompatActivity {

    private Animation animFadeIn, animFadeOut, animRotate, animBounce;
    private TextView txtMessage;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);

        txtMessage = (TextView) findViewById(R.id.animationText);
        imageView = (ImageView) findViewById(R.id.imageViewArrow);
        findViewById(R.id.fadeInAnimationButton).setOnClickListener(clickListener);
        findViewById(R.id.fadeOutAnimationButton).setOnClickListener(clickListener);
        findViewById(R.id.rotateAnimationButton).setOnClickListener(clickListener);
        findViewById(R.id.bouceAnimationButton).setOnClickListener(clickListener);

        // load the animation
        animFadeIn = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        animFadeOut = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        animRotate = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        animBounce = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
    }

    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.fadeInAnimationButton:
                    txtMessage.startAnimation(animFadeIn);
                    break;
                case R.id.fadeOutAnimationButton:
                    txtMessage.startAnimation(animFadeOut);
                    break;
                case R.id.rotateAnimationButton:
                    imageView.startAnimation(animRotate);
                    break;
                case R.id.bouceAnimationButton:
                    imageView.startAnimation(animBounce);
                    break;
            }
        }
    };
}
