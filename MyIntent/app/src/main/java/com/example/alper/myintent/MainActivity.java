package com.example.alper.myintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    public static final String EXTRA_MESSAGE = "com.example.alper.myintent.MESSAGE";
    public static final String SAVED_MESSAGE = "com.example.alper.myintent.SAVED";
    String message = ">";
    String message2 = ":";
    int looper = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) { // Restore the archived instance state
            this.message2 = savedInstanceState.getString(SAVED_MESSAGE);
        } else { // Initialize with default values
            this.message2 = ":";
        }
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

    public void nextPage(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        Button button = (Button) view;
        message = button.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        intent.putExtra(SAVED_MESSAGE, message2);
        startActivity(intent);

    }

    /**
     * This is the same as {@link #onSaveInstanceState} but is called for activities
     * created with the attribute {@link android.R.attr#persistableMode} set to
     * <code>persistAcrossReboots</code>. The {@link android.os.PersistableBundle} passed
     * in will be saved and presented in {@link #onCreate(android.os.Bundle, android.os.PersistableBundle)}
     * the first time that this activity is restarted following the next device reboot.
     *
     * @param outState Bundle in which to place your saved state.
     * @see #onSaveInstanceState(android.os.Bundle)
     * @see #onCreate
     * @see #onRestoreInstanceState(android.os.Bundle, android.os.PersistableBundle)
     * @see #onPause
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        message2 = message2 + "-" + looper + "-";
        outState.putString(SAVED_MESSAGE, message2);
        looper = looper + 1;
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onStop() {
        Bundle savedInstanceState = new Bundle(10);
        //savedInstanceState.putString(SAVED_MESSAGE, message2);
        onSaveInstanceState(savedInstanceState);
        super.onStop();
    }
}
