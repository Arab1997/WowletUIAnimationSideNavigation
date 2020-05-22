package com.example.wowletuianimationsidenavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnmenu, exp, st, msg, sgo, add;
    RelativeLayout maincontent;
    LinearLayout mainmenu;
    ImageView userpicbig;
    TextView user, country;

    Animation fromtop, frombottom;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnmenu = (Button) findViewById(R.id.btnmenu);

        btnmenu = (Button) findViewById(R.id.btnmenu);
        exp = (Button) findViewById(R.id.exp);
        st = (Button) findViewById(R.id.st);
        msg = (Button) findViewById(R.id.msg);
        sgo = (Button) findViewById(R.id.sgo);
        add = (Button) findViewById(R.id.add);

        user = (TextView) findViewById(R.id.user);
        country = (TextView) findViewById(R.id.country);
        userpicbig = (ImageView) findViewById(R.id.userpicbig);

        frombottom = AnimationUtils.loadAnimation(this, R.anim.frombottom);
        fromtop = AnimationUtils.loadAnimation(this, R.anim.fromtop);

        maincontent = (RelativeLayout) findViewById(R.id.maincontent);
        mainmenu = (LinearLayout) findViewById(R.id.mainMenu);

        btnmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maincontent.animate().translationX(0);
                mainmenu.animate().translationX(0);

                exp.startAnimation(frombottom);
                msg.startAnimation(frombottom);
                st.startAnimation(frombottom);
                sgo.startAnimation(frombottom);
                add.startAnimation(frombottom);

                user.startAnimation(fromtop);
                country.startAnimation(fromtop);
                userpicbig.startAnimation(fromtop);

            }
        });
        maincontent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                maincontent.animate().translationX(-735);
                mainmenu.animate().translationX(-735);

            }
        });
    }
}
