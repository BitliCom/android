package com.example.alper.myfilesave;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;


public class MainActivity extends ActionBarActivity {


    private EditText fileNameSave, fileContentSave;
    TextView fileContent;

    FileOutputStream outputStream;
    FileInputStream inputStream;
    String str2 = "";

    private void init() {
        fileNameSave = (EditText) findViewById(R.id.fileNameSave);
        fileContentSave = (EditText) findViewById(R.id.fileContentSave);
        fileContent = (TextView) findViewById(R.id.fileContent);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
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

    public void saveFile(View v) {
        String str1 = fileNameSave.getText().toString();
        str2 = fileContentSave.getText().toString();

        try {
            if (!str2.isEmpty()) {
                outputStream = openFileOutput(str1, Context.MODE_PRIVATE);
                outputStream.write(str2.getBytes());
                outputStream.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void readFile(View v) {
        String str1 = fileNameSave.getText().toString();

        if (!str2.isEmpty()) {
            InputStream in = null;
            try {
                FileInputStream finp =  this.getApplicationContext().openFileInput(str1);
                in = new BufferedInputStream(finp);
                byte[] bfr = new byte[in.available()];
                in.read(bfr);

                String strRead = new String(bfr);//Arrays.toString(bfr);
                Log.e("alper",strRead);
                fileContent.setText(strRead);
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    try {
                        in.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

}
