package org.dernegi.android.h10_d2_fragment2;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RadioButton;

/**
 * Created by aykut on 22.4.2015.
 */
public class Parca2 extends Fragment
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
        LinearLayout pnlContent = new LinearLayout(activity);
        pnlContent.setOrientation(LinearLayout.VERTICAL);
        pnlContent.setBackgroundColor(Color.RED);

        pnlContent.setLayoutParams(new LinearLayout.LayoutParams(400, ViewGroup.LayoutParams.WRAP_CONTENT));


        CheckBox chk = new CheckBox(activity);
        chk.setText("Seçenek");
        pnlContent.addView(chk);


        RadioButton rdo = new RadioButton(activity);
        rdo.setText("Seçim");
        pnlContent.addView(rdo);

        return pnlContent;
    }

}
