package org.dernegi.android.h10_d2_fragment2;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity
{

    private FragmentManager mng;
    private FragmentTransaction trs;
    private Parca1 p1;
    private Parca2 p2;

    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        //trs = mng.beginTransaction();
        trs.remove(p1);
        trs.remove(p2);
        trs.commit();
    }

    private void init()
    {
        mng = this.getSupportFragmentManager();
        trs = mng.beginTransaction();

        p1 = new Parca1();
        p2 = new Parca2();

        trs.add(R.id.pnlMain, p1);
        trs.add(R.id.pnlMain, p2);

        trs.commit();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }



}
