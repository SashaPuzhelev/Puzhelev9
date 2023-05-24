package com.example.puzhelev9;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Color;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstraintLayout constraintLayout = new ConstraintLayout(this);

        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.verticalBias = (float) 0.158;


        TextView textViewWelcome = new TextView(this);
        textViewWelcome.setText("Добро пожаловать");
        textViewWelcome.setTextSize(30);
        textViewWelcome.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
        textViewWelcome.setLayoutParams(layoutParams);
        constraintLayout.addView(textViewWelcome);

        TextView textViewMain = new TextView(this);
        textViewMain.setText("Главная");
        textViewMain.setTextSize(30);
        textViewMain.setTextColor(getResources().getColor(android.R.color.holo_green_light));

        ConstraintLayout.LayoutParams layoutParams1 = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams1.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams1.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams1.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams1.verticalBias = (float) 0.278;

        textViewMain.setLayoutParams(layoutParams1);
        constraintLayout.addView(textViewMain);

        TextView textViewCatalog = new TextView(this);
        textViewCatalog.setText("Каталог");
        textViewCatalog.setTextSize(30);
        textViewCatalog.setTextColor(getResources().getColor(android.R.color.holo_orange_dark));
        ConstraintLayout.LayoutParams layoutParams2 = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams2.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams2.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams2.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams2.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams2.verticalBias = (float) 0.278;

        textViewCatalog.setLayoutParams(layoutParams2);
        constraintLayout.addView(textViewCatalog);

        TextView textViewAboutUs = new TextView(this);
        textViewAboutUs.setText("О нас ");
        textViewAboutUs.setTextSize(30);
        textViewAboutUs.setTextColor(getResources().getColor(android.R.color.holo_red_light));
        ConstraintLayout.LayoutParams layoutParams3 = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams3.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams3.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams3.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams3.verticalBias = (float) 0.278;

        textViewAboutUs.setLayoutParams(layoutParams3);
        constraintLayout.addView(textViewAboutUs);

        TextView textViewData = new TextView(this);
        textViewData.setText("04.04.2023");
        textViewData.setTextSize(30);
        textViewData.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
        ConstraintLayout.LayoutParams layoutParams4 = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams4.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams4.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams4.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams4.setMargins(0,100,0,0);
        layoutParams4.verticalBias = (float) 0.278;

        textViewData.setLayoutParams(layoutParams4);
        constraintLayout.addView(textViewData);

        TextView textViewSurname = new TextView(this);
        textViewSurname.setText("Puzhelev");
        textViewSurname.setTextSize(30);
        textViewSurname.setTextColor(getResources().getColor(android.R.color.black));
        ConstraintLayout.LayoutParams layoutParams5 = new ConstraintLayout.LayoutParams
                (ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        layoutParams5.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams5.rightToRight = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams5.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams5.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams5.setMargins(100,300,100,100);
        layoutParams5.verticalBias = (float) 0.278;

        textViewSurname.setLayoutParams(layoutParams5);
        constraintLayout.addView(textViewSurname);

        setContentView(constraintLayout);

    }
}