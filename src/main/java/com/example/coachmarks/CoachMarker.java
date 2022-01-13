package com.example.coachmarks;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CoachMarker extends LinearLayout {
    Button makeMagic;
    Context c;
    View v;
    FrameLayout content;
    Boolean ifFrameAdded = false;
    LinearLayout buttonHolder;
    FrameLayout empty;
    ConstraintLayout constraintLayout;
    int gray = Color.GRAY;
    int textColor = Color.WHITE;
    float d = getContext().getResources().getDisplayMetrics().density;
    //skapa en constraintlayut och sätta ett kors som vi kan stätta relativa x,y värden till

    public CoachMarker(@NonNull Context context) {
        super(context);
        this.c = context;
       init();
    }
    public CoachMarker(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.c = context;
        init();
    }
    public CoachMarker(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.c = context;
        init();
    }
    public CoachMarker(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        this.c = context;
        init();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    private void init(){
        LinearLayout.LayoutParams wholeScreen = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout.LayoutParams buttonparams = new LinearLayout.LayoutParams
                (LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        this.setLayoutParams(wholeScreen);
        this.setOrientation(VERTICAL);
        makeMagic = new Button(c);
        makeMagic.setText("Coach");
        buttonHolder = new LinearLayout(c);
        buttonHolder.setLayoutParams(buttonparams);
        buttonHolder.addView(makeMagic);
        this.addView(buttonHolder);

        empty = new FrameLayout(c);
        this.addView(empty);
        content = new FrameLayout(c);
        content.setBackgroundColor(gray);
        content.setLayoutParams(wholeScreen);


        makeMagic.setOnClickListener(new OnClickListener() {@Override
        public void onClick(View view) {
            setShowContent(content);
        }
        });
    }
    public void setShowContent(FrameLayout layout){
        if(ifFrameAdded == false){
            this.removeView(empty);
            this.addView(layout);
            ifFrameAdded = true;
        }else{
            this.removeView(layout);
            this.addView(empty);
            ifFrameAdded = false;
        }

    }
    public void addText(String text, int X, int Y){
        TextView coach = new TextView(c);
        coach.setText(text);
        coach.setX(X);
        coach.setY(Y);
        content.addView(coach);
    }
    public void changeTextColor(String COLOR){
                ;
    }

}

