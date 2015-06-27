package org.dernegi.android.h9_d1_fragment2;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by aykut on 20.4.2015.
 */
public class Parca1 extends Fragment
{
    private Context context;

    public Parca1(Context context)
    {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        LinearLayout pnlLinks = new LinearLayout(context);
        pnlLinks.setOrientation(LinearLayout.VERTICAL);
        pnlLinks.setBackgroundColor(Color.BLUE);

        for (int i = 1; i <= 5; ++i) {
            Button btn = new Button(context);
            btn.setText("Link " + i);
            pnlLinks.addView(btn);
        }

        return pnlLinks;
    }
}
