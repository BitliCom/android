package PL;

import android.content.Context;

/**
 * Created by aykut on 13.4.2015.
 */
public abstract class Command
{
    protected MenuReceiver receiver;
    protected Context context;

    public MenuReceiver getReceiver()
    {
        return receiver;
    }

    protected Command(Context context,  MenuReceiver receiver)
    {
        this.context = context;
        this.receiver = receiver;
    }

    public abstract void Run(Object prm);
}
