package PL;

import android.app.Activity;
import android.util.Log;
import android.view.Menu;

import org.dernegi.android.h9_d1_db2.R;

import DAL.BaseRepository;

/**
 * Created by aykut on 13.4.2015.
 */
public class MenuHelper
{
    private Activity activity;
    private MenuInvoker invoker;
    private MenuReceiver mr;
    private BaseRepository repository;

    public MenuHelper(Activity activity, BaseRepository repository)
    {
        this.activity = activity;
        mr = new MenuReceiver(activity, repository);
    }

    public boolean Build(Menu m)
    {
        activity.getMenuInflater().inflate(R.menu.menu_main, m);
        return true;
    }

    public boolean ItemClick(int id, Object prm)
    {
        try {
            invoker.Invoke(id, prm);
            return true;
        } catch (Exception e) {
            Log.e("CSD", e.getMessage());
        }
    }
}
