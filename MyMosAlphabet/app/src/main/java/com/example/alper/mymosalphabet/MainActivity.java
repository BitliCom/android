package com.example.alper.mymosalphabet;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.hardware.Camera;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Iterator;


public class MainActivity extends ActionBarActivity {

    public PlayFlash flsh;
    EditText txt;
    TextView txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.FlashSettings) {
            return true;
        }


        return super.onOptionsItemSelected(item);
    }

    public void Yayinla(View vw) {
        txt = ((EditText) findViewById(R.id.mosText));
        String str = txt.getText().toString();
        MorsFnc(str);
    }

    public void MorsFnc(String str) {
//        txt2 = ((TextView) findViewById(R.id.textView2));
        MorsHarf mrs = new MorsHarf();

//        ArrayList ls = mrs.parseMors(str);
//        Iterator itr = ls.iterator();

        ArrayList lst = mrs.parseMors(str);
//        int idx = 0;
//        String tmp;
//        while (itr.hasNext()) {
//            idx++;
//            txt2.setTextColor(Color.RED);
//            tmp = str.substring(0, idx);
//            txt2.setText(tmp,TextView.BufferType.EDITABLE);

//            lst.add(itr.next());
            flsh = new PlayFlash(this.getBaseContext(), lst);
            Thread t = new Thread(flsh);
            t.start();

//        }
    }

    public void ViewSettings(MenuItem item) {

    }

    public void ViewCodePage(MenuItem item) {

    }

    public void ViewMors(MenuItem item) {

    }
}
