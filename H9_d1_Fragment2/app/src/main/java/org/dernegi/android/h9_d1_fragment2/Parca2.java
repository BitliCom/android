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
public class Parca2 extends Fragment
{
    private Context context;

    public Parca2(Context context)
    {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        LinearLayout pnlContent = new LinearLayout(context);
        pnlContent.setOrientation(LinearLayout.VERTICAL);
        pnlContent.setBackgroundColor(Color.LTGRAY);

        // ...

        return pnlContent;
    }
}
