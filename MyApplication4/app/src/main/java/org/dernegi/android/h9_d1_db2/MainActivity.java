package org.dernegi.android.h9_d1_db2;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Spinner;

import PL.MenuHelper;


public class MainActivity extends ActionBarActivity
{
    private Spinner spnHatirlatma, spnKategori;
    private EditText txtBaslik, txtMetin, txtTarih;
    private MenuHelper menuHelper;

    private void init()
    {
        spnHatirlatma = (Spinner) findViewById(R.id.spnHatirlatma);
        spnKategori = (Spinner) findViewById(R.id.spnKategori);

        txtBaslik = (EditText) findViewById(R.id.txtBaslik);
        txtMetin = (EditText) findViewById(R.id.txtMetin);
        txtTarih = (EditText) findViewById(R.id.txtTarih);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        return menuHelper.Build(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
      //   menuHelper.ItemClick(item.getItemId(), );
        // Burdan devam
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

}
