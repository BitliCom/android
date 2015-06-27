package DAL;

import java.util.ArrayList;

import BL.BaseEntity;

/**
 * Created by aykut on 13.4.2015.
 */
public interface IRepository
{
    boolean Save(BaseEntity entity);
    boolean Delete(int id);
    BaseEntity GetRecord(int id);
    ArrayList<BaseEntity> GetRecords();
    int GetCount();
}
