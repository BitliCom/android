package com.example.alper.mycalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    HesapMakine mkn = new HesapMakine();
    float n1, n2, n3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.

        //getMenuInflater().inflate(R.menu.menu_main, menu);

        MenuItem i1 = menu.add("Renk");
        i1.setOnMenuItemClickListener(
                new MenuItem.OnMenuItemClickListener()
                {
                    @Override
                    public boolean onMenuItemClick(MenuItem item)
                    {
                        MainActivity.this.setTitle("REnk Değişti");
                        TextView vw = (TextView) findViewById(R.id.textView1);
                        if(vw != null) {
                            vw.setBackgroundColor(Color.RED);
                            RelativeLayout rl = (RelativeLayout) vw.getParent();
                            rl.setBackgroundColor(Color.YELLOW);
                        }
                        return true;
                    }
                }
        );

        MenuItem i2 = menu.add("Help");
        i2.setOnMenuItemClickListener(
                new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(MainActivity.this, "Yardım", Toast.LENGTH_LONG).show();
                        return true;
                    }
                }
        );

        MenuItem i3 = menu.add("Temiz Ekran");
        i3.setOnMenuItemClickListener(
                new MenuItem.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        View vw3 = MainActivity.this.getLayoutInflater().inflate(R.layout.activity_main_activity_blank, null);
                        MainActivity.this.setContentView(vw3);
                        return true;
                    }
                }
        );        return true;
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) return true;
        return super.onOptionsItemSelected(item);
    }

    public void Bol_Clk(View v) {

      //  Log.e("HEEELLLOOO");

        EditText txt = ((EditText) findViewById(R.id.editText));
        String str = txt.getText().toString();
        n1 = Float.parseFloat(str);
        txt = ((EditText) findViewById(R.id.editText2));
        str = txt.getText().toString();
        n2 = Float.parseFloat(str);
       // n3 = n1/n2;

        mkn.Bol(n1,n2);
        n3 = mkn.getSonuc();

        TextView vw = (TextView) findViewById(R.id.textView1);
        str = Float.toString(n3);
        vw.setText(str );

    }

    public void Carp_Clk(View v) {

        //  Log.e("HEEELLLOOO");

        EditText txt = ((EditText) findViewById(R.id.editText));
        String str = txt.getText().toString();
        n1 = Float.parseFloat(str);
        txt = ((EditText) findViewById(R.id.editText2));
        str = txt.getText().toString();
        n2 = Float.parseFloat(str);
        n3 = n1*n2;

        TextView vw = (TextView) findViewById(R.id.textView1);
        str = Float.toString(n3);
        vw.setText(str );

    }    public void Cikart_Clk(View v) {

        //  Log.e("HEEELLLOOO");

        EditText txt = ((EditText) findViewById(R.id.editText));
        String str = txt.getText().toString();
        n1 = Float.parseFloat(str);
        txt = ((EditText) findViewById(R.id.editText2));
        str = txt.getText().toString();
        n2 = Float.parseFloat(str);
        n3 = n1-n2;

        TextView vw = (TextView) findViewById(R.id.textView1);
        str = Float.toString(n3);
        vw.setText(str );

    }
    public void Topla_Clk(View v) {

        //  Log.e("HEEELLLOOO");

        EditText txt = ((EditText) findViewById(R.id.editText));
        String str = txt.getText().toString();
        n1 = Float.parseFloat(str);
        txt = ((EditText) findViewById(R.id.editText2));
        str = txt.getText().toString();
        n2 = Float.parseFloat(str);
        n3 = n1+n2;

        TextView vw = (TextView) findViewById(R.id.textView1);
        str = Float.toString(n3);
        vw.setText(str );

    }
}
