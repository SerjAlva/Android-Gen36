package com.example.leserge.tarea1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Animacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animacion);
    }
    public void rotate(View view){
        ImageView animationTarget = (ImageView)this.findViewById(R.id.imageView);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.rotation);
        animationTarget.startAnimation(animation);
    }
    public void rotar(View view){
        rotate(this.findViewById(R.id.imageView));
    }

}
