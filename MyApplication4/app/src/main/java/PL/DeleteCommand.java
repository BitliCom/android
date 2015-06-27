package PL;

import android.content.Context;

/**
 * Created by aykut on 13.4.2015.
 */
public class DeleteCommand extends Command
{

    public DeleteCommand(Context context, MenuReceiver receiver)
    {
        super(context, receiver);
    }

    @Override
    public void Run(Object prm)
    {
        receiver.DeleteAction(Integer.valueOf(prm.toString()));
    }

}
