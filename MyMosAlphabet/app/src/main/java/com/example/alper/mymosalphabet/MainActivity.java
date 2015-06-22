package com.example.alper.mymosalphabet;

import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    public PlayFlash flsh;

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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void Yayinla(View vw) {
        EditText txt = ((EditText) findViewById(R.id.mosText));
        String str = txt.getText().toString();

        MorsFnc(str);
    }

    public void MorsFnc(String str) {
        MorsHarf mrs = new MorsHarf();
        ArrayList lst = mrs.parseMors(str);
        Log.e("ALPER", str);
        flsh = new PlayFlash(this.getBaseContext(), lst);
        Thread t = new Thread(flsh);
        t.start();

    }

}