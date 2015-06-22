package PL;

import android.content.Context;

import BL.HatirlatmaEntity;

/**
 * Created by aykut on 13.4.2015.
 */
public class SaveCommand extends Command
{

    public SaveCommand(Context context, MenuReceiver receiver)
    {
        super(context, receiver);
    }

    @Override
    public void Run(Object prm)
    {
        receiver.SaveAction((HatirlatmaEntity) prm);
    }

}
