package mobil.ytu.edu.tr.h5_d1_dekleratifresourcekullanimi;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = this.getResources();

        Drawable drawable = res.getDrawable(R.drawable.ampul);

        String str = res.getString(R.string.str);



       String dizi[] =  res.getStringArray(R.array.arr);

        TextView txt = (TextView) findViewById(R.id.txt);


        String cikti = "";

        for (String s : dizi)
        {
            cikti += s + "\n\r";

        }

        txt.setText(cikti);

      

    }


}
