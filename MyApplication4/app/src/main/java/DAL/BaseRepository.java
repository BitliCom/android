package DAL;

import android.content.Context;

import java.util.ArrayList;

import BL.BaseEntity;

/**
 * Created by aykut on 13.4.2015.
 */
public abstract class BaseRepository implements  IRepository
{
    protected DbGateway mDbg;
    protected Context mContext;

    protected BaseRepository(Context context)
    {
        mDbg = new DbGateway(context);
    }

    public abstract int GetCount();
    public abstract ArrayList<BaseEntity> GetRecords();
    public abstract BaseEntity GetRecord(int id);
    public abstract boolean Delete(int id);
    public abstract boolean Save(BaseEntity entity);

}
