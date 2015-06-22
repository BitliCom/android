package DAL;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import BL.BaseEntity;
import BL.BlankEntity;
import BL.HatirlatmaEntity;
import BL.KategoriEntity;

/**
 * Created by aykut on 13.4.2015.
 */
public class HatirlatmaRepository extends BaseRepository
{
    public static final String TABLE_NAME = "Hatirlatmalar";
    public static final String ID = "_id";
    public static final String KATEGORI_NO = "KategoriNo";
    public static final String BASLIK = "Baslik";
    public static final String METIN = "Metin";
    public static final String TARIH = "Tarih";




    public HatirlatmaRepository(Context context)
    {
        super(context);
    }

    @Override
    public int GetCount()
    {
        int r = 0;
        SQLiteDatabase db = mDbg.getReadableDatabase();
        Cursor cur = db.rawQuery("Select Count(*) from " + TABLE_NAME, null);
        cur.moveToNext();
        r = cur.getInt(0);
        mDbg.close();
        return r;
    }

    @Override
    public ArrayList<BaseEntity> GetRecords()
    {
        SQLiteDatabase db = mDbg.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, new String[]{ID, BASLIK, METIN, TARIH, KATEGORI_NO}, "", null, "", "", "");

        ArrayList<BaseEntity> lst = new ArrayList<BaseEntity>(cursor.getCount());

        while (cursor.moveToNext()) {
            HatirlatmaEntity entity = new HatirlatmaEntity(
                    cursor.getInt(cursor.getColumnIndex(ID)),
                    cursor.getString(cursor.getColumnIndex(BASLIK)),
                    cursor.getString(cursor.getColumnIndex(METIN)),
                    cursor.getString(cursor.getColumnIndex(TARIH)),
                    cursor.getInt(cursor.getColumnIndex(KATEGORI_NO))
                    );
            lst.add(entity);
        }

        db.close();
        return lst;
    }

    @Override
    public BaseEntity GetRecord(int id)
    {
        BaseEntity entity = null;
        SQLiteDatabase db = mDbg.getReadableDatabase();

        Cursor cursor = db.query(TABLE_NAME, new String[]{ID, BASLIK, METIN, TARIH, KATEGORI_NO}, ID + " = ?", new String[]{String.valueOf(id)}, "", "", "");

        if (cursor.moveToNext()) {

            entity = new HatirlatmaEntity(
                    cursor.getInt(cursor.getColumnIndex(ID)),
                    cursor.getString(cursor.getColumnIndex(BASLIK)),
                    cursor.getString(cursor.getColumnIndex(METIN)),
                    cursor.getString(cursor.getColumnIndex(TARIH)),
                    cursor.getInt(cursor.getColumnIndex(KATEGORI_NO))
            );
        } else {
            entity = new BlankEntity();
        }
        mDbg.close();
        return entity;
    }

    @Override
    public boolean Delete(int id)
    {
        SQLiteDatabase db = mDbg.getWritableDatabase();
        int i = db.delete(TABLE_NAME, ID + " = ?", new String[]{String.valueOf(id)});
        db.close();
        return (i != 0);
    }

    @Override
    public boolean Save(BaseEntity entity)
    {
        HatirlatmaEntity e = (HatirlatmaEntity)  entity;
        SQLiteDatabase db = mDbg.getWritableDatabase();

        ContentValues cv = new ContentValues();
        cv.put(ID, e.getID());
        cv.put(BASLIK, e.getBaslik());
        cv.put(METIN, e.getMetin());
        cv.put(TARIH, e.getTarih());
        cv.put(KATEGORI_NO, e.getKategoriNo());

        long i = 0;

        if (e.getID() == 0)
        {
            i =  db.insert(TABLE_NAME, null, cv);
        }
        else
        {
            i = db.update(TABLE_NAME, cv, ID + " = ?", new String[]{String.valueOf(e.getID())});
        }
        return (i != 0);
    }
}
