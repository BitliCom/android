package PL;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;

import org.dernegi.android.h9_d1_db2.R;

import BL.BaseEntity;
import BL.HatirlatmaEntity;
import DAL.BaseRepository;

/**
 * Created by aykut on 13.4.2015.
 */
public class MenuReceiver
{
    private Activity activity;
    private BaseRepository repository;

    public MenuReceiver(Context context, BaseRepository repository)
    {
        this.activity = (Activity) context;
        this.repository = repository;
    }

    public void ClearAction()
    {
        ViewGroup pnl = (ViewGroup) activity.findViewById(R.id.pnlMain);

        for (int i = 0; i <= pnl.getChildCount() - 1; ++i) {
            if (pnl.getChildAt(i) instanceof EditText) {
                ((EditText) pnl.getChildAt(i)).setText("");
            }

            if (pnl.getChildAt(i) instanceof Spinner) {
                ((Spinner) pnl.getChildAt(i)).setSelection(0);
            }
        }
    }

    public void SaveAction(HatirlatmaEntity entity)
    {
        repository.Save(entity);
    }

    public void DeleteAction(int id)
    {
        repository.Delete(id);

    }
}
