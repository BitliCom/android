package com.example.alper.mylistview;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.alper.mylistview.R;

public class MainActivity extends Activity {
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] data = new String[]{"Item 1", "Item 2", "Item 3", "Item 4"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);
/*        listView.setOnClickListener(
                new ListView.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String s = ((String) listView.getSelectedItem());
                       // Log.e("ALPER",s);
                       // Intent itn = new Intent(s);
                        setContentView(R.layout.activity_main_activity2);
                    }

                }

        );*/
    }
}