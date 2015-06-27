package PL;

import android.content.Context;

/**
 * Created by aykut on 13.4.2015.
 */
public class ClearCommand extends Command
{
    public ClearCommand(Context context, MenuReceiver receiver)
    {
        super(context, receiver);
    }

    @Override
    public void Run(Object prm)
    {
        receiver.ClearAction();
    }
}
