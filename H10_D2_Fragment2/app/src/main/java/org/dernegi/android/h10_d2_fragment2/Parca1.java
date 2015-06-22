package org.dernegi.android.h10_d2_fragment2;

import android.app.Activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by aykut on 22.4.2015.
 */
public class Parca1 extends Fragment
{

    private Activity activity;

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        this.activity = activity;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        LinearLayout pnlLinks = new LinearLayout(activity);
        pnlLinks.setOrientation(LinearLayout.VERTICAL);
        pnlLinks.setBackgroundColor(Color.BLUE);
        pnlLinks.setLayoutParams(new LinearLayout.LayoutParams(200, ViewGroup.LayoutParams.WRAP_CONTENT));


        for (int i = 1; i <= 5; ++i) {
            Button btn = new Button(activity);
            btn.setText("Link " + i);
            pnlLinks.addView(btn);
        }

        return pnlLinks;
    }
}
