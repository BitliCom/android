package PL;

import android.content.Context;

import org.dernegi.android.h9_d1_db2.R;

import java.util.HashMap;

/**
 * Created by aykut on 13.4.2015.
 */
public class MenuInvoker
{
    private HashMap<Integer, Command> commands;

    public MenuInvoker(Context context, MenuReceiver mr)
    {
        commands = new HashMap<Integer, Command>();
        commands.put(R.id.mnuClear, new ClearCommand(context, mr));
        commands.put(R.id.mnuDelete, new DeleteCommand(context, mr));
        commands.put(R.id.mnuSave, new SaveCommand(context, mr));
    }

    public void Invoke(int menuID, Object prm) throws Exception
    {
        if (commands.containsKey(menuID)) {
            commands.get(menuID).Run(prm);
        } else {
            throw new Exception("Menu item was not found!");
        }
    }

}
